package org.marianaduarte.command;

public class LightPowerCommand implements  SmartHouseCommand{
    //Especifico para ligar/desligar a luz

    private SmartHouseLight light;
    public LightPowerCommand(SmartHouseLight light){
        this.light = light;
    }

    @Override
    public void execute() {
        this.light.turnLightOn();
    }

    @Override
    public void undo() {
        this.light.turnLightOff();
    }
}
