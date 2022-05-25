package org.marianaduarte.iterator;

public class MostraMenu {
    public static void main(String[] args) {
        MenuItem[] menuItems = new MenuItem[4];

        menuItems[0] = new MenuItem("Coca-Cola");
        menuItems[1] = new MenuItem("Pepsi");
        menuItems[2] = new MenuItem("Guaraná Antartica");
        menuItems[3] = new MenuItem("Kuat");

        Iterator menuIterator = new MenuIterator(menuItems);
        while(menuIterator.hasNext()){
            MenuItem menuItem = (MenuItem)menuIterator.next();
            System.out.println(menuItem.nome);
        }
    }
}
