package com.myproject;

import java.util.Scanner;

class Animal {
    protected String name;
    protected int age;

    public Animal(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // 1st method
    public void speak() {
        System.out.println(name + " makes a sound.");
    }

    // 2nd method finds dog age in dog years
    public int getAnimalYears() {
        return age * 7;
    }
}