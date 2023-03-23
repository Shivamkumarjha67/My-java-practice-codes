// Ternary Search -> Using Recursive Method

/*
 *  Time complexity of Ternary Search is O(log3n).
 *  Time complexity of Ternary Search is better than Binary Search.
 *  But Ternary search is slower than Binary Search.
 */

import java.util.Arrays;

class Ternary_Search_Rec {
    public static void main(String[] args) {
        int[] arr = {2,3,65,43,34,4,33,46,54,88};
        //sortArr(arr);
        Arrays.sort(arr);
        int l = 0;
        int h = arr.length;
        System.out.println(searchElm(arr, 88, l, h));
    }
    // Search Element
    static int searchElm(int[] arr,int k,int l,int h) {
        if(h>=l) {

             int mid1 = l + (h-l)/3;
             int mid2 = h - (h-l)/3;

             if(arr[mid1] == k) {
                return mid1;
             }
             if(arr[mid2] == k) {
                return mid2;
             } 

             if(k < arr[mid1]) {
                return searchElm(arr, k, l, mid1-1);
             } else if(k > arr[mid2]) {
                return searchElm(arr, k, mid2+1, h);
             } else {
                return searchElm(arr, k, mid1+1, mid2-1);
             }
        }
        return -1;
    }
    // Sort Array
    /* 
    static void sortArr(int[] arr) {
        int temp=0;
        for(int i=0; i<arr.length-1; i++) {
            for(int j=i+1; j<arr.length; j++) {
                if(arr[i]>arr[j]) {
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
    }*/
}