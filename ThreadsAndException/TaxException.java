package ThreadsAndException;
import java.util.Scanner;
/*Q."Develop  a  class  named  “TaxCalculator“ with a method named calculateTax with the following method parameters,

VariableName   Data Type
empName        String
isIndian        boolean
empSal        double

This method should return a double taxAmount.
The business logic for calculating the tax  is as follows, this has to be implemented inside the method,
If the employee is not a Indian
The calculator should throw a CountryNotValidException
If the employee name is null or empty
The calculator should throw a EmployeeNameInvalidException
If  empSal is greater than one lakh and isIndian true
taxAmount =empSal *8/100
Otherwise  If  empSal  is between 50K and 1lakh and isIndian true
taxAmount =empSal *6/100
Otherwise  If  empSal  is between 30 and 50 Thousand  and isIndian true
taxAmount =empSal *5/100
Otherwise  If  empSal  is between 10 and 30 Thousand  and isIndian true
taxAmount =empSal *4/100
Otherwise
The calculator should throw a TaxNotEligibleException.
Develop a main class CalculatorSimulator  , implement the following logic in main method
1.  Execute the calculateTax Method and print the tax amount as “Tax amount is “<Tax Amount>
2.  In case the calculateTaxMethod throws exceptions, this method needs to catch the appropriate exception print the stack trace and display the following messages,
a.  Country not valid:  “The employee should be an Indian citizen for calculating tax”
b.  Employee name not valid:  “The employee name cannot be empty”
c.  Not eligible for Tax calculation:“The employee does not need to pay tax”"
*/

//Custom exceptions
class CountryNotValidException extends Exception
{
 public CountryNotValidException(String message) 
 {
     super(message);
 }
}

class EmployeeNameInvalidException extends Exception 
{
 public EmployeeNameInvalidException(String message) 
 {
     super(message);
 }
}

class TaxNotEligibleException extends Exception {
 public TaxNotEligibleException(String message) {
     super(message);
 }
}

//TaxCalculator class
class TaxCalculator 
{
 public static double calculateTax(String empName, boolean isIndian, double empSal)
         throws CountryNotValidException, EmployeeNameInvalidException, TaxNotEligibleException {
     if (!isIndian) 
     {
         throw new CountryNotValidException("The employee should be an Indian citizen for calculating tax");
     }

     if (empName == null || empName.isEmpty()) {
         throw new EmployeeNameInvalidException("The employee name cannot be empty");
     }

     double taxAmount;

     if (empSal > 100000) {
         taxAmount = empSal * 8 / 100;
     } else if (empSal >= 50000 && empSal <= 100000) {
         taxAmount = empSal * 6 / 100;
     } else if (empSal >= 30000 && empSal < 50000) {
         taxAmount = empSal * 5 / 100;
     } else if (empSal >= 10000 && empSal < 30000) {
         taxAmount = empSal * 4 / 100;
     } else {
         throw new TaxNotEligibleException("The employee does not need to pay tax");
     }

     return taxAmount;
 }
}


public class TaxException 
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try 
        {
            // Taking user input for employee details
            System.out.print("Enter employee name: ");
            String empName = sc.nextLine();

            System.out.print("Is the employee an Indian citizen? (true/false): ");
            boolean isIndian = sc.nextBoolean();

            System.out.print("Enter employee salary: ");
            double empSal = sc.nextDouble();

            // Execute the calculateTax method and print the tax amount
            double taxAmount = TaxCalculator.calculateTax(empName, isIndian, empSal);
            System.out.println("Tax amount is: " + taxAmount);

        }
        catch (CountryNotValidException e)
        {
            System.out.println("Country not valid: " + e.getMessage());
            e.printStackTrace();
        } 
        catch (EmployeeNameInvalidException e)
        {
            System.out.println("Employee name not valid: " + e.getMessage());
            e.printStackTrace();
        } 
        catch (TaxNotEligibleException e) 
        {
            System.out.println("Not eligible for Tax calculation: " + e.getMessage());
            e.printStackTrace();
        } 
        finally 
        {
            //This block always execute
            sc.close();
        }
    }
}


