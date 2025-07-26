package oop_terminal;

public class Car extends Transportation {

    public Car(String name) {
        super(name);
    }
    @Override
    public String toString() {
        return name;
    }

    @Override
    public void run() {
        System.out.println("Car " + getName() + " is running");
    }
}

