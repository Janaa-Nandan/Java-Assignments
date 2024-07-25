package Learnmaxxing.Assignment5;

public class Capitalizer {
    public static String capitalize(String sentence) {
        String[] arr = sentence.split(" ");
        String capitalizedSentence = "";

        for (String word : arr) {
            if (!word.isEmpty()) {
                String capitalizedWord = word.substring(0, 1).toUpperCase() + word.substring(1).toLowerCase();
                capitalizedSentence += capitalizedWord+" ";
            }
        }

        return capitalizedSentence;
    }

    public static void main(String[] args) {
        System.out.println(capitalize("hello world! this string didn't have capitals"));
    }
}
