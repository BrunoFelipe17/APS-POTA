package SortingAlgorithms;

public class Selection<T extends Comparable<T>> {

    public static <T extends Comparable<T>> T[] sort(T arr[])  {
        int n = arr.length;
        int comparison = 0;
        int swap = 0;
        for (int i = 0; i < n-1; i++) {
            int min = i;
            for (int j = i + 1; j < n; j++) {
                if (arr[j].compareTo(arr[min]) < 0) {
                    min = j;
                    swap++;
                }
                comparison++;
            }
            T temp = arr[min];
            arr[min] = arr[i];
            arr[i] = temp;
        }

        // FORMULA: n²/2 + n/2
        // (Math.pow(n, 2) / 2) - (n / 2)
//        System.out.println(comparison);
        System.out.println(swap);
        return arr;
    }
}
