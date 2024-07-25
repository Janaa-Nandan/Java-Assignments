package Learnmaxxing.Assignment5;

public class Reversesentence {
    public static void main(String[] args) {
        System.out.println(reverser("Hello World AWord AnotherWord"));
    }
    static String reverser(String s){
        String[] arr =s.split(" ");
        String rev = "";
        for (int i = arr.length-1;i >= 0 ;i--){
            rev += arr[i]+" ";
        }
        return rev;
    }
}
