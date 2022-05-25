package org.marianaduarte.command;

public class MenuOptions {
    private ActionListernerCommand openCommand;
    private ActionListernerCommand saveCommand;

    public void clickOpen(){
        openCommand.execute();
    }
    public void clickSave(){
        saveCommand.execute();
    }
    public MenuOptions(ActionListernerCommand openCommand,ActionListernerCommand saveCommand){
        this.openCommand = openCommand;
        this.saveCommand = saveCommand;
    }

}
