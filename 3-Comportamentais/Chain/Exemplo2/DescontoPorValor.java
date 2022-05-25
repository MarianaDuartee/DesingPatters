package org.marianaduarte.chain;


public class DescontoPorValor implements Desconto{
    private Desconto proximo;
    @Override
    public double calcular(Pedido pedido){
        double valorComDesconto = pedido.getValorTotal();
        if(pedido.getValorTotal() > 1000){
            valorComDesconto -= (pedido.getValorTotal()*0.10);
            return valorComDesconto;
        }
        else{
            return proximo.calcular(pedido);
        }
    }
    @Override
    public void setProximo(Desconto proximo){
        this.proximo = proximo;
    }
}
