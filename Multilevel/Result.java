package Multilevel;

import java.util.Scanner;

class parent {
  String name = "";

  parent(String name) {
    this.name = name;
  }

  public void show_parent() {
    System.out.println("i am parent class");
    System.out.println("parent name is " + name);
  }
}

class child extends parent {
  int age;

  child(String name, int age) {
    super(name);
    this.age = age;

  }

  public void show_child() {
    System.out.println("i am child class");
    System.out.println("child  age is " + age);
  }

}

class Grandchild extends child {
  String gender = "";

  Grandchild(String name, int age, String gender) {
    super(name, age);
    this.gender = gender;

  }

  public void show_grandchild() {
    System.out.println("i am gran child class");
    System.out.println("grandchild  gender is " + gender);
  }
}

public class Result {
  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);
    System.out.println("enter the parent name");
    String parentname = sc.next();

    System.out.println("enter the child  age");
    int childage = sc.nextInt();

    System.out.println("enter the grandchild  gender");
    String grandgender = sc.next();

    Grandchild gc = new Grandchild(parentname, childage, grandgender);
    gc.show_parent();
    gc.show_child();
    gc.show_grandchild();

    sc.close();

  }
}
