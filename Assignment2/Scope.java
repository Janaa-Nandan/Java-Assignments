package Learnmaxxing.Assignment1;

public class Scope {
    public static void main(String[] args) {
        boolean test = true;
        int num = 5;
        if(test){
            int localnum = 7;
            System.out.println("condition true!, entered if condition");
            System.out.println(num+" "+localnum);
            test = false;
        }
//        System.out.println(localnum); //COMPILER ERROR!
//        I get an error here when i try to print the local variable inside the if condition.
//        This happens because the if condition might be false, so the variable "localnum" might or might not be declared.
    }
}
