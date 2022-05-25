package org.marianaduarte.chain;

public class ObjB extends ChainObject{
    @Override
    public String tratamento(String request) {
        return super.tratamento(request+" | ObjB |");
    }
}
