package com.company.algorithms.sortingAlgorithms;

import com.company.utilMethos.HelperClass;

import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {
        int[] array = {20, 32, -19, 89, 9, 12, -22};

        for (int lastIndex = array.length - 1; lastIndex > 0; lastIndex--) {
            for (int currentIndex = 0; currentIndex < lastIndex; currentIndex++) {
                if (array[currentIndex] > array[currentIndex + 1]) {
                    HelperClass.swap(array, currentIndex, currentIndex + 1);
                }
            }
        }
        System.out.println(Arrays.toString(array));
    }
}
