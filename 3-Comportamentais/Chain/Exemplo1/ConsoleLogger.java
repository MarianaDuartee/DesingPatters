package org.marianaduarte.chain;

public class ConsoleLogger extends Logger{
    public ConsoleLogger(int levels){
        this.levels = levels;
    }
    @Override
    protected void write(String msg) {
        System.out.println("Standard Console::Logger: "+msg);
    }
}
