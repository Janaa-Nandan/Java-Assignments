package Learnmaxxing.Assignment1;

//Get two numbers from user and perform bitwise AND< OR, XOR, left and right shift operations on them.
public class Bitwiseop {
    public static void main(String[] args) {
        and(5,7);
        or(5,7);
        xor(5,7);
        left(5,7);
        right(5,7);
    }
    static void and(int a,int b){
        System.out.println(a&b);
    }
    static void or(int a,int b){
        System.out.println(a|b);
    }
    static void xor(int a,int b){
        System.out.println(a^b);
    }
    static void left(int a,int b){
        System.out.println(a<<b);
    }
    static void right(int a,int b){
        System.out.println(a>>b);
    }
}
