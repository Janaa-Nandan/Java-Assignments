package Learnmaxxing.Assignment2;

//Take three numbers from the user and print the greatest number.
public class Greatestnum {
    public static void main(String[] args) {
        System.out.println(greatestnum(1,2,3));
    }
    static int greatestnum(int a, int b, int c){
        if (a>b && a>c)return a;
        else if (b>a && b>c) return b;
        else if (c>a && c>b) return c;
        else return a;
    }
}
