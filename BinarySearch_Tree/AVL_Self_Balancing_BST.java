//import java.util.*;

public class AVL_Self_Balancing_BST {

    static class Node {
        int data;
        int height;
        Node left;
        Node right;

        Node(int data) {
            this.data = data;
            // left = right = null;
            height = 1;
        }
    }

    static Node root;

    public static int getHeight(Node curr) {
        if(curr == null)
        return 0;

        return curr.height;
    }

    public static int max(int a , int b) {
        return (a > b) ? a : b;
    }

    public static Node insertNode(Node root , int key) {
        if(root == null) 
        return new Node(key);

        if(key < root.data)
        root.left = insertNode(root.left, key);
        else if(key > root.data)
        root.right = insertNode(root.right, key);
        else return root; // Duplicates not allowed.

        //root.height = Math.max(getHeight(root.left) , getHeight(root.right)) + 1;
        root.height = max(getHeight(root.left) , getHeight(root.right)) + 1;


        int balance = getBalance(root);

        if(balance > 1 && key < root.left.data)
        return rightRotate(root);

        if(balance > 1 && key > root.left.data) {
            root.left = leftRotate(root.left);
            return rightRotate(root);
        }

        // if(balance > 1 && key < root.right.data) {
        //     root.right = rightRotate(root.right);
        //     return leftRotate(root);
        // }

        if(balance < -1 && key < root.right.data) {
            root.right = rightRotate(root.right);
            return leftRotate(root);
        }

        // if(balance > 1 && key > root.right.data)
        // return leftRotate(root);

        if(balance < -1 && key > root.right.data)
        return leftRotate(root);

        return root;
    }

    public static int getBalance(Node root) {
        if(root == null)
        return 0;

        //return Math.abs(getHeight(root.left) - getHeight(root.right));
        return getHeight(root.left) - getHeight(root.right);
    } 

    public static Node leftRotate(Node x) {
        Node y = x.right;
        Node t1 = y.left;

        y.left = x;
        x.right = t1;

        // y.height = Math.max(getHeight(y.left) , getHeight(y.right)) + 1;
        // x.height = Math.max(getHeight(x.left) , getHeight(x.right)) + 1;

        y.height = max(getHeight(y.left) , getHeight(y.right)) + 1;
        x.height = max(getHeight(x.left) , getHeight(x.right)) + 1;

        return y;
    }

    public static Node rightRotate(Node y) {
        Node x = y.left;
        Node t1 = x.right;

        x.right = y;
        y.left = t1;

        // y.height = Math.max(getHeight(y.left) , getHeight(y.right)) + 1;
        // x.height = Math.max(getHeight(x.left) , getHeight(x.right)) + 1;

        y.height = max(getHeight(y.left) , getHeight(y.right)) + 1;
        x.height = max(getHeight(x.left) , getHeight(x.right)) + 1;

        return x;
    }

    public static void inOrder(Node root) {
        if(root == null)
        return;

        inOrder(root.left);
        System.out.print(root.data + " ");
        inOrder(root.right);
    }

    public static void main(String[] args) {
        System.out.println("Main Starts :)");
        // insertNode(null, 10);
        // insertNode(null, 5);
        // insertNode(null, 14);
        // insertNode(null, 23);
        // insertNode(null, 11);
        // insertNode(null, 6);
        // insertNode(null, 2);
        // insertNode(null, 4);
        // insertNode(null, 1);
        // System.out.println(":))))");

        insertNode(root, 10);
        insertNode(root, 20);
        insertNode(root, 30);
        insertNode(root, 40);
        insertNode(root, 50);
        insertNode(root, 25);

        inOrder(root);
    }
}
