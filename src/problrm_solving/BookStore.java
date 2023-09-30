package problrm_solving;

import java.util.Scanner;


public class BookStore {

    static Scanner myScanner = new Scanner(System.in);

    static String[]  books={"Java","C","Python"};
    static final double StudentDiscount=0.3;
    static final double teacherDiscount=0.4;
    static final double alinDiscount=0.0;

    public static void main(String[] args) {

        prln("..........welcome to our bookstore...........");
        prln("which book do you want?\n Ans: ");

        String userChoice = myScanner.nextLine();

        if (books[0].toLowerCase().equals(userChoice.toLowerCase())){
            prln("you opted for "+books[0]+" book");
            calculatePrice(books[0]);

        }else if (books[0].toLowerCase().equals(userChoice.toLowerCase())){
            prln("you opted for "+books[1]+" book");
            calculatePrice(books[1]);
        }else if (books[0].toLowerCase().equals(userChoice.toLowerCase())){
            prln("you opted for "+books[2]+" book");
            calculatePrice(books[2]);
        }else {
            prln("sorry , we you dont have book");

        }
    }




    static void calculatePrice(String bookName){
        prln("are you student" +"\nTeacher"+"\nAlen");
        String answer = myScanner.nextLine();
        double price= 200;

        if(answer.toLowerCase().equals("student")){
            price=price-(price*StudentDiscount);
            showPrice(price);
        }else if(answer.toLowerCase().equals("Teacher")){
            price=price-(price*teacherDiscount);
            showPrice(price);

        }else if(answer.toLowerCase().equals("alin")){
            price=price-(price*alinDiscount);
            showPrice(price);

        }else {

            System.out.println("sorry, we can not serve you!!");
        }
    }

    static void showPrice(double priceShow){
        System.out.println("your total amount: "+priceShow);
        System.out.println("\n-------thank you for shopping------------");
    }

    static void prln(Object anyObject){
        System.out.println(anyObject);
    }
    static void pr(Object anyObject){
        System.out.println(anyObject);
    }
}
