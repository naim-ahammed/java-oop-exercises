package array;

import java.util.Arrays;

public class Array8 {
    public static void main(String[] args) {
        // Array sorting

        int[] aray = {10,9,3,4,2,6,7};

        Arrays.sort(aray);

        System.out.print("min to max sort : ");
        for (int i = 0; i < 7; i++) {
            System.out.print(" "+aray[i]);
        }

        System.out.println();
        System.out.println();

        System.out.print("max to min sort : ");
        for (int i = 6; i >= 0; i--) {
            System.out.print(" "+aray[i]);
        }

















    }

}
