package org.marianaduarte.templatemethod;

public class Chess extends Game{
    @Override
    void intialize() {
        System.out.println( "Jogo de xadrez inicializado! Comece a jogar." );
    }

    @Override
    void start() {
        System.out.println( "Jogo iniciado! Comece a jogar." );
    }

    @Override
    void end() {
        System.out.println( "Jogo finalizado" );
    }
}
