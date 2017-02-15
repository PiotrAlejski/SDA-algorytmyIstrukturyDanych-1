package algorytmy.structures;

public class MyList {

    private final int INITIAL_SIZE = 10;
    private int[] array;

    // size - faktyczna liczba elementow

    private int size;

    public MyList() {
        this.array = new int[INITIAL_SIZE];
        this.size = 0;
    }

//    metoda spr czy indeks jest poprawny

    public int get(int index) {
        if(index >= 0 && index < size) {
            return array[index];
        } else {
            System.out.println("Wrong index");
            return 0;
        }

    }

//    dodawanie elementu
//    add niczego nie zwraca, void

    public void add(int value) {

//        stawianie wartosci na koniec tablicy
//        if jezeli size juz jest dlugosci tablicy nie mozemy dodac kolejnego elementu

        if(size >= array.length) {

//            System.out.println("[My List] is full");
//            zamiana na doubleCapacity

            doubleCapacity();
        }

//        usuwamy elsa, bo jak ktos chce dodac, zawsze ma sie dodac

            array[size] = value;
            size++;
    }

    public MyList clone() {
        MyList tmpList = new MyList();
        tmpList.array = rewrite(new int[this.array.length]);

//        gdybysmy zrobili jak ponizej robimy referencje a nie klona
//        tmpList.array = this.array

        tmpList.size = this.size;
        return tmpList;
    }

    private void doubleCapacity() {
        int[] tmpArray = new int[size * 2];
        this.array = rewrite(tmpArray);
    }

    private int[] rewrite(int[] tmpArray) {
        for (int i = 0; i < array.length; i++) {
            this.array[i] = tmpArray[i];
        }
        return tmpArray;
    }

    public int getSize() {
        return size;
    }
}
