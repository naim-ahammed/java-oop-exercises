package array;
public class Array3 {

    public static void main(String[] args) {

        // two dimensional array in java
        // 1234
        // 5677
        int row = 2;
        int colum = 4;

        int [][] twoDArray=new int[row][colum];

        twoDArray[0][0]=1;
        twoDArray[0][1]=2;
        twoDArray[0][2]=3;
        twoDArray[0][3]=4;

        twoDArray[1][0]=5;
        twoDArray[1][1]=6;
        twoDArray[1][2]=7;
        twoDArray[1][3]=8;


        int value =1;
        for (int i =0; i< row; i++){
            for (int j=0; j<colum; j++){

                twoDArray[i][j] = value;
                value++;

            }
        }

        System.out.println("the two dimantonal arry is: ");

        for (int i= 0; i<row; i++){
            for (int j=0; j<colum; j++){
                System.out.print(twoDArray[i][j]+ " ");
            }
            System.out.println();
        }


        twoDArray[1][2]+=(twoDArray[0][2]+twoDArray[0][3]);

        System.out.println(twoDArray[1][2]);

        System.out.println("----------------------------");
        ///////////////

        int[][] twoDArray2 = {{2,4,3},{5,7,6}};

        for (int i=0; i<2; i++){
            for (int j=0; j<3; j++){
                System.out.println("twoDArray["+i+"]"+"["+j+"] = "+twoDArray2[i][j]);
            }
        }


        System.out.println("----------------------------");
        ////
        int[][] twoDArray3 = {{2,4,3},{5,7,6}};

        for (int i=0; i<2; i++){
            for (int j=0; j<3; j++){
                System.out.println("twoDArray["+i+"]"+"["+j+"] = "+twoDArray3[i][j]);
            }
            System.out.println();
        }


        System.out.println("----------------------------");
        int[][] twoDArray4 = {
                {2,4,3},
                {5,7,6}
        };

        for (int i=0; i<2; i++){
            for (int j=0; j<3; j++){
                System.out.print(" "+twoDArray4[i][j]);
            }
            System.out.println();
        }


        System.out.println("----------------------------");

        int[][][] towDArray5= {
                {{1,2}, {4,5}},
                {{7,8}, {10,11}}
        };

        for (int i=0; i<towDArray5.length; i++){
            for (int j=0; j<towDArray5.length; j++){
                for (int z=0; z<towDArray5.length; z++){
                    System.out.println("twoDArray["+i+"]"+"["+j+"]"+"["+z+"] = "+towDArray5[i][j][z]);
                }
                System.out.println();

            }

        }

        //for each loop
        String [] names = {"Anis", "suparna","naim","labib"};
                        for (String x : names ) {
                            System.out.println(x);
                        }

        System.out.println("----------------------------");

        //for each loop
        int [] name = {10,11,12,13,14,15,16};
        for (int x : name ) {
            System.out.println(x);
        }

        System.out.println("----------------------------");

        //for each loop
        int [] name1 = {10,11,12,13,14,15,16};
        int sum = 0;
        for (int x : name1 ) {
            sum = sum + x;
        }
        System.out.println("sum : "+sum);














    }
}
