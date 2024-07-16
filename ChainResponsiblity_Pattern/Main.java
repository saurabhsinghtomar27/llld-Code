public class Main {
    public static void main(String[] args) {
        LogProcessor logger = new ErrorlogProcessor(new DebugProcessor(new infologProcessor(null)));
        logger.log(LogProcessor.INFO, "This is an information.");
        logger.log(LogProcessor.DEBUG, "This is a debug level information.");
        logger.log(LogProcessor.ERROR, "This is an error information.");
    }
    
}
