package Learnmaxxing.Assignment2;

//Write a program to print multiplication table of a given number in a neat format
public class MultiplicationTable {
    public static void main(String[] args) {
        multtable(5);
    }
    static void multtable(int a){
        for (int i = 1; i <= 10; i++){
            System.out.println(a+" x "+i+" = "+a*i);
        }
    }
}
