package org.marianaduarte.chain;

public interface Desconto {
    double calcular(Pedido pedido);
    void setProximo(Desconto proximo);
}
