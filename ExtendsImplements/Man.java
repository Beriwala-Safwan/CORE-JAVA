package ExtendsImplements;

public class Man extends person implements Father {

  int salary;

  public Man(String name, int age, int salary) {
    super(name, age);
    this.salary = salary;
  }

  public void task() {
    System.out.println("the task of father is to earn money");
  }
}
