package com.mohmdev.ADT.data_structure;

import com.mohmdev.ADT.Human;


// Data structure
public class Employee extends Human {

    // Details
    String name;
    float salary;
    float workingHrs;

    @Override
    public void eat() {
        System.out.println("Eating");
    }

    @Override
    public void sleep() {
        System.out.println("Sleeping");
    }

    @Override
    public void communicate() {
        System.out.println("Use spoken language");
    }
}

