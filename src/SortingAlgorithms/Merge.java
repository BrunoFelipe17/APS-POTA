package SortingAlgorithms;

public class Merge {

    public static int comparison;
    public static int swap;

    public static void intercala(int[] numbers, int left, int mid, int right) {
        int[] temp = new int[numbers.length];
        int i;
        int leftEnd;
        int numElements;
        int nTemp;

        leftEnd = (mid - 1);
        nTemp = left;
        numElements = (right - left + 1);

        while ((left <= leftEnd) && (mid <= right)) {

            if (numbers[left] <= numbers[mid]) {
                temp[nTemp++] = numbers[left++];
            } else {
                temp[nTemp++] = numbers[mid++];
            }
            comparison++;
            swap++;
        }

        while (left <= leftEnd) {
            temp[nTemp++] = numbers[left++];
            swap++;
        }
        while (mid <= right) {
            temp[nTemp++] = numbers[mid++];
            swap++;
        }
        for (i = 0; i < numElements; i++) {
            numbers[right] = temp[right];
            right--;
            swap++;
        }
    }

    public static void merge(int[] arr, int left, int right) {
        int mid;
        if (right > left) {
            mid = (right + left) / 2;
            merge(arr, left, mid);
            merge(arr, (mid + 1), right);
            intercala(arr, left, (mid + 1), right);
        }

    }
}