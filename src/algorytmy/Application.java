package algorytmy;

import algorytmy.structures.MyList;

public class Application {
    public static void main(String[] args) {


//        do MyList:

        MyList myList = new MyList();
        myList.add(2);
        myList.add(3);
        myList.add(-3);
        myList.add(-1);
        myList.add(0);
        myList.add(2);
        myList.add(2);
        myList.add(3);
        myList.add(-3);
        myList.add(-1);
        myList.add(0);
        myList.add(2);
        System.out.println(myList.get(11));

    }
}
