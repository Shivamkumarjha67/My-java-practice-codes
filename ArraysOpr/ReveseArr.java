// Revese an arrays program.
import java.util.Arrays;

public class ReveseArr {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,34,44,22,6,7,8};

        // Sorting Method
        //Arrays.sort(arr);
        printArray(arr);

        //reverseM2(arr);
        //printArray(arr);
        
        reverseM3(arr, 0, arr.length-1);
        printArray(arr);
        
    }

    // 1. Method for reversing
    static int[] reverseM1(int[] A) {
        int start = 0;
        int end = A.length-1;
        for(int i=0; i<A.length/2; i++) {
            start = start + i;
            end = end - i;
            int temp = A[start];
            A[start] = A[end];
            A[end] = temp;
        }
        return A;
    }

    // 2. Method for reversing
    static int[] reverseM2(int[] arr) {
        int temp;
        int start = 0;
        int end = arr.length-1;
            while (start<end) {
            temp = arr[end];
            arr[end] = arr[start];
            arr[start] = temp;
            start++;
            end--;
        }
        return arr;
    }

    // 3. Method of reversing
    static int[] reverseM3(int[] arr, int start, int end) {
        if(start>=end) 
        return arr;

        int temp;
        temp = arr[end];
        arr[end] = arr[start];
        arr[start] = temp;
        return reverseM3(arr, start+1, end-1);
    }

    static void printArray(int[] arr) {
        for(int i=0; i<arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}
