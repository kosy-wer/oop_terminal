package oop_terminal;

public class Bus extends Transportation {

    public Bus(String name) {
        super(name);
    }
    @Override
    public String toString() {
        return name;
    }

    @Override
    public void run() {
        System.out.println("Bus " + getName() + " is running");
    }
}

