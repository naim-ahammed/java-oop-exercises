package array;

import java.util.Scanner;

public class Assignment1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //declare an array of weekdays
        String[] weekDays = {"Saturday", "Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday"};

//        for (String w : weekDays){
//            System.out.println(w);
//        }

        System.out.println();
        System.out.print("Enter day number (1—7) : ");
        int n = sc.nextInt();


        for (int i=0; i<weekDays.length; i++){
//            System.out.println(i+1 +"."+weekDays[i]);

            if (n==1){
                System.out.println(weekDays[2]);
            }
            if (n==2){
                System.out.println(weekDays[3]);
            }
            if (n==3){
                System.out.println(weekDays[4]);
            }
            if (n==4){
                System.out.println(weekDays[5]);
            }
            if (n==5){
                System.out.println(weekDays[6]);
            }
            if (n==6){
                System.out.println(weekDays[0]);
            }
            if (n==7){
                System.out.println(weekDays[1]);
            }
            break;
        }



    }
}
