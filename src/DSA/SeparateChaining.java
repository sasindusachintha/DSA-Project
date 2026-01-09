package DSA;

public class SeparateChaining {

    static class Node {

        int key;
        Node next;

        Node(int key) {
            this.key = key;
            this.next = null;
        }
    }

    static class HashTable {

        private Node[] table;
        private int size;

        HashTable(int size) {
            this.size = size;
            table = new Node[size];
        }

        int hash(int key) {
            return key % size;
        }

        void insert(int key) {
            int index = hash(key);
            Node newNode = new Node(key);

            if (table[index] == null) {
                table[index] = newNode;
            } else {
                Node temp = table[index];
                while (temp.next != null) {
                    temp = temp.next;
                }
                temp.next = newNode;
            }
        }

        boolean search(int key) {
            int index = hash(key);
            Node temp = table[index];

            while (temp != null) {
                if (temp.key == key) {
                    return true;
                }
                temp = temp.next;
            }
            return false;
        }

        void display() {
            for (int i = 0; i < size; i++) {
                System.out.print("Index " + i + ": ");
                Node temp = table[i];
                while (temp != null) {
                    System.out.print(temp.key + " -> ");
                    temp = temp.next;
                }
                System.out.println("null");
            }
        }
    }

    public static void main(String[] args) {
        HashTable ht = new HashTable(5);

        ht.insert(7);
        ht.insert(12);
        ht.insert(17);
        ht.insert(3);

        ht.display();

        System.out.println("Search 12: " + ht.search(12));
        System.out.println("Search 12: " + ht.search(20));
    }
}
