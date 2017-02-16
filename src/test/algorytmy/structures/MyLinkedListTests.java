package test.algorytmy.structures;

import algorytmy.structures.MyLinkedList;
import algorytmy.structures.MyListInterface;

public class MyLinkedListTests {

    public static void main(String[] args) {

        MyListInterface myListInterface = new MyLinkedList();
        System.out.println(myListInterface.get(0));

        myListInterface.add(5);
        System.out.println(myListInterface.get(0));
    }
}
