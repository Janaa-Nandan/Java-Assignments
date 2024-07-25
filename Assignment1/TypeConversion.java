package Learnmaxxing.Assignment1;

public class TypeConversion {
    static int floattoint(Float input){
        return input.intValue();
    }
    static float doubletofloat(Double input){
        return input.floatValue();
    }
    static short inttoshort(Integer input){
        return input.shortValue();
    }
    public static void main(String[] args) {
        System.out.println(floattoint(4.5F));
        System.out.println(doubletofloat(12.4));
        System.out.println(inttoshort(500));
    }
}
