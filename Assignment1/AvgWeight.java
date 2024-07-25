package Learnmaxxing.Assignment1;

public class AvgWeight {
    public static void main(String[] args) {
        int[] Weight_Measured = {10,20,30,40,50,60,70,80,90,100};
        System.out.println(Average(Weight_Measured));

    }
    static int Average(int[] weight_arr) {
        int sum = 0;
        for (int weight : weight_arr){
            sum+=weight;
        }
        int avg = sum/ weight_arr.length;
        return avg;
    }
}
