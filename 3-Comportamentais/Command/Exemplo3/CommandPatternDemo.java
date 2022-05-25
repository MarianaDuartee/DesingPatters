package org.marianaduarte.command;

public class CommandPatternDemo {
    public static void main(String[] args) {
        //Receiver
        Stock abcStock = new Stock("ABC",100);

        //Commands
        BuyStock buyStock = new BuyStock(abcStock);
        SellStock sellStock = new SellStock(abcStock);

        //Invoker
        Broker broker = new Broker();
        broker.takeOrder(buyStock);
        broker.takeOrder(sellStock);

        broker.placeOrders();
    }
}
