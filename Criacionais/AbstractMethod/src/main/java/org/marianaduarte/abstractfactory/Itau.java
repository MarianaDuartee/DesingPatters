package org.marianaduarte.abstractfactory;

public class Itau implements Bank{
    private final String BName;
    public Itau(){
        BName = "Banco Itau";
    }
    @Override
    public String getBankName() {
        return BName;
    }
}
