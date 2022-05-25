package org.marianaduarte.command;

public class ActionOpen implements ActionListernerCommand{
    private Document doc;

    public ActionOpen(Document doc){
        this.doc = doc;
    }
    @Override
    public void execute() {
        doc.open();
    }
}
