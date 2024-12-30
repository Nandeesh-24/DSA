package algorithms.sortingAlgorithms;

import java.util.Arrays;

public class QuickSort {
    static int[] array = {20, 32, -19, 89, 9, 12, -22};
    public static void main(String[] args) {
        quickSort(array, 0, array.length-1);
        System.out.println(Arrays.toString(array));
    }

    public static void quickSort(int[] arr, int start, int end){
        if (end <= start) return; //base class

        int pivot = partition(arr, start, end);
        quickSort(arr, start, pivot-1);
        quickSort(arr,pivot+1, end);
    }

    private static int partition(int[] arr, int start, int end) {
        int pivot = arr[end];

        int i = start-1;

        for (int j = start; j <= end-1; j++){
            if (arr[j] < pivot){
                i++;
                swap(arr,i,j);
            }
        }

        i++;
        swap(arr, i, end);
        return i;
    }

    private static void swap(int[] arr, int i, int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

}
