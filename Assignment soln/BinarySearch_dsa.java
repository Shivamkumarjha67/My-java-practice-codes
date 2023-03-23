import java.util.Scanner;
import java.util.Arrays;

public class BinarySearch_dsa {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] arr = {3,5,6,2,9};
        Arrays.sort(arr);

        System.out.println("Enter the elm u want to search : ");
        int elm = sc.nextInt();

        int index = binarySearch(elm , 0 , arr.length - 1 , arr);

        if(index == -1) 
        System.out.println("Element not present in the Array");
        else
        System.out.println("Index where elm present is : " + index);

        sc.close();
    }

    static int binarySearch(int elm , int start , int end , int[] arr) {
        int mid = start + (end - start)/2;

        if(start <= end) {
            if(arr[mid] == elm) {
                return mid;
            } else if(arr[mid] > elm) {
                return binarySearch(elm, start, mid - 1, arr);
            } else if(arr[mid] < elm) {
                return binarySearch(elm, mid + 1, end, arr);
            }
        }

        return -1;
    }
}
