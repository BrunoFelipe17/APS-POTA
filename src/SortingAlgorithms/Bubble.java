package SortingAlgorithms;

public class Bubble<T extends Comparable<T>> {

    public static <T extends Comparable<T>> T[] sort(T[] arr) {
        boolean swapped = true;
        int n = arr.length;
        int comparison = 0;
        while (swapped) {
            swapped = false;
            for (int i = 1; i < n; i++) {
                comparison++;
                if (arr[i].compareTo(arr[i - 1]) < 0) {
                    System.out.println("to aqui");
                    T value = arr[i];
                    arr[i] = arr[i - 1];
                    arr[i - 1] = value;
                    swapped = true;
                }
            }
        }
        System.out.println(comparison);
        return arr;
    }
}
