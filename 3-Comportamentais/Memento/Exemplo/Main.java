package org.marianaduarte.memento;

public class Main {
    public static void main(String[] args) {
        Originator originator = new Originator();
        Caretaker caretaker = new Caretaker();

        originator.setState("State 1");
        caretaker.add(originator.saveState());
        originator.setState("State 2");
        caretaker.add(originator.saveState());
        originator.setState("State 3");
        caretaker.add(originator.saveState());
        originator.setState("State 4");
        caretaker.add(originator.saveState());

        System.out.println("Estado atual: "+originator.getState());
        originator.restore(caretaker.get(0));
        System.out.println("1º Estado salvo: "+originator.getState());
        originator.restore(caretaker.get(1));
        System.out.println("2º Estado salvo: "+originator.getState());
        originator.restore(caretaker.get(2));
        System.out.println("3º Estado salvo: "+originator.getState());

    }
}