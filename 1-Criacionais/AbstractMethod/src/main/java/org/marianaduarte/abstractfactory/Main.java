package org.marianaduarte.abstractfactory;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Digite o nome do Banco que você deseja realizar um emprestimo:");
        String bankName = scan.nextLine();
        System.out.println("Digite o tipo de Emprestimo:\n(Educacional, Habitação ou Comercial)\n");
        String loanName = scan.nextLine();

        AbstractFactory bankFactory = FactoryCreator.getFactory("Bank");
        Bank b = bankFactory.getBank(bankName);

        System.out.println("Digite a taxa de juros para o "+bankName+":");
        double rate = scan.nextDouble();
        System.out.println("Digite o valor do emprestimo que voce deseja:");
        double loanAmount = scan.nextDouble();
        System.out.println("Digite a quantidade de anos para pagar o emprestimo:");
        int years = scan.nextInt();

        System.out.println("Voce esta pegando emprestimo do "+b.getBankName());

        AbstractFactory loanFactory = FactoryCreator.getFactory("Loan");
        Loan l = loanFactory.getLoan(loanName);
        l.getInterestRate(rate);
        l.calculateLoanPayment(loanAmount,years);

    }
}