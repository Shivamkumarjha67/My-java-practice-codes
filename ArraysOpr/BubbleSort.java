// Arrays class of util package contains many methods(like sort,search,..etc)
import java.util.Arrays;

class BubbleSort{
    // Declaring Method for sorting our arrays
    public static void myBubble(int arr[]){
        int l=arr.length-1;

        for(int i=0; i<=l; i++){
            for(int j=0; j<l-i; j++){
                if(arr[j]>arr[j+1]){
                    int temp;
                    temp = arr[j];
                    arr[j]= arr[j+1];
                    arr[j+1]= temp;
                }
            }
        }

        System.out.println("After appling Bubble Sort our array is :- ");

        for(int i=0; i<=l; i++){
            System.out.print(arr[i]+" ,");
        }
    }

    public static void main(String[] args) {
        int[] arr= {12,2,45,23,3,9,1,5};

        // Passing the Method myBubble
        myBubble(arr);
    }
}
 
// In this method , comparision is made even if array is already sorted.
// to remove this problem we will take one more variable of boolean type in order to check whether the sorting is made in each operation.
// Check program "*BubbleSortN*"