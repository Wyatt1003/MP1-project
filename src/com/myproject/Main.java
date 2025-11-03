package com.myproject;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        //takes dogs name
        System.out.print("Enter your dog's name: ");
        String name = input.nextLine();

        //takes dogs age in human years
        System.out.print("Enter your dog's age (in human years): ");
        int age = input.nextInt();
        input.nextLine(); 

        //takes dogs breed
        System.out.print("Enter your dog's breed: ");
        String breed = input.nextLine();

        // creates dog object
        Dog myDog = new Dog(name, age, breed);

        System.out.println("\n Dog successfully created!");
        System.out.println(myDog.getDescription());

        // call method from animal class
        myDog.speak();

        //uses the method to find the dogs age in dog years
        int animalYears = myDog.getAnimalYears();
        System.out.println(name + " is approximately " + animalYears + " dog years old.");


        // Use math class to calculate random happiness score
        double happiness = Math.round(Math.random() * 100);
        System.out.println("Happiness score for: " + name + ": " + happiness);

        input.close();
    }
}