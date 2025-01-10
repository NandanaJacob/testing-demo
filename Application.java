// Application class that uses Logger
class Application {
    private Logger logger; // Encapsulated logger

    public Application(Logger logger) {
        this.logger = logger; // Set the logger via constructor
    }

    // Method to perform some application task
    public void performApplicationTask() {
        logger.logInfo("Application task started."); // Log info
        // Simulate an error
        logger.logError("An error occurred during the task."); // Log error
        logger.logInfo("Application task finished."); // Log info
    }
}
