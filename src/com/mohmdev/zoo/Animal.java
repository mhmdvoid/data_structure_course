package com.mohmdev.zoo;

// This also can represent section we have in  azoo
public abstract class Animal {  // ADT

    enum AnimalKind {
        // You could always keep a reference in the constant, However, You need to keep in mind extensibility
        Wild, Sea,
    }
    private String name;
    private int age;
    private AnimalKind kind;

    public Animal(String name, int age, AnimalKind kind) {
        this.name = name;
        this.age = age;
        this.kind = kind;
    }
}

class Lion extends Animal {

    public Lion(String name, int age) {
        super(name, age, AnimalKind.Wild);
    }
}
class Elephants extends Animal {
    public Elephants(String name, int age) {
        super(name, age, AnimalKind.Wild);
    }
}

class Monkey extends Animal {
    public Monkey(String name, int age) {
        super(name, age, AnimalKind.Wild);
    }
}

class Seal extends Animal {
    public Seal(String name, int age) {
        super(name, age, AnimalKind.Sea);
    }
}
class Crab extends Animal {
    public Crab(String name, int age) {
        super(name, age, AnimalKind.Sea);
    }
}

class Dolphin extends Animal {
    public Dolphin(String name, int age) {
        super(name, age, AnimalKind.Sea);
    }
}