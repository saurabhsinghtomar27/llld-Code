// import ChainResponsiblity_Pattern.LogProcessor;

class infologProcessor extends LogProcessor {
   infologProcessor(LogProcessor nextProcessor) {
        super(nextProcessor);
    }
@Override
public void log(int level, String message) {
    if (level == INFO) {
        System.out.println("INFO: " + message);
    } else {
        super.log(level, message);
    }
}
}