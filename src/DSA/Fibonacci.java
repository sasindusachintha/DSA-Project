/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DSA;


public class Fibonacci {
    static int fib(int n){
        if ( n == 0){
            return 0; 
         }
         if( n == 1){
          return 1;
        }
        return fib(n-1)+ fib(n-2); 
    }
    public static void main (String[] args){
        int n = 6;
        System.out.println(fib(n));
    }
}
