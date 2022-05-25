package org.marianaduarte.chain;


public class DescontoPorItens implements Desconto {
    private Desconto proximo;

    @Override
    public double calcular(Pedido pedido) {
        double valorComDesconto = pedido.getValorTotal();
        if(pedido.getItens().size() > 10){
            valorComDesconto -= (pedido.getValorTotal()*0.5);
            return valorComDesconto;
        }
        else{
            return proximo.calcular(pedido);
        }
    }
    @Override
    public void setProximo(Desconto proximo) {
        this.proximo = proximo;
    }
}
