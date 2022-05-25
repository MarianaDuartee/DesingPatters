package org.marianaduarte.chain;

public abstract class Logger {
    public static int INFO=1;
    public static int DEUBG=2;
    public static int ERROR=3;
    protected int levels;
    protected Logger nextLevelLogger;

    public void setNextLevelLogger(Logger nextLevelLogger){
        this.nextLevelLogger = nextLevelLogger;
    }
    public void logMessage(int levels, String msg){
        if(this.levels <= levels){
            write(msg);
        }
        if(nextLevelLogger != null){
            nextLevelLogger.logMessage(levels,msg);
        }
    }
    protected abstract void write(String msg);
}
