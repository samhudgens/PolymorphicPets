package com.samhudgens;

/**
 * Created by samhudgens on 5/18/16.
 */
public class Dog extends Pet {

    public Dog(String name) {
        super(name);
    }

    @Override
    public String speak() {
        return "barf";
    }

}
