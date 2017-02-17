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

        System.out.println();

//        HOMEWORK
        System.out.println("Homework:");

        System.out.println();

        myLinkedList.add(1, 1);
        System.out.println(myLinkedList);

        System.out.println();

        myLinkedList.put(2, 9);
        System.out.println(myLinkedList);

        System.out.println();

        MyListInterface myList = new MyLinkedList();
        myList.add(4);
        myList.add(5);
        myList.add(13);

        myLinkedList.addAll(myList);
        System.out.println(myLinkedList);

        System.out.println();

        myLinkedList.addAll(2, myList);
        System.out.println(myLinkedList);

        System.out.println();

        MyListInterface myClonedList = myLinkedList.clone();
        System.out.println(myClonedList);

        System.out.println();

        myLinkedList.addAll(myClonedList);
        System.out.println(myLinkedList);

    }
}
