package array;
public class Array3 {

    public static void main(String[] args) {
        // 1234
        // 5677
        int [][] twoDArray=new int[2][4];

        twoDArray[0][0]=1;
        twoDArray[0][1]=2;
        twoDArray[0][2]=3;
        twoDArray[0][3]=4;

        twoDArray[1][0]=5;
        twoDArray[1][1]=6;
        twoDArray[1][2]=7;
        twoDArray[1][3]=8;

        twoDArray[1][2]+=(twoDArray[0][2]+twoDArray[0][3]);

        System.out.println(twoDArray[1][2]);
    }
}
