mvn --batch-mode clean package
java -javaagent:springloaded.jar -noverify -jar target/jshop-debug.jar
