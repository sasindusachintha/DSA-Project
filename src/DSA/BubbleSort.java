package DSA;

public class BubbleSort {
     public static void bubbleSort(int[] arr){
     int n  = arr.length ;
     
     for(int i = 1 ; i < n ; i++){
         int key = arr[i];
         int j = i-1;
         
         while( j >= 0 && arr[j] > key ){
            arr[j+1] = arr[j];
             j--;
         }
         arr[j+1] = key;
     }
     }
    public static void main(String[] args) {
       int[] arr = {7,5,3,9,2};
       
       bubbleSort(arr);
       for(int n : arr){
       System.out.print(n + " ");
       }
    }
}

// Time Complexity = Best-O(n) : AVG/Worst - O(n*n) 
// Space Complexity = O(1)
