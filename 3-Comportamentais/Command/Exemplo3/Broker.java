package org.marianaduarte.command;

import java.util.ArrayList;

//Invoker
public class Broker {
    ArrayList<Order> orderList = new ArrayList<>();

    public void takeOrder(Order order){
        orderList.add(order);
    }

    public void placeOrders(){
        for(Order order : orderList){
            order.execute();
        }
        orderList.clear();
    }
}
