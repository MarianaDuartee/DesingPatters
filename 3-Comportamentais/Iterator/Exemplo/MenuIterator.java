package org.marianaduarte.iterator;

public class MenuIterator implements Iterator{
    MenuItem[] itens;
    int posicao = 0;

    public MenuIterator(MenuItem[] itens){
        this.itens = itens;
    }
    @Override
    public boolean hasNext() {
        if(posicao >= itens.length || itens[posicao] == null){
            return false;
        }
        else{
            return true;
        }
    }
    @Override
    public Object next() {
        MenuItem menuItem = itens[posicao];
        posicao++;
        return menuItem;
    }
}
