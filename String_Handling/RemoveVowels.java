package String_Handling;

import java.util.Scanner;

public class RemoveVowels {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a word or a string:");
        String input = scanner.nextLine();

        String result = removeVowels(input);

        System.out.println("New String after removing vowels: " + result);
    }

    private static String removeVowels(String input)
    {
        StringBuilder result = new StringBuilder();

        for (char ch : input.toCharArray()) 
        {
            if (!isVowel(ch)) 
            {
                result.append(ch);
            }
        }

        return result.toString();
    }

    private static boolean isVowel(char ch) {
        ch = Character.toLowerCase(ch);
        return ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u';
    }
}

