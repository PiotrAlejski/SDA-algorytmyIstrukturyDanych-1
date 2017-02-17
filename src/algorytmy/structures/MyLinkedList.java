package algorytmy.structures;

public class MyLinkedList implements MyListInterface {

//    kazde pole zawiera dwie informacje:
//    wartosc i referencje, jaki element jest nastepny

    private int value;
    private MyLinkedList next;

    //    HOMEWORK!
    @Override
    public void add(int index, int value) {
        if (index < getSize()) {

            MyLinkedList shiftingElement = getElement(index);
            MyLinkedList previousElement = getElement(index - 1);

            MyLinkedList addingElement = new MyLinkedList();
            addingElement.value = value;

            addingElement.next = shiftingElement;
            previousElement.next = addingElement;
        }
    }

    @Override
    public void put(int index, int value) {
        if (index < getSize()) {

            MyLinkedList changedElement = getElement(index);
            MyLinkedList nextElement = getElement(index + 1);

            MyLinkedList puttedElement = new MyLinkedList();
            puttedElement.value = value;

            changedElement.next = nextElement;

            changedElement.value = puttedElement.value;
        }
    }

    @Override
    public void addAll(MyListInterface myList) {
        for(int i = 0; i < myList.getSize(); i++) {
            this.add(myList.get(i));
        }
    }

    @Override
    public void addAll(int index, MyListInterface myList) {
        for(int i = 0; i < myList.getSize(); i++) {
            this.add(index + 1, myList.get(i));
        }
    }

    @Override
    public MyListInterface clone() {
        MyListInterface myLinkedList = this;
        MyListInterface clonedList = new MyLinkedList();

        clonedList.addAll(myLinkedList);

        return clonedList;
    }

//    end of homework


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


//    element jest ostatni, jak jest null'em

    @Override
    public int get(int index) {
        MyLinkedList myLinkedList = getElement(index);
        if (myLinkedList == null) {
            System.out.println("Wrong index");
            return 0;
        }
        return myLinkedList.value;
    }

//    metoda zabierajca konkretny element z indeksu

    private MyLinkedList getElement(int index) {
        MyLinkedList myLinkedList = this;
        for (int i = 0; i <= index; i++) {
            if (myLinkedList.next == null) {
                return null;
            }
            myLinkedList = myLinkedList.next;
        }
        return myLinkedList;
    }

    @Override
    public void delete(int index) {
        if (index < getSize()) {
            MyLinkedList previousElement = getElement(index - 1);

//            odhaczenie next'a i ustawić na null'a:
//            odpowiednia kolejnosc najpierw poloczenie z kolejnym next'em

            MyLinkedList deletingElement = getElement(index);
            previousElement.next = deletingElement.next;
            deletingElement.next = null;
        }

    }

    @Override
    public int getSize() {
        int counter = 0;
        MyLinkedList myLinkedList = this;
        while (myLinkedList.next != null) {
            counter++;
            myLinkedList = myLinkedList.next;
        }
        return counter;
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("[");
        for (int i = 0; i < this.getSize(); i++) {
            stringBuilder.append(this.get(i));
            if (i != getSize() - 1) {
                stringBuilder.append(",");
            }
        }
        stringBuilder.append("]");
        return stringBuilder.toString();
    }
}
