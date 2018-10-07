package SortingAlgorithms;

public class Insertion<T extends Comparable<T>> {

    public static <T extends Comparable<T>> T[] sort(T arr[])  {
        int n = arr.length;
        int comparison = 0;
        for (int i=1; i<n; ++i) {
            T key = arr[i];
            int j = i-1;
            while (j>=0 && arr[j].compareTo(key) > 0) {
                comparison++;
                arr[j+1] = arr[j];
                j = j-1;
            }
            arr[j+1] = key;
        }
        System.out.println("Comparison: " + comparison);
        return arr;
    }
}
