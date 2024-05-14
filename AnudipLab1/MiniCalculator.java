package AnudipLab1;
/*Q2)WAP to create a mini calculator ask the user what operation the user wants to perform, and repeat the task till the user wants to perform any operation.
21 December 2023
*/
import java.util.Scanner;

public class MiniCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        boolean continueCalculator;

        do {
            // Display menu
            System.out.println("Mini Calculator");
            System.out.println("1. Addition");
            System.out.println("2. Subtraction");
            System.out.println("3. Multiplication");
            System.out.println("4. Division");
            System.out.println("5. Exit");

            // Get user choice
            System.out.print("Enter your choice : ");
            int choice = scanner.nextInt();

            if (choice >= 1 && choice <= 4) 
            {
                // Get input numbers
                System.out.print("Enter the first number: ");
                double num1 = scanner.nextDouble();
                System.out.print("Enter the second number: ");
                double num2 = scanner.nextDouble();

                // Perform the chosen operation
                switch (choice) 
                {
                    case 1:
                        System.out.println("Result: " + (num1 + num2));
                        break;
                    case 2:
                        System.out.println("Result: " + (num1 - num2));
                        break;
                    case 3:
                        System.out.println("Result: " + (num1 * num2));
                        break;
                    case 4:
                        if (num2 != 0) 
                        {
                            System.out.println("Result: " + (num1 / num2));
                        } else {
                            System.out.println("Error: Cannot divide by zero.");
                        }
                        break;
                }
            } 
            else if (choice == 5) 
            {
                System.out.println("Exiting the calculator.... Goodbye!");
                continueCalculator = false;
            }
            else 
            {
                System.out.println("Invalid choice. Please enter a number between 1 and 5.");
                continueCalculator = true; // Set to true to continue the loop
            }

            // Ask the user if they want to perform another operation
            System.out.print("Do you want to perform another operation? (yes/no): ");
            String continueChoice = scanner.next();

            continueCalculator = "yes".equals(continueChoice) || "Yes".equals(continueChoice);

        } while (continueCalculator);

        scanner.close();
    }
}
