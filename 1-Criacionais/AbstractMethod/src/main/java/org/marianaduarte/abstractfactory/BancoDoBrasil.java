package org.marianaduarte.abstractfactory;

public class BancoDoBrasil implements Bank{
    private final String BName;

    public BancoDoBrasil(){
        BName = "Banco do Brasil";
    }
    @Override
    public String getBankName() {
        return BName;
    }
}
