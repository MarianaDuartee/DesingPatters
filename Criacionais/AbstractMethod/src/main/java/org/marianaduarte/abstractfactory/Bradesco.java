package org.marianaduarte.abstractfactory;

public class Bradesco implements Bank{
    private final String BName;
    public Bradesco(){
        BName = "Banco Bradesco";
    }
    @Override
    public String getBankName() {
        return BName;
    }
}
