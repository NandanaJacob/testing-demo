// Main class to demonstrate the logging functionality
public class LoggerInterfaceEncapsulation{
    public static void main(String[] args) {
        Logger fileLogger = new FileLogger(); // Create a FileLogger
        Application appWithFileLogger = new Application(fileLogger); // Use FileLogger
        appWithFileLogger.performApplicationTask(); // Perform task with FileLogger

        System.out.println(); // Print a blank line for separation

        Logger databaseLogger = new DatabaseLogger(); // Create a DatabaseLogger
        Application appWithDatabaseLogger = new Application(databaseLogger); // Use DatabaseLogger
        appWithDatabaseLogger.performApplicationTask(); // Perform task with DatabaseLogger
    }
}
