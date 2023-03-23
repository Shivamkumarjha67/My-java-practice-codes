class MultidArray{
    public static void main(String[] args) {
        int arr[][]= new int[][]{{10,11,12},{20,21,22},{30,31,32}};

        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
}