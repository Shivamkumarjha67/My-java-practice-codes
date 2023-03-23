import myfirst.*;

class PackageUse{
    public static void main(String[] args) {
        Welcome obj = new Welcome();
        System.out.println("Methods are importsd from myfirst package's class :)");
        System.out.println("___________________________________________________");
        obj.Display();
        obj.Show();
    }
}