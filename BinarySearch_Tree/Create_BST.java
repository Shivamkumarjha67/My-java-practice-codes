import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class Create_BST {

    static class Node {
        int key;
        Node left;
        Node right;

        Node(int data) {
            this.key = data;
            left = right = null;
        }
    }

    // Creating BST
    public static Node Create_tree(Node root , int val) {

        if(root == null) {
            return new Node(val);
        }
        
        if(val < root.key) {
            root.left = Create_tree(root.left , val);
        }
        
        if(val > root.key) {
            root.right = Create_tree(root.right , val);
        }

        return root;
    }

    // Iterative Inorder Traversal
    public static void iterative_inorder(Node root) {
        Stack<Node> s = new Stack<>();

        Node curr = root;
        while(curr != null || !s.isEmpty()) {
            if(curr != null) {
                s.push(curr);
                curr = curr.left;
            } else {
                curr = s.pop();
                System.out.print(curr.key + " ");
                curr = curr.right;
            }
        }
    }

    // Search Element
    public static boolean checkElm(Node root , int val) {
        if(root == null)
        return false;

        if(root.key == val) 
        return true;

        if(val < root.key) 
        return checkElm(root.left, val);
        

        if(val > root.key) 
        return checkElm(root.right, val);

        return false;
    }

    // Insertion Method
    public static Node insert(Node root , int data) {
        if(root == null) 
        return new Node(data);

        if(root.key > data)
        root.left = insert(root.left, data);

        if(root.key < data)
        root.right = insert(root.right, data);

        return root;
    }

    // Level Order Traversal
    public static void levelOrderTreversal(Node root) {
        Queue<Node> q = new LinkedList<>();

        q.add(root);
        q.add(null);

        while(!q.isEmpty()) {
            Node a = q.peek();
            q.remove();

            if(a == null) {
                if(!q.isEmpty()) {
                    q.add(null);
                    System.out.println();
                }
            }
            else
            {
                if(a.left != null) {
                    q.add(a.left);
                }
                if(a.right != null) {
                    q.add(a.right);
                }

                System.out.print(a.key + " ");
            }
        }

        System.out.println();
    }

    // Deletion of a node
    public static Node deletion(Node root , int data) {
        if(root == null)
        return null;

        if(root.key < data) {
            root.right = deletion(root.right, data);
        }
        else if(root.key > data) {
            root.left = deletion(root.left, data);
        }
        else {
            if(root.left == null)
            return root.right;
            if(root.right == null) 
            return root.left;

            Node succ = getSuccesor(root);
            root.key = succ.key;
            deletion(root.right, succ.key);
        }

        return root;
    }
  
    // Method for getting Successor
    public static Node getSuccesor(Node root) {
        Node curr = root.right;
        while(curr != null && curr.left != null) 
        curr = curr.left;

        return curr;
    }

    // Method for finding floor  --> Iterative Way (Efficient)
    public static int floor(Node root , int val) {
        Node ans = null;

        while(root != null) {
            if(root.key == val)
            return val;

            if(root.key > val)
            root = root.left;
            else {
                ans = root;
                root = root.right;
            }
        }

        return ans.key;
    }

    // Method for finding Cieling --> Iterative Way
    public static int Cieling(Node root , int val) {
        Node ans = null;

        while(root != null) {
            if(root.key == val) 
            return val;

            if(root.key < val)
            root = root.right;
            else {
                ans = root;
                root = root.left;
            }
        }

        return ans.key;
    }

    public static void main(String[] args) {
        int[] arr = {6,4,9,2,8,3,11,1,5,7};

        Node root = null;
        
        for(int i=0; i<arr.length; i++) {
            root = Create_tree(root , arr[i]);
        }

        iterative_inorder(root);
        System.out.println();

        levelOrderTreversal(root);

        System.out.println(checkElm(root, 10));
        System.out.println(checkElm(root, 4));
        System.out.println(checkElm(root, 45));

        insert(root, 10);
        System.out.println();

        levelOrderTreversal(root);

        root = deletion(root, 6);
        iterative_inorder(root);
        System.out.println();
        levelOrderTreversal(root);

        System.out.println(floor(root, 6));
        System.out.println(floor(root, 1));

        System.out.println(Cieling(root, 6));
        System.out.println(Cieling(root, 11));
    }
}