// StringBuilder class Methods()

class Stringgs3{
    public static void main(String[] args) {
        
        StringBuilder s1 = new StringBuilder();
        s1.append("Shivam");
        System.out.println("s1 : " + s1.toString());
        System.out.println("__________________");

        StringBuilder s2 = new StringBuilder(15);
        System.out.println("s2 : " + s2.capacity());
        System.out.println("__________________");

        StringBuilder s3 = new StringBuilder(s1.toString());
        System.out.println("s3 : " + s3.toString());
        System.out.println("__________________");
    }
}