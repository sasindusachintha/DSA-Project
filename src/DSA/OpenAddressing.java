package DSA;

public class OpenAddressing {

    static class OpenAddressing1 {

        int[] table;
        int size;

        OpenAddressing1(int size) {
            this.size = size;
            table = new int[size];
            for (int i = 0; i < size; i++) {
                table[i] = -1;
            }
        }

        int hash(int key) {
            return key % size;
        }

        void insert(int key) {
            int index = hash(key);
            int i = 0;
            while (table[(index + i) % size] != -1) {
                i++;
            }
            table[(index + i) % size] = key;
        }

        boolean search(int key) {
            int index = hash(key);
            int i = 0;

            while (table[(index + i) % size] != -1) {
                if (table[(index + i) % size] == key) {
                    return true;
                }
                i++;
            }
            return false;
        }

        void display() {
            for (int i = 0; i < size; i++) {
                System.out.println("index " + i + " : " + table[i]);
            }
        }
    }

    public static void main(String[] args) {
        OpenAddressing1 ht = new OpenAddressing1(5);

        ht.insert(7);
        ht.insert(12);
        ht.insert(17);
        ht.insert(20);
        ht.insert(123);

        ht.display();

        System.out.println("Search 12: " + ht.search(12));
    }
}
