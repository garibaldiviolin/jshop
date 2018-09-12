rem Compiling application for the first time
mvn --batch-mode clean package
rem java -javaagent:springloaded.jar -noverify -jar jshop-debug.jar

rem Running Application
rem mvn spring-boot:run

rem Compiling while application is running
rem mvn compile
