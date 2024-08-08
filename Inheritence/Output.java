package Inheritence;

class Vehicle {
  int cost = 96000;
  int milage = 40;

  public void show_vehicle() {
    System.out.println("I am the vehicle class");
    System.out.println("The cost of the vehicle is " + cost);
    System.out.println("The milage of the vehicle is " + milage);
  }
}

class Car extends Vehicle {
  String color = "blue";
  int tires = 4;

  public void show_car() {
    System.out.println("I am the car class");
    System.out.println("The color of the car is " + color);
    System.out.println("The car has tires " + tires);
  }
}

public class Output {
  public static void main(String[] args) {
    Car c = new Car();
    c.show_car();
    c.show_vehicle(); // Optionally, call the method from the Vehicle class.
  }
}
