package org.marianaduarte.chain;

public class ObjA extends ChainObject{
    @Override
    public String tratamento(String request) {
        return super.tratamento(request+" | ObjA |");
    }
}
