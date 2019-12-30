import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class LoggerClass {
    private static Logger logger=LoggerFactory.getLogger(Logger.class);

    public static void main(String[] args) {
        logger.warn("WARN");
        logger.info("INFO");
        logger.error("ERROR");
    }
}
