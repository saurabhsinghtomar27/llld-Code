public class DebugProcessor extends LogProcessor {
    DebugProcessor(LogProcessor nextProcessor) {
        super(nextProcessor);
    }
    @Override
    public void log(int level, String message) {
        if (level == DEBUG) {
            System.out.println("DEBUG: " + message);
        } else {
            super.log(level, message);
        }
    }
    
}
