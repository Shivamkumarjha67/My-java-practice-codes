// Methods of Strings in JAVA

class Stringgs1{
    public static void main(String[] args) {
        String first= "Shivam";
        String second= " Kumar";
        String fourth= "Jha";

        System.out.println("\n_____________________________");
        // Making Comparision
        boolean r = first.equals(second);                        // equals()
        System.out.println(r);
        System.out.println("\n_____________________________");

        // Joioning Two Strings
        String s1= first.concat(second);                         // concat()
        System.out.println(s1);
        System.out.println("\n_____________________________");

        // Finding Length 
        int m= first.length();                                   // length()
        System.out.println(m);
        System.out.println("\n_____________________________");

        // Escaping string
        String third= "My name is Shivam \"kumar\" jha";
        System.out.println(third);
        System.out.println("\n_____________________________");

        // Checking Substring
        boolean r1=third.contains(first);                        // contains()
        System.out.println(r1);
        System.out.println("\n_____________________________");

        // Extracting Sub String 
        String r2=third.substring(11,25);   // substring()
        System.out.println(r2);
        System.out.println("\n_____________________________");

        // cheching character
        System.out.println(first.charAt(5)); 
        System.out.println("\n_____________________________");             // charAt(index)

        // String -> Char Array
        String k1 = "abcdef";
        char[] result = k1.toCharArray();                        // toCharArray()
        System.out.println(result);
        System.out.println(result[0]);
        System.out.println(result[1]+result[5]); 
        System.out.println("\n_____________________________");

        // String matches given regex or not.
        String regex = "^S....m$";
        System.out.println("Subham".matches(regex));            // matches()
        System.out.println("Shubham".matches(regex));
        System.out.println("\n_____________________________");

        // String begins or not 
        String k2 = "ShivamKumarJha";
        System.out.println(k2.startsWith(first));               // startsWith()
        System.out.println(k2.startsWith("Kumar"));
        System.out.println("\n_____________________________");

        // String ends with or not
        System.out.println(k2.endsWith(fourth));               // endsWith()
        System.out.println(k2.endsWith("jha"));
        System.out.println(k2.endsWith("Jha"));
        System.out.println("\n_____________________________");

        // String empty or not.
        String k3= "";
        System.out.println(k3.isEmpty());                      // isEmpty()
        System.out.println(first.isEmpty());
        System.out.println("\n_____________________________");

        // Return canonical representation of string.
        String k4= new String("Shivam");
        String k5= new String("Shivam");
        System.out.println(k4==k5); // diff. memory allocated as 'new' keyword is used.
        k4 = k4.intern();                                      // intern()
        k5 = k5.intern(); // does help in allocating same memory in scp.
        System.out.println(k4==k5);
        System.out.println("\n_____________________________");

        // char sequence check
        String k6 = "ShivaM";
        System.out.println(first.contentEquals(k6));            // contentEquals()
        System.out.println(first.contentEquals(k4));
        System.out.println("\n_____________________________");

        // returns hashcode
        System.out.println(k6.hashCode());                     // hashCode()
        System.out.println("\n_____________________________");

        // subsequence from the String 
        System.out.println(k2.subSequence(0,6));   // subSequence()
        System.out.println("\n_____________________________");

    }
}