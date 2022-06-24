package LoggingFramework;

import LoggingFramework.category.AbstractLogger;
import LoggingFramework.category.DebugLogger;
import LoggingFramework.category.ErrorLogger;
import LoggingFramework.category.InfoLogger;
import LoggingFramework.sink.ConsoleLogger;
import LoggingFramework.sink.FileLogger;
import LoggingFramework.sink.LogSubject;

public class LogManager {
    protected static AbstractLogger buildChainOfLogger(){
        AbstractLogger infoLogger = new InfoLogger(1);
        AbstractLogger errorLogger = new ErrorLogger(2);
        AbstractLogger debugLogger = new DebugLogger(3);

        infoLogger.setNextLoggingLevel(errorLogger);
        errorLogger.setNextLoggingLevel(debugLogger);

        return infoLogger;
    }

    protected static LogSubject buildLogSubject(){
        LogSubject logSubject = new LogSubject();
        ConsoleLogger consoleLogger = new ConsoleLogger();
        FileLogger fileLogger = new FileLogger();

        logSubject.addObserver(1, consoleLogger);
        logSubject.addObserver(2, consoleLogger);

        logSubject.addObserver(1, fileLogger);
        logSubject.addObserver(3, fileLogger);

        return logSubject;
    }
}
