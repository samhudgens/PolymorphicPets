package com.samhudgens;

import java.util.Scanner;

/**
 * Created by samhudgens on 5/18/16.
 */
public class Driver {

    public void engine() {
        Scanner input = new Scanner(System.in);
        System.out.println("How many pets do you have?");
        int petsNumber = input.nextInt();
        input.nextLine();


        String[] types = new String[petsNumber];
        String[] names = new String[petsNumber];

        for (int i = 0; i < petsNumber; i++) {
            System.out.println("What type of pet is it?");
            types[i] = input.nextLine();
            System.out.println("What is the name of the pet?");
            names[i] = input.nextLine();
        }

        for (int i=0; i < petsNumber; i++) {
            System.out.println(types[i] + ", " + names[i] + ", ");
        }
    }
}
