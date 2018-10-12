package SortingAlgorithms;

public class Merge {

    public static int comparison = 0;
    public static int swap = 0;

    public static void merge(int[] array, int low, int middle, int high) {
        int[] helper = new int[array.length];
        for (int i = low; i <= high; i++) {
            helper[i] = array[i];
            swap++;
        }

        int helperLeft = low;
        int helperRight = middle + 1;
        int current = low;

        while (helperLeft <= middle && helperRight <= high) {
            comparison++;
            swap++;
            if (helper[helperLeft] <= helper[helperRight]) {
                array[current] = helper[helperLeft];
                helperLeft++;
            } else {
                array[current] = helper[helperRight];
                helperRight++;
            }
            current++;
        }
        int remaining = middle - helperLeft;
        for (int i = 0; i <= remaining; i++) {
            array[current + i] = helper[helperLeft + i];
        }


    }

    public static void mergeSort(int[] array, int low, int high) {
        if (low < high) {
            int middle = (low + high) / 2;
            mergeSort(array, low, middle);
            mergeSort(array, middle + 1, high);
            merge(array, low, middle, high);
        }
    }
}