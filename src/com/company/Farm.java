package com.company;

import java.util.Arrays;

public class Farm {
    private String ownerName;
    private String address;
    private Sheep[] sheep;
    private Cow[] cow;
    private Horse[] horse;

    public Farm(String ownerName, String address, Cow[] cow, Sheep[] sheep, Horse[] horse) {
        this.ownerName = ownerName;
        this.address = address;
        this.cow = cow;
        this.sheep = sheep;
        this.horse = horse;
    }

    public String getOwnerName() {
        return ownerName;
    }

    public void setOwnerName(String ownerName) {
        this.ownerName = ownerName;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Cow[] getCow() {
        return cow;
    }

    public void setCow(Cow[] cow) {
        this.cow = cow;
    }

    public Sheep[] getSheep() {
        return sheep;
    }

    public void setSheep(Sheep[] sheep) {
        this.sheep = sheep;
    }

    public Horse[] getHorse() {
        return horse;
    }

    public void setHorse(Horse[] horse) {
        this.horse = horse;
    }

    @Override
    public String toString() {
        return "\t\t\t\t\tFarm:\n" +
                "ownerName= '" + ownerName + '\'' +
                ", address= '" + address + '\'' +
                ", \nsheep:\n" + Arrays.toString(sheep) +
                ", \ncow:\n " + Arrays.toString(cow) +
                ", \nhorse:\n " + Arrays.toString(horse);
    }
}
