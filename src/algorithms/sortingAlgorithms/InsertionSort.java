package algorithms.sortingAlgorithms;

import java.util.Arrays;

public class InsertionSort {
    public static void main(String[] args) {
        int[] array = {20, 32, -19, 89, 9, 12, -22};

        for (int firstUnsortedIndex = 1; firstUnsortedIndex < array.length; firstUnsortedIndex++) {
            int newElement = array[firstUnsortedIndex];
            int currentIndex;
            for (currentIndex = firstUnsortedIndex; currentIndex > 0 && array[currentIndex - 1] > newElement; currentIndex--) {
                array[currentIndex] = array[currentIndex - 1];
            }
            array[currentIndex] = newElement;
        }

        System.out.println(Arrays.toString(array));
    }
}
