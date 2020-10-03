package com.practice.test2;

public class SchoolMember {
    private String address;
    private int chanceOfPromotion;
    private String name;

    public SchoolMember(String name, String address) {
        this.name = name;
        this.address = address;
    }

    public int promoted() {
        return this.chanceOfPromotion;
    }

    protected void setChanceOfPromotion(int chance) {
        this.chanceOfPromotion = chance;
    }

    @Override
    public String toString() {
        return this.name + " (" + this.address + ")";
    }

}
