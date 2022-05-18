package org.marianaduarte.singleton;

public class User {
    private String nome;
    private Integer idade;

    public User(String nome, Integer idade){
        this.nome = nome;
        this.idade = idade;
    }

    public String toString(){
        return this.nome+"-"+this.idade;
    }
}
