/* Binary Search can be implemented by two methods :-
 *   1. Iterative Method
 *   2. Recursive Method ( Also Known as divide and conqur approach )
 *   
 *         ***Always used on Sorted array only.***
 */


// Using iterative Method
import java.util.*;

class BinarySearch_Itr {
    public static void main(String[] args) {
        int arr[] = {23,12,33,56,4,32,11,87,43};
        // Sorting
        Arrays.sort(arr);
        // for-each loop
        for(int i : arr){
            System.out.print(i + " ");
        }
        System.out.println("\n" + SearchElm(arr, 4));
        System.out.println(SearchElm(arr, 87));
    }
    // Method Defination
    public static int SearchElm(int[] arr, int k) {
        int l=0 , h=arr.length , mid;
        // Operation
        while((h-l)>1) {
            mid = (l+h)/2;
            if(arr[mid]<k) {
                l = mid+1;
            } else {
                h = mid;
            }
        }
        // Condition checking
        if(arr[l] == k){
            return l;
        } else if(arr[h] == k){
            return h;
        } else {
            return -1;
        }
    }
}