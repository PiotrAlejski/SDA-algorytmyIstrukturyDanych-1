package test.algorytmy.structures;

import algorytmy.structures.MyLinkedList;
import algorytmy.structures.MyListInterface;

public class MyLinkedListTests {

    public static void main(String[] args) {

        MyListInterface myLinkedList = new MyLinkedList();
        System.out.println(myLinkedList.get(0));

        myLinkedList.add(5);
        System.out.println(myLinkedList.get(0));

        System.out.println();

        myLinkedList.add(3);
        myLinkedList.add(-2);
        myLinkedList.add(-1);
        myLinkedList.add(-5);
        System.out.println(myLinkedList);

        System.out.println();

        myLinkedList.delete(3);
        System.out.println("After removing 3rd element: " + myLinkedList);

    }
}
