package org.marianaduarte.abstractfactory;

public abstract class Loan {
    protected double rate;
    abstract void getInterestRate(double rate);
    public void calculateLoanPayment(double loanAmount, int years){
        double EMI;
        int n;
        n = years * 12;
        rate = rate/1200;
        EMI = ((rate*Math.pow((1+rate),n))/((Math.pow((1+rate),n))-1))*loanAmount;
        System.out.println("Seu pagamento mensal do emprestimo é de R$"+EMI+" pelo montante de R$"+loanAmount+" que você pegou emprestado");
    }
}
