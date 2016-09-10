package infrastructure.logging;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class LoggingInvocationHandler implements InvocationHandler {

    private final LoggingService loggingService;

    public LoggingInvocationHandler(LoggingService loggingService) {
        this.loggingService = loggingService;
    }

    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        if(method.getName().equals("logSensitiveInfo")) {
            args[0] = "*****";
        }
        return method.invoke(loggingService, args);
    }

}
