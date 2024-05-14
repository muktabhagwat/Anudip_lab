package String_Handling;
/*1.Write a method that takes a String and returns a String of the same length containing the 
 * 'X' character in all positions except the last 4 positions. The characters in the last 4
 *  positions must be the same as in the original string. For example, if the argument is
	"12345678", the return value should be "XXXX5678".
*/

public class Que1 
{

    public static String generateXString(String input)
    {
        if (input == null || input.length() < 4) 
        {
            throw new IllegalArgumentException("Input string must have at least 4 characters.");
        }

        int length = input.length();
        int endIndex = length - 4;

        // Generate the 'X' characters for the first part
        StringBuilder result = new StringBuilder("X".repeat(endIndex));

        // Append the last 4 characters from the original string
        result.append(input.substring(endIndex));

        return result.toString();
    }

    public static void main(String[] args) 
    {
        String inputString = "12345678";
        String xString = generateXString(inputString);

        System.out.println("Original String: " + inputString);
        System.out.println("X String: " + xString);
    }
}
