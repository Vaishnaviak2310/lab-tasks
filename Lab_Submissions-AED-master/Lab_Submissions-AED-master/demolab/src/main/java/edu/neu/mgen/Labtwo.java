package edu.neu.mgen;

abstract class Animal {
    protected String name;
    protected double typicalSize; 
    protected double typicalWeight; 
    protected String diet; 
    
    public Animal(String name, double typicalSize, double typicalWeight, String diet) {
        this.name = name;
        this.typicalSize = typicalSize;
        this.typicalWeight = typicalWeight;
        this.diet = diet;
    }
    
    public abstract void displayInfo();
}

class Bird extends Animal {
    private double wingspan; 

    public Bird(String name, double typicalSize, double typicalWeight, String diet, double wingspan) {
        super(name, typicalSize, typicalWeight, diet);
        this.wingspan = wingspan;
    }

    @Override
    public void displayInfo() {
        System.out.println("Bird: " + name + ", Size: " + typicalSize + "cm, Weight: " + typicalWeight + "kg, Diet: " + diet + ", Wingspan: " + wingspan + "cm");
    }
}

class LandAnimal extends Animal {
    private int numberOfLegs;

    public LandAnimal(String name, double typicalSize, double typicalWeight, String diet, int numberOfLegs) {
        super(name, typicalSize, typicalWeight, diet);
        this.numberOfLegs = numberOfLegs;
    }

    @Override
    public void displayInfo() {
        System.out.println("Land Animal: " + name + ", Size: " + typicalSize + "cm, Weight: " + typicalWeight + "kg, Diet: " + diet + ", Legs: " + numberOfLegs);
    }
}

class Fish extends Animal {
    private int numberOfFins;

    public Fish(String name, double typicalSize, double typicalWeight, String diet, int numberOfFins) {
        super(name, typicalSize, typicalWeight, diet);
        this.numberOfFins = numberOfFins;
    }

    @Override
    public void displayInfo() {
        System.out.println("Fish: " + name + ", Size: " + typicalSize + "cm, Weight: " + typicalWeight + "kg, Diet: " + diet + ", Fins: " + numberOfFins);
    }
}

public class Labtwo {
    public static void main(String[] args) {
        Bird penguin = new Bird("Penguin", 70, 25, "non-vegetarian", 20); // Adjusted size, weight, and wingspan for a penguin
        LandAnimal elephant = new LandAnimal("Elephant", 300, 5000, "vegetarian", 4);
        Fish salmon = new Fish("Salmon", 70, 1.5, "non-vegetarian", 2);

        penguin.displayInfo();
        elephant.displayInfo();
        salmon.displayInfo();
    }
}

