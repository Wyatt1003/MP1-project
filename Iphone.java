package com.myproject;

public class Iphone extends Phone {

    private int srsnum;
    private String color;

    public Iphone(int srsnum, String color, String Brand){
        super(Brand);
        this.srsnum = srsnum;
        this.color = color;
    }

    public void turnOn() {
        System.out.println("The " + color + " " + Brand + " " + srsnum + " turned on");
    }
}
