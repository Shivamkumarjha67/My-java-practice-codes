import java.util.*;

public class Practice11 {
	public static void main(String[] args) {
		ArrayList<Character> a = new ArrayList<>();

		a.add('c');
		a.add('m');
		a.add('b');
		a.add('c');

		System.out.println(a);

		a.remove(2);

		System.out.println(a);
	}
}