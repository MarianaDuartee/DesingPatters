package org.marianaduarte.singleton;

public class Main {
    public static void main(String[] args) {
        Singleton1 instancia1 = Singleton1.getInstance();
        instancia1.addUser(new User("Mariana",21));
        instancia1.addUser(new User("Ana",17));
        instancia1.listUsers();

    }
}