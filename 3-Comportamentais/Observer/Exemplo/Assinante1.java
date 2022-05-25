package org.marianaduarte.observer;

import java.util.Observable;
import java.util.Observer;

public class Assinante1 implements Observer {
    Observable revistaInformatica;
    int edicaoNovaRevista;

    public Assinante1(Observable revistaInformatica){
        this.revistaInformatica = revistaInformatica;
        revistaInformatica.addObserver(this);
    }
    @Override
    public void update(Observable o, Object arg) {
        if(o instanceof RevistaInformatica){
            RevistaInformatica revistaInformatica = (RevistaInformatica)o;
            edicaoNovaRevista = revistaInformatica.getEdicao();
            System.out.println("ATENÇÃO!!\nAcabou de chegar mais uma edição da Revista Informatica." +
                    "Esta é sua edição numero: "+edicaoNovaRevista);
        }

    }
}
