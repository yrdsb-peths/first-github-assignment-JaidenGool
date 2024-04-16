import java.util.Scanner;

public class Shape
{
    public int theLength;
    public int theWidth;

    public Shape(int theLength, int theWidth)
    {
        this.theLength = theLength;
        this.theWidth = theWidth;
    }

    public String toString()
    {
        return("The area of the rectangle is: " + (theLength * theWidth) + "\n\n");
    }
    
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        int loop = -1;

        while(loop == -1)
        {
            System.out.print("Enter the length: ");
            int length = scanner.nextInt();
            if(length == -1)
            {
                break;
            }
            System.out.print("Enter the width: ");
            int width = scanner.nextInt();
            if(width == -1)
            {
                break;
            }
            Shape shape = new Shape(length, width);
            System.out.print(shape.toString());
        }
        System.out.print("Thank you for using this code");
        scanner.close();
    }
}