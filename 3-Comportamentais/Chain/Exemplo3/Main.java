package org.marianaduarte.chain;

public class Main {
    public static void main(String[] args) {
        ObjA objA = new ObjA();
        objA.adcProximo(new ObjB()).adcProximo(new ObjB()).adcProximo(new ObjA());
        System.out.println(objA.tratamento("Inicio"));
    }
}