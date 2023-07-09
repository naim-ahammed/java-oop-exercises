package file;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Formatter;
import java.util.Scanner;

public class FileDemo1 {
    public static void main(String[] args) {
//        File dir = new File("person1");
//        dir.mkdir();//diractory will be created
//        String dirlocation = dir1.getAbsolutePath();
//        System.out.println(dirlocation);


//        File dir2 = new File("C:/Users/ASUS/OneDrive/Desktop/person1");//C:\Users\ASUS\OneDrive\Desktop
//        dir2.mkdir();//diractory will be created
//        String dirlocation = dir2.getAbsolutePath();
//        System.out.println(dirlocation);

        File dir1 = new File("D:/code/Ijava/NewClass/src/file/person1");//D:\code\Ijava\NewClass\src\file
        dir1.mkdir();//diractory will be created

        String dirlocation = dir1.getAbsolutePath();
        System.out.println(dirlocation);

        System.out.println(dir1.getName());

        if(dir1.delete()){
            System.out.println(dir1.getName()+" ............this folder has been deleted");
        }

//       new expince 2
        File dir4 = new File("D:/code/Ijava/NewClass/src/file/person/fastClass.txt");
        File dir5 = new File("D:/code/Ijava/NewClass/src/file/person/2ndClass.txt");

        try {
            dir4.createNewFile();
            dir5.createNewFile();
            System.out.println("file are created");

        }catch (Exception e){
            System.out.println(e);
        }
//       new expince 3
        if (dir4.exists() && dir5.exists()) {

            System.out.println("file exists");
            String dirlocation1 = dir4.getAbsolutePath();
            System.out.println(dirlocation1);

            String dirlocation5 = dir5.getAbsolutePath();
            System.out.println(dirlocation5);
        }else {
            System.out.println("file does not exists");
        }

//       new expince class 2 written

        String id, name;

        try {
            Formatter formatter = new Formatter("D:/code/Ijava/NewClass/src/file/person/fastClass.txt");


            Scanner input = new Scanner(System.in);
            System.out.println("how many student :");
            int num = input.nextInt();

            for (int i = 1; i<=num; i++){
                System.out.println(i+" enter student id and name :");

                id = input.next();
                name = input.next();
                formatter.format("%s %s\r\n", id,name);
            }

            formatter.format("%s %s\r\n", "100","naim");
            formatter.format("%s %s\r\n", "100","naim");
            formatter.format("%s %s\r\n", "100","naim");
            formatter.format("%s %s\r\n", "100","naim");
            formatter.format("%s %s\r\n", "100","naim");
            formatter.format("%s %s\r\n", "100","naim");

            formatter.close();

            System.out.println("your file is written");
        }catch (FileNotFoundException e){
            System.out.println(e);
        }



//       new expince class 2 read

        try {
            File dir3 = new File("D:/code/Ijava/NewClass/src/file/person/fastClass.txt");

            Scanner scanner = new Scanner(dir3);

            while (scanner.hasNext()){
                String id1 = scanner.next();
                String name1 = scanner.next();
                System.out.println("id : "+ id1 + "      name : "+ name1);
            }

            scanner.close();

        }catch (Exception e){
            System.out.println(e);
        }








    }
}
