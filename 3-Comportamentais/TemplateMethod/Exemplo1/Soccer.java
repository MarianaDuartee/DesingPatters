package org.marianaduarte.templatemethod;

public class Soccer extends Game{
    @Override
    void intialize() {
        System.out.println( "Jogo de futebol inicializado! Comece a jogar." );
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
