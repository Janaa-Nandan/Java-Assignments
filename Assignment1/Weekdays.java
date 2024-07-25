package Learnmaxxing.Assignment1;

import java.util.Scanner;
import java.util.Arrays;
enum days{
    Monday,Tuesday,Wednesday,Thursday,Friday,Sunday,Saturday;
}
public class Weekdays {
    static days[] arr = days.values();
    static days day = days.Friday;
    public static void main(String[] args) {
        System.out.print("Enter the number between 1 and 7 : ");
        Scanner scanner = new Scanner(System.in);
        int i = scanner.nextInt();
        System.out.println(week_day_finder(i-1));
    }
    static days week_day_finder(int i){
        return arr[i];
    }
}
