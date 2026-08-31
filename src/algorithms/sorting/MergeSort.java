package algorithms.sorting;

public class MergeSort {
    static void mergeSort(int[] arr, int low, int high) {
        if (low >= high) return;

        int mid = low + (high - low) / 2;
        mergeSort(arr, low, mid);
        mergeSort(arr, mid + 1, high);
        merge(arr, low, mid, high);
    }

    static void merge(int[] arr, int low, int mid, int high) {
        int[] temp = new int[high - low + 1];
        int left = low, right = mid + 1, i = 0;

        while (left <= mid && right <= high) {
            if (arr[left] <= arr[right]) temp[i++] = arr[left++];
            else temp[i++] = arr[right++];
        }
        while (left <= mid) temp[i++] = arr[left++];
        while (right <= high) temp[i++] = arr[right++];

        for (int j = low; j <= high; j++) arr[j] = temp[j - low];
    }

    public static void main(String[] args) {
        int[] arr = {32, 14, 24, 54, 63, 54, 14};
        mergeSort(arr, 0, arr.length - 1);
        for (int n : arr) System.out.print(n + " ");
    }
}
// Interview note: merge sort is O(n log n) time and uses O(n) auxiliary space for arrays.
