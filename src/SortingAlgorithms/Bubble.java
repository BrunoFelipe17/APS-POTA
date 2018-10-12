package SortingAlgorithms;

public class Bubble<T extends Comparable<T>> {

    public <T extends Comparable<T>> T[] sort(T[] arr) {
        boolean swapped = true;
        int n = arr.length;
        int comparison = 0;
        int swap = 0;
        while (n != 0) {
            int newN = 0;
            for (int i = 1; i < n; i++) {
                comparison++;
                if (arr[i].compareTo(arr[i - 1]) < 0) {
                    T value = arr[i];
                    arr[i] = arr[i - 1];
                    arr[i - 1] = value;
                    swap++;
                    newN = i;
                }
            }
            n = newN;
        }
        System.out.println(comparison + " " + swap);
        return arr;
    }
}
