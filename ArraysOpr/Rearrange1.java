class Rearrange1 {
    public static void main(String[] args) {
        int[] A = {-1,2,3,7,-1,-1,4,5};
        rearrange(A);
        for(int i=0; i<A.length; i++) {
            System.out.print(A[i] + " ");
        }
    }

    // Rearranging method in form of 'arr[i]=i' ;
    // Time Complexity of this method is O(n).
    static int[] rearrange(int[] A) {
        for(int i=0; i<A.length;) {
            if(A[i]>=0 && A[i]!=i) {
                int temp = A[A[i]];
                A[A[i]] = A[i];
                A[i] = temp;
            } else {
                i++;
            }
        }
        return A;
    }

    // Another Method is also possible of Time Complexity O(n^2).
}