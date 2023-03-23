import java.util.*;

public class Tree1 {
    static class Node {
        int data;
        Node left;
        Node right;

        Node(int data) {
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }

    static class Binary_Tree {
        static int idx = -1;

        // Building Tree
        public Node buildTree(int nodes[]) {
            idx++;

            if (nodes[idx] == -1) {
                return null;
            }

            Node newNode = new Node(nodes[idx]);
            newNode.left = buildTree(nodes);
            newNode.right = buildTree(nodes);

            return newNode;
        }

        // DFS (Depth for Search)
        // Pre-Order Treversal --> O(n) 
        public void preOrder(Node tree) {
            if (tree == null)
                return;

            System.out.print(tree.data + " ");
            preOrder(tree.left);
            preOrder(tree.right);
        }

        // Inorder Treversal --> O(n)
        public void inOrder(Node tree) {
            if (tree == null)
                return;

            inOrder(tree.left);
            System.out.print(tree.data + " ");
            inOrder(tree.right);
        }

        // PostOrder Treversal --> O(n)
        public void postOrder(Node root) {
            if (root == null)
                return;

            postOrder(root.left);
            postOrder(root.right);
            System.out.print(root.data + " ");
        }

        // BFS (Breadth for search)
        // Level Order 
        public void levelOrder(Node root) {
            if(root == null)
            return;

            Queue<Node> q = new LinkedList<>();
            q.add(root);
            q.add(null);

            while(!q.isEmpty()) {
                Node curNode = q.remove();
                if(curNode == null) {
                    if(q.isEmpty())
                    return;
                    else {
                        q.add(null);
                        System.out.println();
                    }
                }
                else 
                {
                    System.out.print(curNode.data + " ");
                    if(curNode.left != null)
                    q.add(curNode.left);
                    if(curNode.right != null)
                    q.add(curNode.right);
                }
            }
        }

        // Count of Nodes
        public int countOfNodes(Node root) {
            if(root == null) 
            return 0;

            int leftCount = countOfNodes(root.left);
            int rightCount = countOfNodes(root.right);

            return leftCount + rightCount + 1;
        }

        // Sum of Nodes
        public int sumOfNode(Node root) {
            if(root == null)
            return 0;

            int leftSum = sumOfNode(root.left);
            int rightSum = sumOfNode(root.right);

            return leftSum + rightSum + root.data;
        }

        // Height of a tree
        public int heightOFTree(Node root) {
            if(root == null)
            return 0;

            int leftHeight = heightOFTree(root.left);
            int rightHeight = heightOFTree(root.right);

            int Height = Math.max(leftHeight , rightHeight) + 1;

            return Height;
        }

        // Diameter of the tree --> O(n^2)
        public int giveDiameter(Node root) {
            if(root == null) 
            return 0;

            int leftDiam = giveDiameter(root.left);
            int rightDiam = giveDiameter(root.right);

            int dia3 = heightOFTree(root.left) + heightOFTree(root.right) + 1;

            return Math.max(dia3 , Math.max(leftDiam , rightDiam));
        }

        // Diameter (Optimized solution) --> O(n)
        class diaInfo {
            int ht;
            int dia;

            diaInfo(int ht, int dia) {
                this.ht = ht;
                this.dia = dia;
            }
        }

        public diaInfo diameter(Node root) {
            if(root == null)
            return new diaInfo(0,0);

            diaInfo leftdia = diameter(root.left);
            diaInfo rightdia = diameter(root.right);

            int hgt = Math.max(leftdia.ht , rightdia.ht) + 1;

            int dia1 = leftdia.dia;
            int dia2 = rightdia.dia;
            int dia3 = leftdia.ht + rightdia.ht + 1;

            diaInfo myInfo = new diaInfo(hgt, Math.max(dia1 , Math.max(dia2 , dia3)));

            return myInfo;
        }
    }

    public static void main(String[] args) {
        int[] nodes = { 2, 3, 4, -1, -1, 5, -1, -1, 6, 7, -1, -1, 8, -1, -1 };     
        Binary_Tree obj = new Binary_Tree();                                       
        Node root = obj.buildTree(nodes);                                            
        System.out.println(root.data);

        System.out.println("PreOrder of tree is : ");
        obj.preOrder(root);
        System.out.println();

        System.out.println("InOrder Treversal of tree is : ");
        obj.inOrder(root);
        System.out.println();

        System.out.println("PostOrder Treversal of the tree is : ");
        obj.postOrder(root);
        System.out.println();

        System.out.println("Level Order Treversal of the tree is : ");
        obj.levelOrder(root);
        System.out.println();

        System.out.println("Count of the nodes are : " + obj.countOfNodes(root));

        System.out.println("Sum of Nodes are : " + obj.sumOfNode(root));

        System.out.println("Height of the tree is : " + obj.heightOFTree(root));

        System.out.println("Diameter of the tree is : " + obj.giveDiameter(root));

        System.out.println("Diameter of the tree is : " + obj.diameter(root).dia);
    }
}