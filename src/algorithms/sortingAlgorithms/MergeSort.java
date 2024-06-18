package algorithms.sortingAlgorithms;

public class MergeSort {
    static int[] array = {20, 32, -19, 89, 9, 12, -22};
    public static void main(String[] args) {
        mergeSort(array,2,3);
        System.out.println(array);
    }

    public static void mergeSort(int[] arr,int start,int end){
        if (end-start < 2)
            return;
        int mid = (start + end) / 2;
        mergeSort(arr,start,mid);
        mergeSort(arr,mid,end);
        merge(arr, start, end, mid);
    }

    private static void merge(int[] arr, int start, int end, int mid) {
        if (arr[mid-1] <= arr[mid])
            return;
        merge(arr, start, mid, end);
        int i = start;
        int j = end;
        int tempIndex = 0;

        int[] temp = new int[end-start];

        while (i < mid && j < end){
            temp[tempIndex++] = arr[i] <= arr[j] ? arr[i++] : arr[j++];
        }
    }

}
