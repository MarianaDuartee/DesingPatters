package org.marianaduarte.chain;

import com.sun.net.httpserver.Filter;

public abstract class ChainObject {
    protected ChainObject next;

    public ChainObject adcProximo(ChainObject next){
        this.next = next;
        return next;
    }
    public String tratamento(String request){
        if(this.next != null){
            return  this.next.tratamento(request);
        }
        return request;
    }
}
