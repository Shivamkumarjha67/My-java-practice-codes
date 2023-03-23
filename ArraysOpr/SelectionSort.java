class SelectionSort{
    public static void showArr(int[] arr){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        int[] arr = {5,9,8,2,4,1};
        
        // Selection Sort
        // Time Complexity = O(n^2);
        int smallest=0;
        for(int i=0;i<arr.length;i++){
            smallest=i;
            for(int j=i+1;j<arr.length;j++){
                if(arr[smallest]>arr[j]){
                    smallest=j;
                }
            }
            int temp =arr[smallest];
            arr[smallest]=arr[i];
            arr[i]=temp;
        }
        showArr(arr);
    }
}