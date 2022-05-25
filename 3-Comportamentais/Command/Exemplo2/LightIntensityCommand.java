package org.marianaduarte.command;

public class LightIntensityCommand implements SmartHouseCommand{
    private SmartHouseLight light;
    public LightIntensityCommand(SmartHouseLight light){
        this.light = light;
    }

    @Override
    public void execute() {
        double intensity = this.light.increaseIntensity();
        System.out.println("A intensidade de "+this.light.name+" é de "+intensity);
    }

    @Override
    public void undo() {
        double intensity = this.light.decreaseIntensity();
        System.out.println("A intensidade de "+this.light.name+" é de "+intensity);
    }
}
