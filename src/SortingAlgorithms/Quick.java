package SortingAlgorithms;

public class Quick {

    public static int comparison = 0;
    public static int swap = 0;

    public static int partition(int arr[], int low, int high) {
        int pivot = arr[(low + high) / 2];
//        int pivot = arr[low];
        int left = low;
        int right = high;
        int aux = 0;

        while (left < right) {
            comparison++;
            while (arr[left] < pivot) {
                left++;
                comparison++;
            }
            while (arr[right] > pivot) {
                right--;
                comparison++;
            }

            if (left < right) {
                aux = arr[left];
                arr[left] = arr[right];
                arr[right] = aux;
                left++;
                right--;
                swap++;
            }
        }
        return left;
    }

    public static void sort(int arr[], int low, int high) {

        if (low < high) {
            int mid = partition(arr, low, high);
            sort(arr, low, mid-1);
            sort(arr, mid+1, high);
        }
    }
}
