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
                case "Edit" -> edit();
                case "Remove" -> remove();
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

    System.out.println("+------------------------------------+");
    System.out.println("| No |   Jenis   |      Nama         |");
    System.out.println("+------------------------------------+");
    for (int i = 0; i < vehicles.size(); i++) {
        Transportation t = vehicles.get(i);
        String type = t.getClass().getSimpleName(); // Dapatkan jenis class-nya
        String name = t.toString(); // toString bisa diatur jadi nama

        System.out.printf("| %2d | %-9s | %-17s |\n", i + 1, type, name);
    }
    System.out.println("+------------------------------------+");
}

static void edit() {
    show();
    if (vehicles.isEmpty()) return;

    System.out.print("Select name brand you want to edit: ");
    String name = input.nextLine();

    boolean find = false;
    for (Transportation t : vehicles) {
        if (t.getName().equalsIgnoreCase(name)) {
            System.out.print("Input new name brand: ");
            String newname = input.nextLine();
            t.setName(newname);
            find = true;
            System.out.println("Nama berhasil diubah.");
            break;
        }
    }

    if (!find) {
        System.out.println("Gagal menemukan nama brand.");
    }
}

static void remove() {
    if (vehicles.isEmpty()) {
        System.out.println("Data empty");
        return;
    }

    System.out.print("Input name brand: ");
    String name = input.nextLine();
    boolean find = false;

    Iterator<Transportation> iterator = vehicles.iterator();
    while (iterator.hasNext()) {
        Transportation t = iterator.next();
        if (t.getName().equalsIgnoreCase(name)) {
            iterator.remove();
            System.out.println("Kendaraan " + name + " berhasil dihapus.");
            find = true;
            break;
        }
    }

    if (!find) {
        System.out.println("Brand kendaraan " + name + " tidak ditemukan.");
    }
}

}

