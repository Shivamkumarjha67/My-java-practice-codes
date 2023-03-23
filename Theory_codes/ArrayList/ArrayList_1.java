                                        /*   ArrayList Functions   */
import java.text.CollationElementIterator;
import java.text.CollationKey;
import java.util.ArrayList;
import java.util.Collections;

public class ArrayList_1 {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();

        // add() -> adds element in the list
        list.add(1);
        list.add(2);
        list.add(7);
        list.add(33);
        System.out.println(list);

        // get() -> for getting element at any particular index
        int element = list.get(1);
        System.out.println(element);

        // set() -> Change/ set element of the list
        list.set(0,5);
        System.out.println(list);

        // remove() -> deletes elements of our list
        list.remove(1);
        System.out.println(list);

        // size() -> returns size of the list
        System.out.println(list.size());

        // for sorting our list -> Collections.sort()
        Collections.sort(list);
        System.out.println(list);
    }
}