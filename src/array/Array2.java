package array;


import java.util.Scanner;

public class Array2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double[] num = new double[5];
        double sum = 0;
        System.out.println("enter 5 numbere ");
        for (int i= 0; i<5; i++){
            num[i] = input.nextDouble();
        }

        for(int i = 0; i<5; i++){
            sum = sum + num[i];
        }
        System.out.println("the sum number is "+sum);

    }

    
}
