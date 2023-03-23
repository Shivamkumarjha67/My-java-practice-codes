import java.util.*;

// for undirected graph

public class AdjecencyList_1{

    // Adding Edge
    public static void addEdge(ArrayList<ArrayList<Integer>> arr, int u, int v) {
        arr.get(u).add(v);
        arr.get(v).add(u);
    }

    // Displaying Graph
    public static void showGraph(ArrayList<ArrayList<Integer>> arr) {
        for(int i=0; i<arr.size(); i++) {
            for(int k=0; k<arr.get(i).size(); k++) {
                System.out.print(arr.get(i).get(k) + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        // int capacity = 5;
        // ArrayList<ArrayList<Integer>> arr = new ArrayList<ArrayList<Integer>>(capacity);

        // addEdge(arr, 0, 1);
        // addEdge(arr, 1, 2);
        // addEdge(arr, 0, 3);
        // addEdge(arr, 2, 3);

        // showGraph(arr);

        System.out.println("shivam");
    }
}