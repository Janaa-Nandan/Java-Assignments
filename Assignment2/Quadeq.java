package Learnmaxxing.Assignment1;

//Write a program to solve a quadratic equation (ax^2+bx+c). Take a,b and c from user and use quadratic formula.
import java.util.Arrays;
public class Quadeq {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(quadeq(1,2,3)));
    }
    static int[] quadeq(int a,int b, int c){
        return new int[]{-b+(b*b-4*a*c)/2*a,-b-(b*b-4*a*c)/2*a};
    }
}
