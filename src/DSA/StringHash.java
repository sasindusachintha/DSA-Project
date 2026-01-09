
package DSA;

public class StringHash {
    static int hash(String key, int size){
        int hash = 0;
        for(int i= 0 ; i<key.length() ; i++){
            hash += key.charAt(i);
        }
        return hash % size;
    }
    public static void main(String[] args){
        System.out.println(hash("ABC",10));
    }
}
