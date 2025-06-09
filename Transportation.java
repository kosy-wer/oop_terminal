package oop_terminal;

public class Transportation {

  String name;

 Transportation(String name) {
    this.name = name;
  }

  public void run() {
    System.out.println("transportation "+ this.name + " is running");
  }
}
