package algorytmy.structures;

public class MyLinkedList implements MyListInterface{

//    kazde pole zawiera dwie informacje:
//    wartosc i referencje, jaki element jest nastepny

    private int value;
    private MyLinkedList next;

    //        zeby dostac sie do 3ciego elementu musimy przejsc przez 3 - do pobierania jest gorsze niz ArrayList

    @Override
    public void add(int value) {
        MyLinkedList myLinkedList = getLast();

//        tworzymy nowy obiekt

        MyLinkedList tmpObject = new MyLinkedList();

//        nadajemy nowemu obiektowi wartosc

        tmpObject.value = value;

//        na elemencie ostatnim ustawiamy next na nowy obiekt

        myLinkedList.next = tmpObject;
    }

//    zwracanie ostatniego obiektu, obiekt, ktory ma referencje do next

    private MyLinkedList getLast() {

//        this: to na rzecz czego wywolujemy

        MyLinkedList myLinkedList = this;
        while (myLinkedList.next != null) {
            myLinkedList = myLinkedList.next;
        }
        return myLinkedList;
    }

    @Override
    public void add(int index, int value) {

    }

//    element jest ostatni, jak jest null'em

    @Override
    public int get(int index) {
        MyLinkedList myLinkedList = this;
            for (int i = 0; i <= index; i++) {
                if (myLinkedList.next == null) {
                    System.out.println("Wrong index");
                    return 0;
                }
                myLinkedList = myLinkedList.next;
            }
        return myLinkedList.value;
    }

    @Override
    public void put(int index, int value) {

    }

    @Override
    public void addAll(MyListInterface myList) {

    }

    @Override
    public void addAll(int index, MyListInterface myList) {

    }

    @Override
    public void delete(int index) {

    }

    @Override
    public MyListInterface clone() {
        return null;
    }

    @Override
    public int getSize() {
        return 0;
    }
}
