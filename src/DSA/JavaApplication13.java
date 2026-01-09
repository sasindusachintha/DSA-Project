
package DSA;




public class JavaApplication13 {  
    
    
    void printNumbers(int n) {
      if (n == 0) return;      // base case
    printNumbers(n - 1);     // recursive call
    System.out.println(n);

    }
    public static void main(String[] args) {
        JavaApplication13 p = new JavaApplication13();
        p.printNumbers(10);
          
}        
}    

   
