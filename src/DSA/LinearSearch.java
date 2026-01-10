package DSA;

public class LinearSearch {

    public static int linearSearch(int[] arr, int key) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == key) {
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] arr = {12, 34, 21, 45, 23};
        int key = 45;
        int index = linearSearch(arr, key);

        if (index != -1) {
            System.out.println("Element found at index " + index);
        } else {
            System.out.println("Element not found !");
        }
    }
}

// Time Complexity :- Best Case - O(1)  ,  Avg/Worst- O(n)
// Space Complexity :- O(1)
