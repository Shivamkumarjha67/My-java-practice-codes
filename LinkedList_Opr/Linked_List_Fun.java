import java.util.LinkedList;
import java.util.List;
import java.util.ListResourceBundle;

class Linked_List_Fun {
    public static void main(String[] args) {
        LinkedList<String> List = new LinkedList<String>();

        // addFirst() function
        List.addFirst("name");
        List.addFirst("My");
        System.out.println(List);

        // addLast() function
        // add() function also by-default add element at the end.**
        List.addLast("is");
        List.add("shivam Kumar");
        System.out.println(List);

        // Size() function
        System.out.println(List.size());

        // remove() function by-default removes the first element of the list, as removefirst() function.

        //List.removeFirst();
        List.remove();
        System.out.println(List);
        List.addFirst("My");

        // removeLast() -> Removes Last Element
        List.removeLast();
        System.out.println(List);
        List.add("shivam");
        List.add("Kumar");

        // Iterating all the elements of the linked list using -> get() function
        for(int i=0; i<List.size(); i++) {
            System.out.print(List.get(i) + "-> ");
        }
        System.out.print("null\n");

        // remove() function also delete elements from taking its indices.
        List.remove(2);
        System.out.println(List);

        // add() functon add element taking its indices and element.
        List.add(2, "is");
        System.out.println(List);
    }
}