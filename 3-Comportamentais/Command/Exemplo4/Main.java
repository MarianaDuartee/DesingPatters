package org.marianaduarte.tema16;

public class Main {
    public static void main(String[] args) {

        BankAccount mariBankAccount = new BankAccount("Conta Bancaria da Mari");
        Command deposit1 = new DepositCommand(mariBankAccount,100);
        deposit1.execute();
        Command draft1 = new DraftCommand(mariBankAccount,10);
        draft1.execute();
        Command deposit2 = new DepositCommand(mariBankAccount,200);
        deposit2.execute();
        Command draft2 = new DraftCommand(mariBankAccount,30);
        draft2.execute();

        System.out.println("\nSaldo da "+mariBankAccount.getAccountName()+" é de R$"+mariBankAccount.checkBalance());

        System.out.println("\nHistorico de Comandos Realizados da "+mariBankAccount.getAccountName()+":\n"+mariBankAccount.placeCommands());

        }
}