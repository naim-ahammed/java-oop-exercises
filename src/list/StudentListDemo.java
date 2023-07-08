package list;

import java.util.LinkedList;

public class StudentListDemo {

    public static void main(String[] args) {
        LinkedList<Student> list = new LinkedList<Student>();

        Student s1 = new Student(1, "naim", "1st year");
        Student s2 = new Student(2, "haim", "1st year");
        Student s3 = new Student(3, "gaim", "1st year");
        Student s4 = new Student(4, "eaim", "1st year");

        list.add(s1);
        list.add(s2);
        list.add(s3);
        list.add(s4);


        for (Student s : list){
            System.out.println(s.id+" "+s.name +" "+s.className+" ");
        }


    }


}
