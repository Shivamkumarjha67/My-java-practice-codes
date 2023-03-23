import java.util.Scanner;

public class LinearSearch_algo_dsa {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = {2,4,5,66,7};

        System.out.println("Enter elm you want to search :");
        int elm = sc.nextInt();

        for(int i=0 ; i<arr.length; i++) {
            if(arr[i] == elm) {
                System.out.println("Present on the index : " + i);
                break;
            }
        }

        sc.close();
    }
}
