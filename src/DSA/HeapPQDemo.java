
package DSA;

class MaxHeapPQ{
    int[] heap;
    int size;
    
    MaxHeapPQ(int capacity){
        heap = new int[capacity];
        size = 0;
    } 
    void insert(int val){
        heap[size] = val;
        int i = size;
        size++;
        while( i > 0 && heap[i] > heap[(i-1)/2]){
            int temp = heap[i];
            heap[i] = heap[(i-1)/2];
            heap[(i-1)/2] = temp;
            i = (i-1)/2 ;
        }
    }
    int extractMax(){
      if (size == 0 ) return -1;
      int max = heap[0];
      heap[0]= heap[size-1];
      size -- ;
      heapify(0);
      return max;
  } 
    void heapify(int i){
      int largest = i , left = 2*i+1, right = 2*i+2 ;
      if(left < size && heap[left]> heap[largest]) largest = left;
      if(right < size && heap[right] > heap[largest]) largest = right;
      if( largest != i){
          int temp = heap[i];
          heap[i] = heap[largest];
          heap[largest] = temp;
          heapify(largest);
     }           
  }    
    int peek(){
      if(size == 0) return -1;
      return heap[0];
  }
}
public class HeapPQDemo {
 public static void main(String[] args){
     MaxHeapPQ pq = new MaxHeapPQ(10);
     
     pq.insert(40);
     pq.insert(20);
     pq.insert(25);
     
     System.out.println("Max: "+ pq.peek());
     
     while(pq.peek() > 0){
         System.out.print(pq.extractMax()+ " ");
     }
 }   
}
