package exception_handling;

public class ExceptionDemo {

    public static void main(String[] args) {

        try{
            int x =10;
            int y=0;
            int result =x/y;
            System.out.println("Result :"+result);
        }catch (ArithmeticException e1){
            System.out.println("Exception : "+e1);
        }catch (ArrayIndexOutOfBoundsException e){
        System.out.println("Exception : "+e);
        }

        try{
            int [] a = new int[4];
            a[4] = 10;

        }catch (ArithmeticException e1){
            System.out.println("Exception : "+e1);
        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println("Exception : "+e);
        }
        finally {
            System.out.println("last line of program ");

        }






    }

}
