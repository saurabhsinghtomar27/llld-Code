// package ChainResponsiblity_Pattern;

public abstract class LogProcessor {
    public static int INFO = 1;
    public static int DEBUG = 2;
    public static int ERROR = 3;
    LogProcessor nextProcessor;
   public LogProcessor(LogProcessor nextProcessor) {
        this.nextProcessor = nextProcessor;
    }
    public void log(int level, String message) {
        if (this.nextProcessor != null) {
            this.nextProcessor.log(level, message);
        }
    }
    
}
