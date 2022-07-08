package io.zipcoder.polymorphism;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class MainApplication {

    public static void main(String[] args) {
        System.out.println("How many pets do you have?");
        Scanner scan = new Scanner(System.in);
        Integer number = Integer.valueOf(scan.nextLine());

        String[] petType = new String[number];
        String[] name = new String[number];


        for (int i = 0; i < number; i++) {
            System.out.println("What kind of pet?");
            petType[i] = scan.nextLine();}
            for (int j =0; j <number; j++){

            System.out.println("What is their name?");
            name[j] = scan.nextLine();
        }


        System.out.println("You have " + number + " pets");
        System.out.println("You have a " + Arrays.toString(petType));
        System.out.println("There names are " + Arrays.toString(name));
        System.out.println(name[number-1] + " is my favorite pet!!!");
    }


}
