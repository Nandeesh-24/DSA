package algorithms.searchAlgorithms;

public class LinearSearch {
    /*
    Runtime complexity = O(n)
     */
    public static void main(String[] args) {
        int[] array = {20, 32, -19, 89, 9, 12, -22};

        System.out.println(linearSearch(array, 89));
    }

    public static int linearSearch(int[] array, int target){
        for (int i = 0; i < target; i++){
            if (array[i] == target)
                return i;
        }
        return -1;
    }
}
