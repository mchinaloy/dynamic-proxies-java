import java.lang.reflect.Proxy;

public class ProxyApp {

    public static void main(String[] args) {
        LoggingService loggingService = new ProxyApp().createLoggingProxy();
        loggingService.logInfo("Hello!");
        loggingService.logSensitiveInfo("Password1");
    }

    private LoggingService createLoggingProxy() {
        LoggingService loggingService = new LoggingServiceImpl();
        LoggingInvocationHandler loggingInvocationHandler = new LoggingInvocationHandler(loggingService);
        return (LoggingService) Proxy.newProxyInstance(loggingService.getClass().getClassLoader(),
                new Class[] { LoggingService.class },
                loggingInvocationHandler);
    }

}
