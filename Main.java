package oop_terminal;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.Iterator;


public class Main {
    static ArrayList<Car> cars = new ArrayList<>();
    static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        while (true) {
            System.out.println("\n=== MENU ===");
            System.out.println("add");
            System.out.println("show");
            System.out.println("edit");
            System.out.println("remove");
            System.out.println("quit");
            String chose = input.nextLine();

            switch (chose) {
                case "add" -> add();
                case "show" -> show();
                case "edit" -> edit();
                case "remove" -> remove();
                case "quit" -> {
                    System.out.println("Quit...");
                    return;
                }
                default -> System.out.println("not valid");
            }
        }
    }

    static void add() {
        System.out.print("Input brand: ");
        String brand = input.nextLine();

            cars.add(new Car(brand));
            System.out.println("succes input");
    }

    static void show() {
        if (cars.isEmpty()) {
            System.out.println("data empty");
            return;
        }

        for (int i = 0; i < cars.size(); i++) {
            System.out.println((i + 1) + ". " + cars.get(i));
        }
    }

    static void edit() {
        show();
        if (cars.isEmpty()) return;

        System.out.print("Select name Brand you want to edit ");
	String name = input.nextLine();

	boolean find = false;
        for (Car car : cars) {
        if (car.getName().equalsIgnoreCase(name)) {
            System.out.print("Input New Name brand: ");
            String newname = input.nextLine();
                car.setName(newname);
		find = true;
                System.out.println(find);
                break;
         }
        }
    	

        if (!find) {
        System.out.println("failed find name brand");
 }
}

  static void remove() {
    if (cars.isEmpty()) {
        System.out.println("Data empty");
        return;
    }

    System.out.print("Input name brand: ");
    String name = input.nextLine();

    boolean find = false;

    Iterator<Car> iterator = cars.iterator();
    while (iterator.hasNext()) {
        Car car = iterator.next();
        if (car.getName().equalsIgnoreCase(name)) {
            iterator.remove(); 
            System.out.println("Car " + name + " succes to remove.");
    	    find = true;
            break;
        }
    }

    if (!find) {
        System.out.println("Brand Car "+ name +"not found.");
    }
}

}

