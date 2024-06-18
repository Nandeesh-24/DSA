package algorithms.searchAlgorithms;

public class BinarySearch {
    /*
    Runtime complexity = O(log n)
     */
    public static void main(String[] args) {
        int[] array = {20, 32, -19, 89, 9, 12, -22};

        System.out.println(binarySearch(array, 89));
    }

    public static int binarySearch(int[] array, int target){
        int low = 0;
        int high = array.length-1;
        while (low <= high){
            int middle = low + (high-low) / 2;

            if (array[middle] > target)
                low = middle + 1;
            else if (array[middle] < target)
                high = middle - 1;
            else
                return middle;
        }
        return -1;
    }
}
