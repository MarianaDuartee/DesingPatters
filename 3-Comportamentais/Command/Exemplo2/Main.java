package org.marianaduarte.command;

public class Main {
    public static void main(String[] args) {

        // Receiver
        SmartHouseLight bedRoomLight = new SmartHouseLight("Luz Quarto");
        SmartHouseLight bathRoomLight = new SmartHouseLight("Luz Banheiro");

        //Command
        LightPowerCommand bedroomlightPowerCommand = new LightPowerCommand(bedRoomLight);
        LightPowerCommand bathroomlightPowerCommand = new LightPowerCommand(bathRoomLight);
        LightIntensityCommand bedroomIntensityCommand = new LightIntensityCommand(bedRoomLight);

        //Controle - Invoker
        SmartHouseApp smartHouseApp = new SmartHouseApp();
        smartHouseApp.addComand("btn-1",bedroomlightPowerCommand);
        smartHouseApp.addComand("btn-2",bathroomlightPowerCommand);
        smartHouseApp.addComand("btn-3",bedroomIntensityCommand);

        smartHouseApp.executeCommand("btn-1");
        smartHouseApp.undoCommand("btn-1");
        smartHouseApp.executeCommand("btn-2");
        smartHouseApp.undoCommand("btn-2");

        smartHouseApp.executeCommand("btn-3");
        smartHouseApp.undoCommand("btn-3");

    }
}
