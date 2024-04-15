import java.util.Scanner;

public class Dog 
{
    public String dogName = "";
    public int dogAge = 0;

    public Dog(String dogName, int dogAge)
    {
        this.dogName = dogName;
        this.dogAge = dogAge;
    }

    public String toString()
    {
        return(dogName + " the Dog is " + dogAge + " years old!");
    }

    public static void main(String[] args)
    {
        // Create new instance of Scanner
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your dogs name: ");
        String name = scanner.nextLine();
        System.out.print("Enter your dogs age: ");
        int age = scanner.nextInt();

        Dog dogOne = new Dog(name, age);
        System.out.print(dogOne.toString());
        scanner.close();
    }
}
