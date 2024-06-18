package algorithms.sortingAlgorithms;

import utilMethos.HelperClass;

import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {
        int[] array = {20, 32, -19, 89, 9, 12, -22};

        for (int i = 0; i < array.length-1; i++) {
            for (int j = 0; j < array.length-i-1; j++) {
                if (array[j] > array[j+1]) {
                    HelperClass.swap(array, j, j + 1);
                }
            }
        }
        System.out.println(Arrays.toString(array));
    }
}
