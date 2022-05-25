package org.marianaduarte.observer;

public class Main {
    public static void main(String[] args) {
        int novaEdicao = 3;
        RevistaInformatica revistaInformatica = new RevistaInformatica();
        Assinante1 assinante1 = new Assinante1(revistaInformatica);
        revistaInformatica.setNovaEdicao(novaEdicao);
    }
}
