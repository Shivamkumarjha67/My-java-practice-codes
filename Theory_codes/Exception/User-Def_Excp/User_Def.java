import java.io.BufferedReader;
import java.io.InputStreamReader;

class User_Def extends Exception {

    User_Def(String s) {
        super(s);
    }

    public static void main(String[] args) {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        try {
            int arr[] = new int[5];
            for(int i=0; i<arr.length; i++) {
                arr[i] = Integer.parseInt(br.readLine());
            }
            for(int i=0; i<arr.length; i++) {

                if(arr[i] > 50) {
                    User_Def e = new User_Def("Greater than 50");
                    throw e;
                }

                System.out.println(arr[i]);
            }
        }
        catch(Exception e) {
            System.out.println(e);
        }
    }
}