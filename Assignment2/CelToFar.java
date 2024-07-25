package Learnmaxxing.Assignment1;

//Write a program to convert Celsius to Fahrenheit using appropriate datatypes and literal conventions
public class CelToFar {
    public static void main(String[] args) {
        System.out.println(celtofar(20));
    }
    static int celtofar(int cel){
        return cel*9/5+32;
    }
}
