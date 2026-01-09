
package DSA;

class Node{
    int data;
    Node left,right;
    
    Node(int d){
        data = d;
        left = right =null;
    }
}
class BST{
    Node root;
    
    Node insert(Node root, int key){
        if (root==null) return new Node(key);
        
        if(key < root.data){
            root.left = insert(root.left, key);
        }else{
            root.right = insert(root.right, key);
        }
        return root;
    }
   
    boolean search(Node root, int key){
        if (root == null) return false;
        if( root.data == key ) return true;
        
        if ( key < root.data){
            return search(root.left, key);
        }else{
            return search(root.right, key);
        }
    }
    
    Node inorderSuccessor(Node root){
        while(root.left != null){
            root = root.left;
        }
        return root;
    }
    
    Node delete(Node root, int key){
        if (root == null) return null;
        
        if( key < root.data){
            root.left = delete(root.left, key);
        }else if(key > root.data){
            root.right = delete(root.right, key);
        }else{
            if( root.left == null ) return root.right;
            if( root.right == null ) return root.left;
        
        Node temp = inorderSuccessor(root.right);
        root.data = temp.data;
        root.right = delete(root.right, temp.data);
        }
        return root;
    }
    
    //traversals
    
    void inorder(Node root){
        if(root != null){
            inorder(root.left);
            System.out.println(root.data + " ");
            inorder(root.right);
        }
    }
    void preorder(Node root){
        if(root != null){
            System.out.println(root.data+ " ");
            preorder(root.left);
            preorder(root.right);
        }
    }
    void postorder(Node root){
        if(root!= null){
            postorder(root.left);
            postorder(root.right);
            System.out.println(root.data+" ");
        }
    }
}

public class BinarySearchTree_BST {
   public static void main(String[] args){
       BST tree = new BST();
       
       tree.root = tree.insert(tree.root, 50);
       
       tree.insert(tree.root, 20);
       tree.insert(tree.root, 40);
       tree.insert(tree.root, 10);
       tree.insert(tree.root, 60);
       tree.insert(tree.root, 80);
       tree.insert(tree.root, 220);
       
       System.out.print("Inorder: ");
       tree.inorder(tree.root);
       
       System.out.print("\nPreorder: ");
       tree.preorder(tree.root);
       
       System.out.print("\nPostorder: ");
       tree.postorder(tree.root);
   }    
}
