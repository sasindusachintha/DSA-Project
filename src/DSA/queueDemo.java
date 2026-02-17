
package DSA;

import java.util.Queue;
import java.util.LinkedList;

public class queueDemo {
    public static void main(String[] args){
        Queue<Integer> queue = new LinkedList<>();
        
        queue.add(5);
        queue.add(15);
        queue.add(25);
        queue.add(35);
        queue.add(45);
        
      System.out.println("List: "+ queue);
      
      System.out.println("remove element: " + queue.remove());
      System.out.println("Top element: " + queue.peek());
    }
}
