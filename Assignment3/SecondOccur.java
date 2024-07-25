package Learnmaxxing.Assignment2;

//Write a program to find second occurrence of a given number in an array
public class SecondOccur {
    public static void main(String[] args) {
        int[] a = {1,2,3,4,5,4,3,2,1};
        Findr(a);
    }
    static void Findr(int[] a){
        for (int i = 0; i < a.length; i++){
            for (int j = i+1; j < a.length; j++){
                if (a[i] == a[j]) System.out.println("element "+a[i]+" has occurred twice");
            }
        }
    }
}
