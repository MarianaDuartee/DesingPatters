package org.marianaduarte.strategy;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Digite o primeiro valor:");
        float valor1 = scan.nextFloat();
        System.out.println("Digite o segundo valor:");
        float valor2 = scan.nextFloat();

        Context context = new Context(new Addition());
        System.out.println("Adição = "+context.executeStrategy(valor1,valor2));

        context = new Context(new Subtraction());
        System.out.println("Subtração = "+context.executeStrategy(valor1,valor2));

        context = new Context(new Multiplication());
        System.out.println("Multiplicação = "+context.executeStrategy(valor1,valor2));




    }
}