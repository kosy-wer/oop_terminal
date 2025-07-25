package oop_terminal;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.Iterator;


public class Main {
    static Scanner input = new Scanner(System.in);
    static ArrayList<Transportation> vehicles = new ArrayList<>();


    public static void main(String[] args) {
        while (true) {
	System.out.println("+----------------------------+");
        System.out.println("|    Options  Selection      |");
        System.out.println("+----------------------------+");
        System.out.println("| Add                        |");
        System.out.println("| Remove                     |");
        System.out.println("| Show                       |");
        System.out.println("| View                       |");
        System.out.println("| Exit                       |");
        System.out.println("+----------------------------+");
        System.out.print("Choose option : ");
        String choice = input.nextLine();
            switch (choice) {
                case "Add" -> add();
                case "Show" -> show();
			/*
                case "Remove" -> remove();
                case "Edit" -> edit();*/
                case "Exit" -> {
                    System.out.println("Quit...");
                    return;
                }
                default -> System.out.println("not valid");
            }
        }
    }
static void add() {
    System.out.println("+----------------------------+");
    System.out.println("|    🚘 Vehicle Selection    |");
    System.out.println("+----------------------------+");
    System.out.println("| 1. Car 🚗                  |");
    System.out.println("| 2. Bus 🚌                  |");
    System.out.println("| 3. Truck 🚚                |");
    System.out.println("+----------------------------+");
    System.out.print("Choose vehicle : ");
    String vehicle = input.nextLine();

    System.out.print("Input name: ");
    String name = input.nextLine();

    Transportation transportation;

    switch (vehicle.toLowerCase()) {
        case "car" -> transportation = new Car(name);
        case "bus" -> transportation = new Bus(name);
        case "truck" -> transportation = new Truck(name);
        default -> {
            System.out.println("Tipe kendaraan tidak dikenal.");
            return;
        }
    }

    vehicles.add(transportation); // Tambah ke list
    System.out.println("Berhasil ditambahkan: " + transportation);
}

            
static void show() {
    if (vehicles.isEmpty()) {
        System.out.println("Belum ada kendaraan yang ditambahkan.");
        return;
    }

    System.out.println("+-------------------------+");
    System.out.println("|   Daftar Kendaraan      |");
    System.out.println("+-------------------------+");
    for (int i = 0; i < vehicles.size(); i++) {
        System.out.println((i + 1) + ". " + vehicles.get(i));
    }
}


/*
    static void edit() {
        show();
        if (vehicles.isEmpty()) return;

        System.out.print("Select name Brand you want to edit ");
	String name = input.nextLine();

	boolean find = false;
        for (Car car :vehicles) {
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

*/
}

