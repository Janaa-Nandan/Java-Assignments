package Learnmaxxing.Assignment_Arrays;

import java.util.Arrays;
import java.util.Scanner;

//3. Write a program to generate the matrix with integers in spiral order. Get size N from the user and generate an NxN spiral matrix.
public class Question3{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the size of the matrix (N): ");
        int n = scanner.nextInt();
        int[][] matrix = new int[n][n];
        generateSpiralMatrix(matrix, n);
        System.out.println("Spiral matrix: ");
        arrayprinter(matrix);
        }
    public static void generateSpiralMatrix(int[][] matrix, int n) {
        int value = 1;
        int top = 0;
        int bottom = n - 1;
        int left = 0;
        int right = n - 1;
        while (value <= n * n) {
            for (int i = left; i <= right && value <= n*n;i++) {
                matrix[top][i] = value++;
                System.out.println("i");
                arrayprinter(matrix);
            }
            top++;
            for (int j = top; j <= bottom && value <= n*n; j++) {
                matrix[j][right] = value++;
                System.out.println("j");
                arrayprinter(matrix);
            }
            right--;
            for (int k = right; k >= left && value <= n*n; k--) {
                matrix[bottom][k] = value++;
                System.out.println("k");
                arrayprinter(matrix);
            }
            bottom--;
            for (int l = bottom; l >= top && value <= n*n; l--) {
                matrix[l][left] = value++;
                System.out.println("l");
                arrayprinter(matrix);
            }
            left++;
        }
    }
    public static void arrayprinter(int[][] matrix) {
        int n = matrix.length;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(matrix[i][j] + "\t");
            }
            System.out.println();
        }
        System.out.println('\n');
    }
}


