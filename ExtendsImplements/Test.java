package ExtendsImplements;

import java.util.Scanner;

public class Test {

  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);
    System.out.println("enter the name of person");
    String personname = sc.next();

    System.out.println("enter the person age");
    int personage = sc.nextInt();

    System.out.println("enter the man salary");
    int mansalary = sc.nextInt();

    Man m = new Man(personname, personage, mansalary);
    m.task();
    m.show_person();
    sc.close();
  }
}
