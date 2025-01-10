// FileLogger class implementing Logger interface
class FileLogger implements Logger {
    @Override
    public void logInfo(String message) {
        System.out.println("FileLogger - INFO: " + message); // Log info to file
    }

    @Override
    public void logError(String message) {
        System.out.println("FileLogger - ERROR: " + message); // Log error to file
    }
}
