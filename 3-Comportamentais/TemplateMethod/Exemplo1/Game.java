package org.marianaduarte.templatemethod;

public abstract class Game {
    abstract void intialize();
    abstract void start();
    abstract void end();

    //O template method que define a ordem de execução
    public final void play(){
        intialize();
        start();
        end();
    }
}
