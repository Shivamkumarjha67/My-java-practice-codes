// stringBuffer class Methods

// Changes are made in original string

class Stringgs2{
    public static void main(String[] args) {

        StringBuffer s1 = new StringBuffer("ShivamKumar");
        s1.reverse();                                              // 1. reverse()
        System.out.println(s1);
        System.out.println("_______________________________\n");

        StringBuffer s2 = new StringBuffer("Hello");
		s2.replace(1,3,"Java");                    // 2. replace(st,end,"str")
		System.out.println(s2);
        System.out.println("_______________________________\n");

        StringBuffer s3 = new StringBuffer("Shivam");
        s3.append(" Kumar");                                  // 3. insert("str")
        System.out.println(s3);
        System.out.println("_______________________________\n");

        StringBuffer s4 = new StringBuffer("ShivamKumarJha");
        s4.delete(6,11);                               // 4. delete(st,end)
        System.out.println(s4);
        System.out.println("_______________________________\n");

        StringBuffer s5 = new StringBuffer();
        System.out.println(s5.capacity());                        // 5. capacity()
        s5.append("My name is Shivam Kumar Jha");
        // If no. of chrs increses the the default capacity then, capacity=(default capacity*2)+2 ,i.e=34
        System.out.println(s5.capacity()); 
        s5.append("My name is Shivam Kumar Jha and i am from Bihar");
        System.out.println(s5.capacity());
        System.out.println("_______________________________\n");
    }
}