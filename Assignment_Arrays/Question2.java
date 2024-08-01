package Learnmaxxing.Assignment_Arrays;

import java.util.Scanner;

//2. Write a program to find transpose of a matrix
public class Question2 {
    public static void main(String[] args) {
        int[][] matrix =
                {
                {1,2,3},
                {4,5,6},
                {7,8,9},
                {11,22,33}
        };
        int[][] transpose = transposeMatrix(matrix, matrix.length, matrix[0].length);
        for (int i = 0; i < matrix[0].length; i++) {
            for (int j = 0; j < matrix.length; j++) {
                System.out.print(transpose[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static int[][] transposeMatrix(int[][] matrix, int rows, int cols) {
        int[][] transpose = new int[cols][rows];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                transpose[j][i] = matrix[i][j];
            }
        }
        return transpose;
    }
}
