package command;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class SLF4JExample {
    private static Logger logger = LoggerFactory.getLogger(SLF4JExample.class);

    public static void main(String[] args) {
        logger.trace("Trace log");
        logger.debug("Debug log");
        logger.info("Info log");
        logger.warn("Warn log");
        logger.error("Error log");
    }
}
