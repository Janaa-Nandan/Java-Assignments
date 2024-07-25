package Learnmaxxing.Assignment2;

//Create a program that takes a student's score as input and outputs their corresponding grade.
public class Grade {
    public static void main(String[] args) {
        System.out.println(grade(70));
        System.out.println(grade(90));
    }
    static char grade(int mark){
        char cha;
        if(mark>80 && mark<=100) cha = 'A';
        else if (mark>60 && mark<=80) cha = 'B';
        else if (mark>40 && mark<=60) cha = 'C';
        else if (mark>20 && mark<=40) cha = 'D';
        else cha = 'E';
        return cha;
    }
}
