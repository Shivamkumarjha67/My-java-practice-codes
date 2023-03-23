public class Type_5 {
    public static void main(String[] args) {
        // for(int i=0, j=1; i<9 , j<10; i++) {}
        // condition can not be separated by comas insted use logical AND operator.
        for(int i=0, j=1; i<9 && j<10; i++) {
            System.out.println("hii");
        }

        // Also we can provide condition inside the loop.
        for(int i=0, j=1; i<9; i++) {
            if(j>10)
            break;
            System.out.println("hlw");
        }
    }
}
