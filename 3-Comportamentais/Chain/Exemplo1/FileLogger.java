package org.marianaduarte.chain;

public class FileLogger extends Logger{
    public FileLogger(int levels){
        this.levels = levels;
    }
    @Override
    protected void write(String msg) {
        System.out.println("File::Logger: "+msg);
    }
}
