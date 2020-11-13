package ru.x5.java05_1;

public class LoggerFactory {
    public Logger getLogger(LoggerType loggerType) {
        Logger returnLogger = null;
        switch (loggerType) {
            case CONSOLELOGGER:
                returnLogger = new ConsoleLogger();
                break;
            case FILELOGGER:
                returnLogger = new FileLogger();
                break;
            case DBLOGGER:
                returnLogger = new DbLogger();
                break;
            default:
                System.out.println("Error: wrong logger type: " + loggerType);
        }
        return returnLogger;
    }
}
