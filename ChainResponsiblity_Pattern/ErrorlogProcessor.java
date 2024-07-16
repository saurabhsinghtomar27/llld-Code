public class ErrorlogProcessor extends LogProcessor {
    ErrorlogProcessor(LogProcessor nextProcessor) {
        super(nextProcessor);
    }
    @Override
    public void log(int level, String message) {
        if (level == ERROR) {
            System.out.println("ERROR: " + message);
        } else {
            super.log(level, message);
        }
    }
    
}
