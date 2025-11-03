package com.myproject;

import java.util.Scanner;

class Dog extends Animal {
    private String breed;

    // calls from superclass using super
    public Dog(String name, int age, String breed) {
        super(name, age);
        this.breed = breed;
    }

    //3rd method
    @Override
    public void speak() {
        System.out.println(name + " the " + breed + " barks happily!");
    }

    // returns description of dog
    public String getDescription() {
        return "Dog{name='" + name + "', age=" + age + ", breed='" + breed + "'}";
    }
}