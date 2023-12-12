package linkedList;

import java.util.LinkedList;

public class LinkedList1 {
    public static void main(String[] args) {

        LinkedList<String> stringLinkedList = new LinkedList<>();

        stringLinkedList.add("naim");
        stringLinkedList.add("Faim");
        System.out.println("stringLinkedList = "+stringLinkedList);


        LinkedList<Integer> integerLinkedList = new LinkedList<>();
        integerLinkedList.add(10);
        integerLinkedList.add(20);

        System.out.println("integerLinkedList = "+integerLinkedList);

        System.out.println("getFirst = "+integerLinkedList.getFirst());
        System.out.println("getLast = "+integerLinkedList.getLast());
        integerLinkedList.removeFirst();
        System.out.println("removeFirst = "+integerLinkedList);
        integerLinkedList.addFirst(10);
        System.out.println("addFirst = "+integerLinkedList);
        integerLinkedList.removeLast();
        System.out.println("removeLast = "+integerLinkedList);
        integerLinkedList.addLast(20);
        System.out.println("addLast = "+integerLinkedList);

    }
}
