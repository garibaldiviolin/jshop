mvn clean package
java -javaagent:springloaded.jar -noverify -cp target/jshop-debug.jar br.marketplace.App
