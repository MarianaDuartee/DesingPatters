package org.marianaduarte.chain;

public class ErrorLogger extends Logger{
    public ErrorLogger(int levels){
        this.levels = levels;
    }
    @Override
    protected void write(String msg){
        System.out.println("Error Console::Logger: "+msg);
    }
}
