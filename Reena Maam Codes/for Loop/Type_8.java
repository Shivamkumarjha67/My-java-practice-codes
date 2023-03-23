import javax.sound.sampled.SourceDataLine;

public class Type_8 {
    public static void main(String[] args) {
        // Condition can only be of type boolean
        /* 
        for(System.out.println("hi"); System.out.println("by"); System.out.println("hlw")) {
            System.out.println("hii");
        }
        */

        /* 
        for(System.out.println("hi"); 1>2; System.out.println("hlw")) {
            System.out.println("hii");
        }
        // Here condition is false -> Which makes further statement Unrechable.
        */

        for(System.out.println("hi"); 1<2; System.out.println("hlw")) {
            System.out.println("hii");
        }
    }
}
