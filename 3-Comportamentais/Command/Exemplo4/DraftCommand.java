package org.marianaduarte.tema16;

public class DraftCommand implements Command{
    private BankAccount bankAccount;
    private double value;
    private String description;
    public DraftCommand(BankAccount bankAccount,double value){
        this.bankAccount = bankAccount;
        this.value = value;
    }

    @Override
    public void execute() {
        String description = "Saque de R$:"+this.value+"\n";
        this.description = description;
        this.bankAccount.draft(this.value);
        this.bankAccount.addCommand(this);
        System.out.println("Saque realizado com sucesso!");
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
