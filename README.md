# Logs's Standardization 

A simple project with Springboot to standardize logs from Log4j and Logback.

## Pré requisito
- Maven 3
- Java 8

## Preparando ambiente
### Log4J
- ```cd Log4J```
- ```mvn clean package```

### Logback
- ```cd Logback```
- ```mvn clean package```

### Change root level:
Default root level = ERROR
- export ROOT_LOG_LEVEL=INFO - create variable
- echo $ROOT_LOG_LEVEL - show value
- unset ROOT_LOG_LEVEL - remove variable

## Executando

Log4j 
- ```cd Log4J```
- ```mvn spring-boot:run```
Logback
- ```cd Logback```
- ```mvn spring-boot:run```

## Test API
- http://localhost:8080/

## Log Pattern
Log without rollout with a maximum size.
Log with 2 lines of stacktrace.
Root level with environmental variable

