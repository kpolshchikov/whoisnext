# whoisnext
Небольшая утилита командной строки для выбора следующего на своей свадьбе.

# Сборка
Для сборки вам потребуется GraalVM native-image

Скрипт для сборки
```bash
./mvnw clean package && $GRAALVM_HOME/bin/native-image -jar target/whoisnext-1.0-jar-with-dependencies.jar && mv whoisnext-1.0-jar-with-dependencies whoisnext
```

# Пример использования
```bash
path/to/whoisnext "Иванов Иван" "Петров Петя" "Кто-то еще"
```