public class Student
{
  public String firstName;
  public int gradeLevel;

  public Student(String firstName, int gradeLevel)
  {
    this.firstName = firstName;
    this.gradeLevel = gradeLevel;
  }

  public void printName()
  {
    System.out.println("Student name: " + firstName);
    System.out.println("Student grade: " + gradeLevel);
  }
  
  public static void main(String[] args)
  {
    Student jaiden = new Student("Jaiden", 11);
    jaiden.printName();
  }
}
