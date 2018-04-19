package com.kole;

class Car {
    private boolean engine;
    private int numberOfCylinders;
    private int wheels;
    private String name;

    public Car(int numberOfCylinders, String name) {
        this.engine = true;
        this.numberOfCylinders = numberOfCylinders;
        this.wheels = 4;
        this.name = name;
    }

    public boolean isEngine() {
        return engine;
    }

    public int getNumberOfCylinders() {
        return numberOfCylinders;
    }

    public int getWheels() {
        return wheels;
    }

    public String getName() {
        return name;
    }

    public void startEngine() {
        System.out.println(this.getName() + " Engine starting!");
    }

    public void accelerate() {
        System.out.println(this.getName() + " Accelerating!");
    }

    public void brake() {
        System.out.println(this.getName() + " Brake pressed!");
    }

}

class Stilo extends Car {
    public Stilo(int numberOfCylinders, String name) {
        super(numberOfCylinders, name);
    }

    @Override
    public void startEngine() {
        super.startEngine();
        System.out.println("Stilo starting engine");
    }

    @Override
    public void accelerate() {
        super.accelerate();
    }

    @Override
    public void brake() {
        super.brake();
    }
}

public class Main {

    public static void main(String[] args) {
        Stilo koletov = new Stilo(7, "Stilo");
        koletov.startEngine();

    }
}
