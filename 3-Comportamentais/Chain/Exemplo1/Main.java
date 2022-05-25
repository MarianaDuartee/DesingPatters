package org.marianaduarte.chain;

public class Main {
    private static Logger getChainOfLoggers(){
        Logger errorLogger = new ErrorLogger(Logger.ERROR);
        Logger fileLogger = new FileLogger(Logger.DEUBG);
        Logger consoleLogger = new ConsoleLogger(Logger.INFO);

        errorLogger.setNextLevelLogger(fileLogger);
        fileLogger.setNextLevelLogger(consoleLogger);

        return errorLogger;
    }
    public static void main(String[] args) {
        Logger loggerChain = getChainOfLoggers();
        loggerChain.logMessage(Logger.INFO,"This is an information.");
        loggerChain.logMessage(Logger.DEUBG,"This is an debug level information");
        loggerChain.logMessage(Logger.ERROR,"This is an error information");
    }
}