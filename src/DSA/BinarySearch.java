package DSA;

public class BinarySearch {

    public static int binarySearch(int[] arr, int key) {
        int low = 0;
        int high = arr.length-1;
        
        while(low <= high){
            int mid = low + (high-low)/2 ;
            
            if(arr[mid] == key){
                return mid;
            }else if(arr[mid] < key){
                low = mid+1;
            }else{
                high = mid -1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] arr = {1, 3, 5, 7, 9, 11};
        int key =1;
        int index = binarySearch(arr, key);

        if (index != -1) {
            System.out.println("Element found at index " + index);
        } else {
            System.out.println("Element not found");
        }

    }
}

// Time Complexity :- Best - O(1) , Avg/Worst - O(log n)
// Space Complexity :- O(1)
