package ExtendsImplements;

public class person {
  String name = "";
  int age;

  public person(String name, int age) {
    this.name = name;
    this.age = age;
  }

  public void show_person() {
    System.out.println("the name of person is " + name);
    System.out.println("the age of person is " + age);
  }
}
