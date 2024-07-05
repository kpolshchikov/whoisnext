package io.github.kpolshchikov;

import picocli.CommandLine;
import picocli.CommandLine.Command;
import picocli.CommandLine.Parameters;

import java.security.SecureRandom;
import java.util.List;
import java.util.concurrent.Callable;

@Command(name = "whoisnext", mixinStandardHelpOptions = true, version = "whoisnext 1.0")
public class WhoIsNext implements Callable<Integer> {

    @Parameters(description = "the persons who participates in the lottery")
    List<String> participants;

    private final SecureRandom random = new SecureRandom();

    @Override
    public Integer call() throws Exception {
        int winnerIndex = random.nextInt(participants.size());
        System.out.printf("%s ты следующий.%n", participants.get(winnerIndex));
        return 0;
    }

    public static void main(String[] args) {
        int exitCode = new CommandLine(new WhoIsNext()).execute(args);
        System.exit(exitCode);
    }
}