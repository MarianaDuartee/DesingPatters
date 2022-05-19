package org.marianaduarte.abstractfactory;

public class BankFactory extends AbstractFactory{
    public Bank getBank(String bank){
        if(bank == null){
            return null;
        }
        if(bank.equalsIgnoreCase("Banco do Brasil")){
            return new BancoDoBrasil();
        }
        if(bank.equalsIgnoreCase("Itau")){
            return new Itau();
        }
        if(bank.equalsIgnoreCase("Bradesco")){
            return new Bradesco();
        }
        return  null;
    }

    public Loan getLoan(String loan) {
        return null;
    }
}
