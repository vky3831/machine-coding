package LoggingFramework;

public class PlayLogger {
    public static void main(String[] args) {
        Logger logger = Logger.getInstance();
        logger.info("info abc");
        logger.error("error pqr");
        logger.debug("debug xyz");
    }
}
