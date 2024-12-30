package algorithms.sortingAlgorithms;

import utilMethos.HelperClass;

import java.util.Arrays;

public class SelectionSort {
    public static void main(String[] args) {
        int[] array = {20, 32, -19, 89, 9, 12, -22};

        for (int i = 0; i < array.length-1; i++) {
            int min = i;
            for (int j = i; j < array.length; j++) { //check the equals
                if (array[min] > array[j])
                    min = j;
            }
            HelperClass.swap(array, min, i);
        }

        System.out.println(Arrays.toString(array));
    }
}
