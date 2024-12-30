package algorithms.sortingAlgorithms;

import utilMethos.HelperClass;

import java.util.Arrays;

public class InsertionSort {
    public static void main(String[] args) {
        int[] array = {20, 32, -19, 89, 9, 12, -22};

        for (int i = 1; i < array.length; i++) {
            int temp = array[i];
            int j = i-1;
            while (j >= 0 && array[j] > temp){
                array[j+1] = array[j];
                j--;
            }
            array[j+1] = temp;
        }

        System.out.println(Arrays.toString(array));
    }
}
