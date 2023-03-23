// Recursive Linear Search
//import java.util.*;

class LinearSearch{
    public static void main(String[] args) {
        int arr[] = {23,45,65,32,43,3,5,65,98};
        int x = arr.length;
        System.out.println(searchElm(arr, x, 5));
    }
    // method defination
    public static int searchElm(int[] arr, int size, int k) {
        if(size == 0) {
            return -1;
        }
        else if(arr[size-1] == k) {
            return (size-1);
        }
        else {
            return searchElm(arr, size-1, k);
        }
    }
}