package problrm_solving;

import java.util.Scanner;

public class ExceptionProblemDemo {

    public static void main(String[] args) {

        while (true){
            try {
                Scanner input = new Scanner(System.in);
                System.out.print("Please enter number1 ");
                int num1 = input.nextInt();
                System.out.print("please enter number2 ");
                int num2 = input.nextInt();
                int result = num1/num2;
                System.out.println("Result : "+num1+"/" +num2 + "="+result);
            }catch (Exception e){
                System.out.println("exception :"+e);
                System.out.println("you must enter integer. please try again ");

            }
        }

    }
}
