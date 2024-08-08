//STATIC INPUT CLASS OBJECT PROGRAMME

// public class Student {
//   String name = "safwan";
//   int age = 22;

//   public void show_details() {
//     System.out.println("student name is " + name);
//     System.out.println("student age is " + age);
//   }
// }

import java.util.Scanner;

public class Student {
  Scanner sc = new Scanner(System.in);

  String name = "";
  int age = 0;

  public void get_details() {
    System.out.println("enter your name");
    name = sc.nextLine();
    System.out.println("enter your age");
    age = sc.nextInt();

  }

  public void show_detail() {
    System.out.println("the student name is " + name);
    System.out.println("the student age is " + age);
  }
}