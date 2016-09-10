package infrastructure.logging;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class LoggingServiceImpl implements LoggingService {

    private static final Logger LOGGER = LoggerFactory.getLogger(LoggingServiceImpl.class);

    public void logInfo(String output) {
        LOGGER.info(output);
    }

    public void logSensitiveInfo(String output) {
        LOGGER.info(output);
    }

}
