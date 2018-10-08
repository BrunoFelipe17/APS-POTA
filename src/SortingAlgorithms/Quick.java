package SortingAlgorithms;

public class Quick {

    public static int comparison = 0;

    public static int partition(int arr[], int low, int high) {
        int pivot = arr[low];
        int left = low + 1;
        int right = high - 1;
        int aux = 0;

        while (left <= right) {
            while (left <= right && arr[left] <= pivot) {
                left += 1;
                comparison++;
            }
            while (arr[right] > pivot) {
                right -= 1;
                comparison++;
            }
            if (left < right) {
                aux = arr[left];
                arr[left] = arr[right];
                arr[right] = aux;
                left += 1;
                right -= 1;
            }
        }
        arr[low] = arr[right];
        arr[right] = pivot;
        return left;
    }

    public static void sort(int arr[], int low, int high) {
        if (low < high) {
            int mid = partition(arr, low, high);
            sort(arr, low, mid - 1);
            sort(arr, mid + 1, high);
        }
    }
}
