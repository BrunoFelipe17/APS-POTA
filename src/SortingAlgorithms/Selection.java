package SortingAlgorithms;

public class Selection<T extends Comparable<T>> {

    public static <T extends Comparable<T>> T[] sort(T arr[])  {
        int n = arr.length;
        int comparison = 0;
        for (int i = 0; i < n-1; i++) {
            int min = i;
            for (int j = i + 1; j < n; j++) {
                comparison++;
                if (arr[j].compareTo(arr[min]) < 0) {
                    min = j;
                }
            }
            T temp = arr[min];
            arr[min] = arr[i];
            arr[i] = temp;
        }
        System.out.println("Comparison: " + comparison);
        return arr;
    }
}
