package org.marianaduarte.tema16;

public class DepositCommand implements Command{

    private BankAccount bankAccount;
    private double value;
    private String description;

    public DepositCommand(BankAccount bankAccount,double value){
        this.bankAccount = bankAccount;
        this.value = value;
    }
    @Override
    public void execute() {
        String description = "Deposito de R$:"+this.value+"\n";
        this.description = description;
        this.bankAccount.deposit(this.value);
        this.bankAccount.addCommand(this);
        System.out.println("Deposito realizado com sucesso!");

    }
    @Override
    public double getValue(){
        return this.value;
    }
    @Override
    public String commandDescription() {
        return this.description;
    }
}
