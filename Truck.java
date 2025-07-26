package oop_terminal;

public class Truck extends Transportation {

    public Truck(String name) {
        super(name);
    }
    @Override
    public String toString() {
        return name;
    }

    @Override
    public void run() {
        System.out.println("Truck " + getName() + " is running");
    }
}
