import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class FileNotFound_Excp {
    public static void main(String[] args) throws IOException
    {
        try {
            FileReader fr = new FileReader("C:\\Users\\shivam kumar jha\\OneDrive\\Documents\\Java Important Points.docx");
            BufferedReader frd = new BufferedReader(fr);
            for(int i=0; i<3; i++) 
            System.out.println(frd.readLine());
        }
        catch(Exception e) {
            System.out.println(e);
        }
    }
}
