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


        Pet[] pets = new Pet[petsNumber];

        for (int i = 0; i < petsNumber; i++) {
            System.out.println("What type of pet is it? Choose dog, cat, or manatee");
            String type = input.nextLine();
            System.out.println("What is the name of the pet?");
            String name = input.nextLine();
            if(type.equals("dog")) {
                pets[i] = new Dog(name);
            }
            if(type.equals("cat")) {
                pets[i] = new Cat(name);
            }
            if(type.equals("manatee")) {
                pets[i] = new Manatee(name);
            }

        }

        for (int i=0; i < petsNumber; i++) {
            System.out.println(pets[i].getName() + " says " + pets[i].speak());
        }
    }
}
