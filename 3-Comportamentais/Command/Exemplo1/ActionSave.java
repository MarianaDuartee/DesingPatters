package org.marianaduarte.command;

public class ActionSave implements ActionListernerCommand{
    private Document doc;

    public ActionSave(Document doc){
        this.doc = doc;
    }

    @Override
    public void execute() {
        doc.save();
    }
}
