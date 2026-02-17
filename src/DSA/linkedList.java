
package DSA;
import java.util.LinkedList;

public class linkedList {
    public static void main(String[] args){
      LinkedList<Integer> list = new LinkedList<>();
      
      list.push(5);
      list.push(10);
      list.push(15);
      list.push(20);
      list.push(25);
      
      System.out.println("List: "+ list);
      
      System.out.println("remove element: " + list.pop());
      System.out.println("Top element: " + list.peek());
     
    }
}
