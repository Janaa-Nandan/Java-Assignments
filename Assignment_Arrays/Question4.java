package Learnmaxxing.Assignment_Arrays;

import java.util.ArrayList;
import java.util.Scanner;

public class Question4 {
    static Scanner scanner = new Scanner(System.in);
    static ArrayList<Integer>[] arr;

    public static void main(String[] args) {
        System.out.print("Enter the number of people : ");
        int N = scanner.nextInt();
        arr = new ArrayList[N];

        // Initialize each element of the array with a new ArrayList
        for (int i = 0; i < N; i++) {
            arr[i] = new ArrayList<>();
        }

        boolean enter = true;
        while (enter) {
            System.out.println("1." + '\t' + "Add to a person's weight list");
            System.out.println("2." + '\t' + "Find the minimum of a user");
            System.out.println("3." + '\t' + "Exit");
            System.out.print("Enter Your Choice : ");
            int option = scanner.nextInt();
            System.out.println();

            if (option == 1) {
                System.out.print("Enter number of person to add weight: ");
                int n = scanner.nextInt();
                Addweight(n);
            } else if (option == 2) {
                System.out.print("Enter number of person to find minimum weight: ");
                int n = scanner.nextInt();
                System.out.println(WeightMin(n));
            } else {
                enter = false;
            }
            System.out.println();
        }
    }

    private static int WeightMin(int n) {
        int num = arr[n - 1].get(0);
        for (int i = 1; i < arr[n - 1].size(); i++) {
            int newnum = arr[n - 1].get(i);
            if (newnum < num) {
                num = newnum;
            }
        }
        return num;
    }

    private static void Addweight(int n) {
        System.out.print("Enter weight of that person : ");
        int weight = scanner.nextInt();
        arr[n - 1].add(weight);
        System.out.println('\n' + "Successfully Added!!");
    }
}
