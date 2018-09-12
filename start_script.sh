# Compiling application for the first time
call mvn --batch-mode clean package
# java -javaagent:springloaded.jar -noverify -jar jshop-debug.jar

# Running Application
# mvn spring-boot:run

# Compiling while application is running
# mvn compile
