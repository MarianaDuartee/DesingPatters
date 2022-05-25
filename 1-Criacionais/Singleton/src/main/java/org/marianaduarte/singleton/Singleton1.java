package org.marianaduarte.singleton;

import java.util.ArrayList;

public class Singleton1 {
    private static Singleton1 INSTANCE;
    private ArrayList<User> users = new ArrayList<User>();
    private Singleton1(){}

    public static Singleton1 getInstance(){
        if(INSTANCE == null){
            synchronized (Singleton1.class){
                if(INSTANCE == null){
                    INSTANCE = new Singleton1();
                }
            }
        }
        return INSTANCE;
    }

    public void addUser(User user){
        this.users.add(user);
    }

    public void removeUser(Integer index){
        this.users.remove(index);
    }

    public void listUsers(){
        for(User user : users){
            System.out.println(user.toString());
        }
    }
}
