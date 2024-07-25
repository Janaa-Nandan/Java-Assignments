package Learnmaxxing.Assignment2;

//Write a program to print prime numbers between 1 to 30
public class Prime {
    public static void main(String[] args) {
        for (int i = 1; i <= 30;i++){
            int factors = 0;
            for (int j = 1; j <= 30; j++){
                if (i % j == 0) factors++;
            }
            if (factors==2)System.out.print(i+" ");
        }
    }
}
