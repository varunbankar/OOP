package com.lab6;

public class LastTransaction {

    private String type;

    public boolean setType(String type) {
        switch(type) {
            case "Withdraw":
            case "Deposit":
            case "Transfer":
                this.type = type;
                break;
            default:
                return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return this.type;
    }

}
