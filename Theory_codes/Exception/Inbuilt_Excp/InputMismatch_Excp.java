import java.util.Scanner;

import javax.sound.midi.Soundbank;

public class InputMismatch_Excp {
    public static void main(String[] args) {
        try {
            Scanner sc = new Scanner("hii");
            //String s = sc.nextLine();
            int s = sc.nextInt(); // java.util.InputMismatchException

            System.out.println(s);
        } catch (Exception e) {
            // TODO: handle exception
            System.out.println(e);
        }
    }
}
