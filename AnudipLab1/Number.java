package AnudipLab1;


import java.util.Scanner;

/*
 * 3)Write a program to accept choice from the user and perform the operation
 * 
 * 1.Find out greater between 3 NO
 * 
 * 2.Check given no is even or odd
 * 
 * 3.Checkk the given character is vowel or not
 * 
 * 4.check the given no is divible by 5 or not
 */
public class Number
{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Accepting min and max numbers from the user
        System.out.print("Enter the minimum number: ");
        int min = scanner.nextInt();
        System.out.print("Enter the maximum number: ");
        int max = scanner.nextInt();

        // Finding the greatest among the smallest, even, and odd numbers
        int smallest = min;
        int greatestSmallest = min;

        int greatestEven = min % 2 == 0 ? min : min + 1; // Initialize with the first even number
        int greatestOdd = min % 2 == 1 ? min : min + 1;  // Initialize with the first odd number

        for (int i = min; i <= max; i++) {
            // Finding the smallest number
            if (i < smallest) {
                smallest = i;
                greatestSmallest = i;
            }

            // Finding the greatest even number
            if (i % 2 == 0 && i > greatestEven) {
                greatestEven = i;
            }

            // Finding the greatest odd number
            if (i % 2 == 1 && i > greatestOdd) {
                greatestOdd = i;
            }
        }

        // Displaying the results
        System.out.println("The greatest among the smallest numbers is: " + greatestSmallest);
        System.out.println("The greatest among the even numbers is: " + greatestEven);
        System.out.println("The greatest among the odd numbers is: " + greatestOdd);

        // Closing the scanner
        scanner.close();
    }
}
