package com.company;

public class Horse extends AbstractAnimal{
    private String color;

    public Horse(int weight, int age, String gender, String nickName, String color) {
        super(weight, age, gender, nickName);
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "Horse:" +
                "\ncolor='" + color + '\'' + "\n" +  super.toString();
    }
}
