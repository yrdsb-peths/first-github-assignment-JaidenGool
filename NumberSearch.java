// Name: Jaiden Gool
// Date: 2024/04/18
// Program makes an array of random numbers based on input, user searches for numbers in the array, and displays the results

import java.util.Scanner;

public class NumberSearch 
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter the number of random numbers to generate
        System.out.print("Enter the number of random numbers to generate: ");
        int arraySize = scanner.nextInt();

        // Create an array to store the random numbers
        int[] numbers = new int[arraySize];

        // Generate random numbers and fill the array
        for(int i = 0; i < arraySize; i++)
        {
            numbers[i] = (int) (Math.random() * 100);
        }

        // Infinite loop to continuously prompt the user for a number to search
        while(true)
        {
            // Prompt the user to enter a number to search for (between 0 and 99)
            System.out.print("\nEnter a number to search for (0, 99) or -1 to exit: ");
            int targetNumber = scanner.nextInt();

            // Check if the user entered -1 to exit the loop
            if(targetNumber == -1)
            {
                break; // Exit the loop if the user enters -1
            }

            // To keep track of whether the targetNumber is found in the array
            boolean found = false;

            // Iterate through the numbers array using an enhanced for loop
            for(int num : numbers)
            {
                if(num == targetNumber) // Check if the current number matches the targetNumber
                {
                    found = true; // Set found to true if the targetNumber is found
                    break; // Exit the loop early since the targetNumber is found
                }
            }

            // Display the search result based on whether the targetNumber was found
            if(found)
            {
                System.out.println("Your number (" + targetNumber + ") exists in the array.");
            }
            else
            {
                System.out.println("Your number (" + targetNumber + ") does not exist in the array.");
            }
        }

        scanner.close(); // Close the Scanner 
        System.out.println("\nHave a good day."); // Display a farewell message
    }
}
