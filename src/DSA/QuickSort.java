package DSA;

public class QuickSort {

    public static int partition(int[] arr, int left, int right) {
        int pivot = arr[right];
        int i = left - 1;

        for (int j = left; j < right; j++) {
            if (arr[j] <= pivot) {
                i++;

                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
        int temp = arr[i + 1];
        arr[i + 1] = arr[right];
        arr[right] = temp;

        return i + 1;
    }

    public static void quickSort(int[] arr, int left, int right) {
        if (left < right) {
            int index = partition(arr, left, right);

            quickSort(arr, left, index - 1);
            quickSort(arr, index + 1, right);
        }
    }

    public static void main(String[] args) {
        int[] arr = {87, 34, 21, 56, 34};

        System.out.println("Original Array: ");
        for (int num : arr) {
            System.out.print(num + " ");
        }

        System.out.println();
        quickSort(arr, 0, arr.length - 1);
        System.out.println("Sorted Array: ");
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
}

// Time Complexity :- Best/Avg - O(nlogn) Worst - O(n2)
// Time Complexity :- O(logn)
// Stable: No