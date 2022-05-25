package org.marianaduarte.chain;

public class Main {
    public static void main(String[] args) {
       Pedido pedido = new Pedido();
       pedido.adicionarItens("Camisa",100);
       pedido.adicionarItens("Moletom",300);
       pedido.adicionarItens("Short",100);
       pedido.adicionarItens("Bota",200);
       pedido.adicionarItens("Calça",350);

       Desconto descontoPorItem = new DescontoPorItens();
       Desconto descontoPorValor = new DescontoPorValor();
       Desconto semDesconto = new SemDesconto();

       descontoPorItem.setProximo(descontoPorValor);
       descontoPorValor.setProximo(semDesconto);

       double valor = descontoPorItem.calcular(pedido);
       System.out.println("Valor total R$"+pedido.getValorTotal()+"\nValor com desconto R$"+valor);
    }
}