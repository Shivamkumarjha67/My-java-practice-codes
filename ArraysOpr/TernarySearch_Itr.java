// Ternary Search using Iterative Method.

class TernarySearch_Itr {
    public static void main(String[] args) {
        int[] brr = {1,2,3,4,5,6,7,8,9,12};
        System.out.println(searchElm(brr, 7, 0, brr.length));
    }

    // Iterative Method Defination
    static int searchElm(int[] arr,int k,int l, int h) {
        while(h>=l) {
            int mid1 = l + (h-l)/3;
            int mid2 = h - (h-l)/3;
            
            if(arr[mid1] == k) {
                return mid1;
            }
            if(arr[mid2] == k) {
                return mid2;
            }
            if(k < arr[mid1]) {
                h = mid1-1;
            }
            else if(k > mid2) {
                l = mid2+1;
            }
            else {
                l = mid1 +1;
                h = mid2 -1;
            }
        }
        return -1;
    }
}