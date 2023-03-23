// PASSING ARRAYS TO THE METHODS

class PassingMethod{

    public static void sum(int arr[]){
        int p=0;
        for(int i=0;i<arr.length;i++){
            p+=arr[i];
        }

        System.out.println(p);
    }

    public static void main(String[] args) {
        int arr[]={10,11,12,13,14,15};
        sum(arr);
    }
}