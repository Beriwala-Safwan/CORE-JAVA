package Abstraction;

public abstract class Animal {
  abstract void animalsound();

}

class Cat extends Animal {
  public void animalsound() {
    System.out.println("meow meow");
  }
}

class Dog extends Animal {
  public void animalsound() {
    System.out.println("bow bow");
  }
}
