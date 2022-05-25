package org.marianaduarte.chain;


public class SemDesconto implements Desconto{
    @Override
    public double calcular(Pedido pedido) {
        return pedido.getValorTotal();
    }

    @Override
    public void setProximo(Desconto proximo) {
    }
}
