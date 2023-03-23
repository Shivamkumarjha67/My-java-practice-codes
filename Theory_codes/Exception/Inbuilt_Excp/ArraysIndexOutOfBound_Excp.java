public class ArraysIndexOutOfBound_Excp {
    public static void main(String[] args) {
        try {
            int[] arr = new int[5];
            arr[5] = 67;
        }
        catch(ArrayIndexOutOfBoundsException e) {
            System.out.println("Array Index is out of Bound");
        }

        // catch(Exception e) {
        //     System.out.println(e);
        // }
    }
}
