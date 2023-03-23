import java.util.*;

class TwoDimArr {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int rows = sc.nextInt();
        int coulmn = sc.nextInt();

        int[][] arr = new int[rows][coulmn];

        for(int k = 0;k<rows;k++){
            for (int j = 0; j < coulmn; j++) {
                arr[k][j] = sc.nextInt();
            }
        }

        System.out.println("@@@@@@@@@@@@@@@");

        for(
        int k = 0;k<rows;k++)
        {
            for (int j = 0; j < coulmn; j++) {
                System.out.print(arr[k][j] + " ");
            }
            System.out.println();
        }
    }
}