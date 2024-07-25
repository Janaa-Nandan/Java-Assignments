package Learnmaxxing.Assignment2;

//Write a program to find the sum of even numbers only in a given array. Use continue.
public class Sum {
    public static void main(String[] args) {
        int[] a = {1,2,3,4,5,6,7,8,9};
        System.out.print(sumofeven(a));
    }
    static int sumofeven(int[] a){
        int result = 0;
        for (int i : a){
            if (i%2==0) result+=i;
        }
        return result;
    }
}
