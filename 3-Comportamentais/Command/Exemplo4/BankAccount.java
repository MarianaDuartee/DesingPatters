package org.marianaduarte.tema16;

import java.util.ArrayList;

public class BankAccount {
    private String accountName;
    private double balance;
    private static ArrayList<Command> commandsList;

    public BankAccount(String accountName){
        this.accountName = accountName;
        this.balance = 0;
        commandsList = new ArrayList<>();
    }

    public String getAccountName(){
        return this.accountName;
    }
    public void addCommand(Command command){
        commandsList.add(command);
    }
    public void deposit(double value){
        this.balance = balance+value;
    }
    public void draft(double value){
        this.balance = balance-value;
    }

    public ArrayList<String> placeCommands(){
        ArrayList<String> allCommandsDescriptions = new ArrayList<>();
        for(Command command:commandsList){
            allCommandsDescriptions.add(command.commandDescription());
        }

        return allCommandsDescriptions;
    }

    public double checkBalance(){
        double balance = 0;
        for(Command command:commandsList) {
            if (command.getClass().equals(DepositCommand.class)) {
                balance = balance + command.getValue();
            } else if (command.getClass().equals(DraftCommand.class)) {
                balance = balance - command.getValue();
            }
        }

        return balance;
    }
}
