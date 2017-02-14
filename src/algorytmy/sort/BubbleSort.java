package algorytmy.sort;

import java.util.Arrays;

public class BubbleSort {

    public static void main(String[] args) {
        BubbleSort bubbleSort = new BubbleSort();
        int[] array = {1, 2, 3, 4, 7, 6, 8};
//        wrap with expression: Arrays.toString - podpowiedz, alt+enter
        System.out.println(Arrays.toString(bubbleSort.ascSort(array)));
        System.out.println(Arrays.toString(bubbleSort.descSort(array)));
    }

    public int[] ascSort(int[] array) {
//        jak jest posortowane, to mniej operacji
        int counter = 0;
        boolean flag = true;
        for (int i = 0; i < array.length - 1; i++) {
            flag = true;
//            skracanie po kazdym przejciu tablice
            for (int j = 0; j < array.length - 1 - i; j++) {
//                licznik operacji:
                counter++;
                if (array[j] > array[j + 1]) {
//                    przestawiamy wartosci pod indeksem, nie wartosci
                    swap(array, j, j + 1);
                    flag = false;
                }
            }
            if (flag) {
                break;
            }
        }
        System.out.println(counter);
        return array;
    }

    public int[] descSort(int[] array) {
        int counter = 0;
        boolean flag = true;
        for (int i = 0; i < array.length - 1; i++) {
            flag = true;
            for (int j = 0; j < array.length - 1 - i; j++) {
                counter++;
                if (array[j] < array[j + 1]) {
                    swap(array, j, j + 1);
                    flag = false;
                }
            }
            if (flag) {
                break;
            }
        }
        System.out.println(counter);
        return array;
    }

    public void swap(int[] array, int index1, int index2) {
        int tmp = array[index1];
        array[index1] = array[index2];
        array[index2] = tmp;
    }
}
