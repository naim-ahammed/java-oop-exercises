package array;





public class Array1 {

    public static void main(String[] args) {

        int[] num = new int[5];

        num[0]=10;
        num[1]=10;

        num[2]=10;
        num[3]=10;
        num[4]=10;

        int sum = num[0]+num[1]+num[2]+num[3]+num[4];
        System.out.println("sum array "+sum);

        int len = num.length;
        System.out.println("array size = "+len);



//        int[] num2 = new int[5];
//
//        num2[0]=10;
//        num2[2]=10;
//        num2[3]=10;
//        num2[4]=10;
//
//        int i;
//
//        for (i=0;i<=5;i++){
//            System.out.println(num[0]);
//
//            System.out.println(num2[0]);
//
//        }


    }
}