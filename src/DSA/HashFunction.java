
package DSA;

public class HashFunction {
    static int hash(int key, int size){
        return key % size;
    }
    public static void main(String[] args){
        int key = 12;
        int size = 10;
        
        System.out.println("Index: "+ hash(key, size));
    }
}
