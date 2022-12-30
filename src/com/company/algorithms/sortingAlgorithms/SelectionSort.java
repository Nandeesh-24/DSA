package com.company.algorithms.sortingAlgorithms;

import com.company.utilMethos.HelperClass;

import java.util.Arrays;

public class SelectionSort {
    public static void main(String[] args) {
        int[] array = {20, 32, -19, 89, 9, 12, -22};

        for (int lastIndex = array.length - 1; lastIndex > 0; lastIndex--) {
            int largestIndex = 0;
            for (int currentIndex = 1; currentIndex <= lastIndex; currentIndex++) { //check the equals
                if (array[currentIndex] > array[largestIndex]) {
                    largestIndex = currentIndex;
                }
            }
            HelperClass.swap(array, largestIndex, lastIndex);
        }

        System.out.println(Arrays.toString(array));
    }
}
