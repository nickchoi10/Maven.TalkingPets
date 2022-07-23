package io.zipcoder.polymorphism;

import jdk.jfr.internal.tool.Main;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class MainApplication extends Pets {
    private static ArrayList<Pets> petsList = new ArrayList<Pets>();

    public MainApplication(){
        super();
    }
    public static void main(String[] args) {
        int numberOfPets = getIntInput("How many pets do you have?");

        for (int i = 0; i < numberOfPets; i++) {
            String typePet = getStringInput("What kind of pet?");
            String namePet = getStringInput("What is its name?");
            System.out.println(typePet + " " + namePet);

            if (typePet.equalsIgnoreCase("cat")) {
                petsList.add((new Cats(namePet)));
            } else if (typePet.equalsIgnoreCase("dog")) {
                petsList.add(new Dogs(namePet));
            } else if (typePet.equalsIgnoreCase("rabbit")) {
                petsList.add(new Rabbits(namePet));
            }
        }
        printEndStatus();
    }

    public static int getIntInput(String prompt) {
        Scanner scan = new Scanner(System.in);
        System.out.println(prompt);
        int numberInput = scan.nextInt();
        return numberInput;
    }

    public static String getStringInput(String prompt) {
        Scanner scan = new Scanner(System.in);
        System.out.println(prompt);
        String pet = scan.nextLine();
        return pet;

    }

    public static void printEndStatus() {
        for (Pets pet : petsList) {
            System.out.println(pet.getName()+ " says " +pet.speak());
        }
    }
}






