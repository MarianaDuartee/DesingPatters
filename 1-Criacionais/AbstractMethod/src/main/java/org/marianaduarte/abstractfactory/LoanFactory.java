package org.marianaduarte.abstractfactory;

public class LoanFactory extends AbstractFactory{
    public Bank getBank(String bank) {
        return null;
    }

    public Loan getLoan(String loan) {
       if(loan == null){
           return null;
       }
        if(loan.equalsIgnoreCase("Habitacao")){
            return new HomeLoan();
        } else if(loan.equalsIgnoreCase("Comercial")){
            return new BusinessLoan();
        } else if(loan.equalsIgnoreCase("Educacional")){
            return new EducationLoan();
        }
        return null;
    }
}

