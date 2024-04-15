public class Student
{
  public String firstName;

  public Student(String firstName)
  {
    this.firstName = firstName;
  }

  public void printName()
  {
    System.out.println("Student name: " + firstName);
  }
  
  public static void main(String[] args)
  {
    Student jaiden = new Student("Jaiden");
    jaiden.printName();
  }
}
