package org.marianaduarte.chain;

import java.math.BigDecimal;
import java.util.ArrayList;

public class Pedido {
    private ArrayList<String> itens = new ArrayList<>();
    private double valorTotal;

    public void adicionarItens(String item, double valor){
        itens.add(item);
        valorTotal += valor;
    }

    public ArrayList<String> getItens() {
        return itens;
    }

    public double getValorTotal() {
        return valorTotal;
    }
}
