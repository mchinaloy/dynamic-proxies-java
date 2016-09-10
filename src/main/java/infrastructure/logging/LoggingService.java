package infrastructure.logging;

public interface LoggingService {

    void logInfo(String output);

    void logSensitiveInfo(String output);

}
