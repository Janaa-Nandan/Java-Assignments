package Learnmaxxing.Assignment5;

public class VowelCounter {

    public static int countVowels(String input) {
        int vowelCount = 0;
        String vowels = "AEIOUaeiou";

        for (int i = 0; i < input.length(); i++) {
            char currentChar = input.charAt(i);
            if (vowels.indexOf(currentChar) != -1) {
                vowelCount++;
            }
        }

        return vowelCount;
    }

    public static void main(String[] args) {
        String testString = "Hello World";

        System.out.println(countVowels(testString));
    }
}