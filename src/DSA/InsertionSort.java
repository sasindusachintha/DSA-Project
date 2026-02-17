package DSA;

public class InsertionSort {

    public static void insertionSort(int[] arr) {
        int n = arr.length;

        for (int i = 1; i < n; i++) {
            int key = arr[i];
            int j = i - 1;

            while (arr[j] >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j--;
            }
            arr[j + 1] = key;
        }

    }

    public static void main(String[] args) {
        int[] arr = {11, 34, 56, 32, 56, 67};
        insertionSort(arr);

        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
}

// Time Complexity :- Best- O(n)   Avg / Worst- O(n2)
// Space Complexity :- O(1)
