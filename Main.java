package oop_terminal;

import java.util.ArrayList;
import java.util.Scanner;

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
                case "remove" -> hapusMobil();
                case "quit" -> {
                    System.out.println("Quit...");
                    return;
                }
                default -> System.out.println("not valid");
            }
        }
    }

    static void add() {
        System.out.print("Input brand");
        String brand = input.nextLine();

            cars.add(new Car(nama));
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

        System.out.print("Select the data you want to edit ");
	String name = input.nextLine();

	boolean find = false;
        for (Car car : cars) {
        if (car.getName().equalsIgnoreCase(name)) {
            System.out.print("Input New Name brand: ");
            String newname = input.nextLine();
                car.setName(newname);
            }

            ditemukan = true;
            break; // keluar dari loop setelah edit
        }
    	

        if (!find) {
        System.out.println("failed find name brand");
 }
}

  static void remove() {
    if (cars.isEmpty()) {
        System.out.println("Belum ada mobil.");
        return;
    }

    System.out.print("Masukkan nama mobil yang mau dihapus: ");
    String namaHapus = input.nextLine();

    boolean ketemu = false;

    // Gunakan iterator agar aman saat menghapus saat loop
    Iterator<Car> iterator = cars.iterator();
    while (iterator.hasNext()) {
        Car car = iterator.next();
        if (car.getName().equalsIgnoreCase(namaHapus)) {
            iterator.remove(); // cara aman hapus saat loop
            System.out.println("Mobil " + namaHapus + " berhasil dihapus.");
            ketemu = true;
            break;
        }
    }

    if (!ketemu) {
        System.out.println("Mobil dengan nama tersebut tidak ditemukan.");
    }
}

}

