package DSA;

public class LinearSearch {
  public static int linearSearch(int[] arr,int key){
      int n = arr.length;
      int low = 0;
      int high = n-1;
      
      while(low <= high){
          int mid = low + (high-low)/2;
          
          if (arr[mid] == key ) return mid;
          else if (arr[mid] < key ) low = mid+1;
          else high = mid - 1;
      
      }
      return -1;
  }

    public static void main(String[] args) {
        int[] arr = {12, 13, 21, 45, 47};
        int key = 12;
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
