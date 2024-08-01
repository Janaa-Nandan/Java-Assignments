package Learnmaxxing.Assignment_Arrays;

//1. Create a program that rotates the elements of an array to the right by a specified number of positions. Get the array and the rotation count from the user

import java.util.Arrays;
import java.util.Scanner;

public class Question1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the size of the array: ");
        int len = scanner.nextInt();
        int[] array = new int[len];
        System.out.println("Enter the elements of the array: ");
        for (int i = 0; i < len; i++) {
            array[i] = scanner.nextInt();
        }
        System.out.print("Enter the number of positions to rotate: ");
        int rotationCount = scanner.nextInt();
        int[] rotatedArray = array;
        for (int i = rotationCount;i>0;i--){
            rotatedArray = rotateArray(rotatedArray);
        }
        System.out.println(Arrays.toString(rotatedArray));
    }

    public static int[] rotateArray(int[] array){
        int[] newarr = new int[array.length];
        newarr[0] = array[array.length-1];
        for (int i = 1; i < array.length; i ++){
            newarr[i] = array[i-1];
        }
        return newarr;
    }
}
