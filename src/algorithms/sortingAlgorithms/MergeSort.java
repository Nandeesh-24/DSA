package algorithms.sortingAlgorithms;

import java.util.Arrays;

public class MergeSort {
    static int[] array = {20, 32, -19, 89, 9, 12, -22};
    public static void main(String[] args) {
        mergeSort(array);
        System.out.println(Arrays.toString(array));
    }

    public static void mergeSort(int[] arr){
        int length = arr.length;
        if(length <= 1) return;//base class

        int middle = length/2;
        int[] leftArray = new int[middle];
        int[] rightArray = new int[length-middle];

        int i=0,j=0;

        for (; i < length; i++){
            if (i < middle){
                leftArray[i] = arr[i];
            }else{
                rightArray[j] = arr[i];
                j++;
            }
        }

        mergeSort(leftArray);
        mergeSort(rightArray);
        merge(leftArray,rightArray,arr);
    }

    private static void merge(int[] leftArray, int[] rightArray,int[] arr) {

        int leftSize = arr.length/2;
        int rightSize = arr.length-leftSize;

        int i = 0, l = 0, r = 0;

        while (l < leftSize && r < rightSize){
            if (leftArray[l] < rightArray[r]){
                arr[i] = leftArray[l];
                i++;
                l++;
            }else{
                arr[i] = rightArray[r];
                i++;
                r++;
            }
        }

        while (l < leftSize){
            arr[i] = leftArray[l];
            i++;
            l++;
        }

        while (r < rightSize){
            arr[i] = rightArray[r];
            i++;
            r++;
        }
    }

}
