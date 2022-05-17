package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Sheep sheep1 = new Sheep(90,2,"W","Sheep1");
        Sheep sheep2 = new Sheep(78,3,"M","Sheep2");
        Sheep sheep3 = new Sheep(49,1,"M","Sheep3");
        Sheep sheep4 = new Sheep(67,2,"W","Sheep4");

        Sheep[]sheeps1 = new Sheep[]{sheep1,sheep2,sheep3};
        Sheep[]sheeps2 = new Sheep[]{sheep4};

        Cow cow1 = new Cow(120,3,"M","Cow1");
        Cow cow2 = new Cow(180,2,"W","Cow2");
        Cow cow3 = new Cow(200,4,"M","Cow3");
        Cow cow4 = new Cow(199,2,"W","Cow4");
        Cow cow5 = new Cow(190,4,"M","Cow5");
        Cow cow6 = new Cow(170,3,"M","Cow6");

        Cow[] cows1 = new Cow[]{cow1,cow2,cow3,cow4,cow5};
        Cow[] cows2 = new Cow[]{cow6};

        Horse horse1 = new Horse(170,3,"W","Horse1","Grey");
        Horse horse2 = new Horse(200,2,"M","Horse2","Black");
        Horse horse3 = new Horse(210,2,"M","Horse3","White");

        Horse[] horses1 = new Horse[]{horse1,horse2};
        Horse[] horses2 = new Horse[]{horse3};

        Farm farm1 = new Farm("Dastan","Batken",cows1,sheeps1,horses1);
        Farm farm2 = new Farm("Zhaulanbek","Biskek",cows2,sheeps2,horses2);

        System.out.println("~~~~~~~~~~~~~~~~~~~~~FARM1~~~~~~~~~~~~~~~~~~~~~~~");
        System.out.println(farm1);
        System.out.println("~~~~~~~~~~~~~~~~~~~~~FARM2~~~~~~~~~~~~~~~~~~~~~~~");
        System.out.println(farm2);

    }
}
