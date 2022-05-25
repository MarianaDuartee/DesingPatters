package org.marianaduarte.command;

import java.util.HashMap;
import java.util.Map;

public class SmartHouseApp {
    //Invoker
    private Map<String,SmartHouseCommand> commands = new HashMap<>();

    public void addComand(String key, SmartHouseCommand command){
        this.commands.put(key,command);
    }

    public void executeCommand(String key){
        this.commands.get(key).execute();
    }

    public void undoCommand(String key){
        this.commands.get(key).undo();
    }
}
