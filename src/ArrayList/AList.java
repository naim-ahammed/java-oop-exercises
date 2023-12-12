package ArrayList;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class AList {
    public static void main(String[] args) {

        ArrayList<Integer> arrayList= new ArrayList<Integer>(4);
        ArrayList<Integer> arrayList1 = new ArrayList<>();
        ArrayList<Integer> arrayList2 = new ArrayList<>();
        ArrayList<Integer> arrayList3 = new ArrayList<>();

        System.out.println("Array List size = "+ arrayList.size());

        arrayList.add(10);
        arrayList.add(20);
        arrayList.add(30);
        arrayList.add(3,40);

        System.out.println("arrayList = "+arrayList);

        //for each loop
        System.out.print("for each loop arrayList = ");
        for (int x: arrayList){
            System.out.print(+x+" ");
        }


        System.out.println("\n"+"Array List size = "+ arrayList.size());

        System.out.print("iterator = ");
        Iterator iterator = arrayList.iterator();
        while (iterator.hasNext()){
            System.out.print(iterator.next()+" ");
        }


        boolean arrayListEmpty = arrayList.isEmpty();
        System.out.println("\n"+"array List is Empty = "+arrayListEmpty);

        boolean contains = arrayList.contains(30);
        System.out.println("30 is the array List contains = "+contains);

        int position = arrayList.indexOf(40);
        System.out.println("the index of 40 is = "+position);




        ///////////////
        arrayList1.add(5);
        arrayList1.add(2);
        arrayList1.add(3);
        arrayList1.add(4);
        arrayList1.add(1);

        Collections.sort(arrayList1); //sort array list
        System.out.println("sort in ascending arrayList1 = "+arrayList1);

        Collections.sort(arrayList1,Collections.reverseOrder()); //reverseOrder
        System.out.println("sort in descending arrayList1 = "+arrayList1);



        arrayList2.add(10);
        arrayList2.add(20);
        arrayList2.add(30);
        arrayList2.add(40);

        System.out.println("arrayList1 = "+arrayList2);

        boolean equal = arrayList.equals(arrayList1);
        System.out.println("equal = " + equal) ;

        equal = arrayList.equals(arrayList2);
        System.out.println("equal = "+ equal);


        arrayList3.add(10);
        arrayList3.add(20);
        arrayList3.add(30);
        arrayList3.add(40);





/////////////////////////////
        arrayList.set(2,50);
        System.out.println("after setting = "+arrayList);

        int x = arrayList.get(0);
        System.out.println("get index 0 = "+x);

        //removing elements
        arrayList.remove(0);
        System.out.println("\n"+"removing elements = "+arrayList);

        arrayList.removeAll(arrayList);
        System.out.println("removeAll arrayList = "+arrayList);

        arrayList.clear();
        System.out.println("clear arrayList = "+arrayList);



    }
}
