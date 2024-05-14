package String_Handling;
/*4. WAP to enter any sentence and calculate the following:
 a) Total number of digits present in it.
 b) Total number of small letters and capital letters present in it.
 c) Total number of alphabets used in it.
 d) Total number of special character used in it.
 e) Total number of vowels presents in it.
 f) Total Number words present in that sentence.
*/

import java.util.Scanner;

public class SentenceAnalysis {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a sentence:");
        String sentence = scanner.nextLine();

        // a) Total number of digits present in it.
        int digitCount = countDigits(sentence);

        // b) Total number of small letters and capital letters present in it.
        int[] letterCounts = countLetters(sentence);

        // c) Total number of alphabets used in it.
        int totalAlphabets = letterCounts[0] + letterCounts[1];

        // d) Total number of special characters used in it.
        int specialCharCount = countSpecialCharacters(sentence);

        // e) Total number of vowels present in it.
        int vowelCount = countVowels(sentence);

        // f) Total number of words present in that sentence.
        int wordCount = countWords(sentence);

        System.out.println("Results:");
        System.out.println("a) Total number of digits: " + digitCount);
        System.out.println("b) Total number of small letters: " + letterCounts[0]);
        System.out.println("   Total number of capital letters: " + letterCounts[1]);
        System.out.println("c) Total number of alphabets: " + totalAlphabets);
        System.out.println("d) Total number of special characters: " + specialCharCount);
        System.out.println("e) Total number of vowels: " + vowelCount);
        System.out.println("f) Total number of words: " + wordCount);
    }

    private static int countDigits(String sentence) {
        int digitCount = 0;
        for (char ch : sentence.toCharArray()) {
            if (Character.isDigit(ch)) {
                digitCount++;
            }
        }
        return digitCount;
    }

    private static int[] countLetters(String sentence) {
        int[] letterCounts = new int[2]; // Index 0 for small letters, Index 1 for capital letters

        for (char ch : sentence.toCharArray()) {
            if (Character.isLowerCase(ch)) {
                letterCounts[0]++;
            } else if (Character.isUpperCase(ch)) {
                letterCounts[1]++;
            }
        }

        return letterCounts;
    }

    private static int countSpecialCharacters(String sentence) {
        int specialCharCount = 0;
        for (char ch : sentence.toCharArray()) {
            if (!Character.isLetterOrDigit(ch) && !Character.isWhitespace(ch)) {
                specialCharCount++;
            }
        }
        return specialCharCount;
    }

    private static int countVowels(String sentence) {
        int vowelCount = 0;
        for (char ch : sentence.toLowerCase().toCharArray()) {
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                vowelCount++;
            }
        }
        return vowelCount;
    }

    private static int countWords(String sentence) {
        String[] words = sentence.split("\\s+");
        return words.length;
    }
}
