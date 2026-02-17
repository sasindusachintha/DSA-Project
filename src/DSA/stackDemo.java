package DSA;

import java.util.Stack;

public class stackDemo {
  public static void main(String[] args){
      Stack<Integer> stack = new Stack<>();
      
      stack.push(5);
      stack.push(15);
      stack.push(25);
      stack.push(35);
      stack.push(45);
      
      System.out.println("List: "+ stack);
      
      System.out.println("remove element: " + stack.pop());
      System.out.println("Top element: " + stack.peek());
  }    
}
