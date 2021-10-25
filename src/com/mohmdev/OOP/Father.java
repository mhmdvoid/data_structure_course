package com.mohmdev.OOP;


import java.util.List;

// Services are built around, just use the simplest description
// No further details/ other responsibility;
class Child {
    Father father;
    int age;
}

public class Father {
    String name;
    List<Child> children;
    boolean isEmployed = true;
}
