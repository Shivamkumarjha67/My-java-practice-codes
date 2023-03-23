// Using Recursive Method 
// Time Complexity of Binary Search Algorithm is O(log n).

class BinarySearch_Rec{
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5,6};
        int h = arr.length;
        System.out.println(searchElm(arr, 5, 0, h));
    }
    public static int searchElm(int[] arr,int k,int l, int h) {
        if(l<=h) {
            int mid = l + (h-l)/2;
            if(arr[mid] == k ) {
                return mid;
            } else if(arr[mid] < k) {
                return searchElm(arr, k, mid+1, h);
            } else if(arr[mid] > k) {
                return searchElm(arr, k, l, mid-1);
            }
        }
        return -1;
    }
}

/* 
 * we dont use (h+l)/2 , instead we use l+((h-l)/2) bcz for larger values of integer type it gives bug/error.
 */