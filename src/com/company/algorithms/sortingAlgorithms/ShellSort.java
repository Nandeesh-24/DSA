package com.company.algorithms.sortingAlgorithms;

import java.util.Arrays;
import java.util.HashMap;

public class ShellSort<T extends Comparable<T>> {
    private final T[] array;

    public ShellSort(T[] arr) {
        this.array = arr;
    }

    public void sort() {
        for (int gap = array.length / 2; gap > 0; gap /= 2) {
            for (int i = gap; i < array.length; i++) {
                int j = i;
                T newElement = array[i];
                while (j >= gap && newElement.compareTo(array[j - gap]) < 0) {
                    array[j] = array[j - gap];
                    j -= gap;
                }
                array[j] = newElement;
            }
        }
    }

    private void sortUsingRecursion(int index, int gap) {
        if (index >= gap && array[index].compareTo(array[index - gap]) < 0) {
            T newElement = array[index];
            array[index] = array[index - gap];
            array[index - gap] = newElement;
            sortUsingRecursion(index - gap, gap);
        }
    }

    public void sortUsingRecursion() {
        for (int gap = array.length / 2; gap > 0; gap /= 2) {
            for (int i = gap; i < array.length; i++) {
                sortUsingRecursion(i,gap);
            }
        }
    }


    public void printArray() {
        System.out.println(Arrays.toString(array));
    }
}
