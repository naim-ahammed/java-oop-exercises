package array;


import java.util.Scanner;

public class Array2 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        double[] array = new double[5];
        System.out.println("array length : " + array.length);

        double sum = 0;
        System.out.print("enter 5 numbers : ");
        for (int i= 0; i<5; i++){
            array[i] = sc.nextDouble();
        }

        for(int i = 0; i<5; i++){
            sum = sum + array[i];
        }
        System.out.println("the sum number is : "+sum);

        double average = sum/array.length;
        System.out.println("average : "+average);

        ////// array max & min number find
        double max = array[0];
        double min = array[0];
        for (int i=0; i<array.length; i++){
            if (max<array[i]){
                max=array[i];
            }
            if (min>array[i]){
                min=array[i];
            }

        }
        System.out.println("max : "+max);
        System.out.println("min : "+min);


        ////// array min number find
        double min2 = array[0];
        for (int i=0; i<array.length; i++){
            if (min2>array[i]){
                min2=array[i];
            }
        }
        System.out.println("min2 : "+min2);






    }
}
