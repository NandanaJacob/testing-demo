// DatabaseLogger class implementing Logger interface
class DatabaseLogger implements Logger {
    @Override
    public void logInfo(String message) {
        System.out.println("DatabaseLogger - INFO: " + message); // Log info to database
    }

    @Override
    public void logError(String message) {
        System.out.println("DatabaseLogger - ERROR: " + message); // Log error to database
    }
}
