public class practice_Rough {
    public static void main(String[] args) {
        int num = 3;
        while (num > 0) {
            System.out.println(num);
            num >>= 1;
        }
    }

    /* 
    public static boolean isPalindrome(String s) {
        String s1 = "";

        for(int i=0; i<s.length(); i++) {
            char c = s.charAt(i);

            if(c >= 65 && c <= 90)
            s1 += (char)(c + 32);
            else if(c >= 97 && c <= 122)
            s1 += c;
            else if(c >= 48 && c <= 57)
            s1 += c;
            else continue;
        }

        Stack<Character> st = new Stack<>();

        for(int i=0; i<s1.length(); i++) {

            if((s1.length() % 2 != 0) && (i == (s1.length() / 2)))
            i++;

            char c = s1.charAt(i);

            if(i < s1.length()/2)
            st.push(c);
            else {
                if(!st.isEmpty() && st.peek() == c)
                st.pop();
                else
                st.push(c);
            }
        }

        System.out.println(s1);

        return st.isEmpty();
    } */
}
