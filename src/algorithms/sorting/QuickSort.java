package algorithms.sorting;

public class QuickSort {
    static void quickSort(int[] arr, int low, int high) {
        if (low >= high) return;

        int pivotIndex = partition(arr, low, high);
        quickSort(arr, low, pivotIndex - 1);
        quickSort(arr, pivotIndex + 1, high);
    }

    static int partition(int[] arr, int low, int high) {
        int pivot = arr[low];
        int i = low + 1, j = high;

        while (true) {
            while (i <= high && arr[i] <= pivot) i++;
            while (j >= low && arr[j] > pivot) j--;
            if (i >= j) break;

            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
        }

        int temp = arr[low];
        arr[low] = arr[j];
        arr[j] = temp;
        return j;
    }

    public static void main(String[] args) {
        int[] arr = {32, 14, 24, 54, 63, 54, 14};
        quickSort(arr, 0, arr.length - 1);
        for (int n : arr) System.out.print(n + " ");
    }
}
// Interview note: average quicksort time is O(n log n), but poor pivot choices can lead to O(n^2).
