//CONSTRUCTOR ARE USED TO INITIALIZE THE OBJECT WHEN AN OBJECT IS CREATED AT THE TIME OF NEW KEY KEYWORD

public class Constructor {

  String name;
  int marks;

  public Constructor(String name, int marks) {
    this.name = name;
    this.marks = marks;
  }

  public void get_details() {
    System.out.println("the student name is " + name);
    System.out.println("the student marks is " + marks);
  }

  public static void main(String[] args) {
    Constructor cs = new Constructor("safwan beriwala", 78);
    cs.get_details();
  }
}
