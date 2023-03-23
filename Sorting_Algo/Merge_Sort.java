import java.util.ArrayList;

public class Merge_Sort {
    public static void main(String[] args) {
        ArrayList<Integer> a = new ArrayList<>();
        a.add(4);
        a.add(2);
        a.add(43);
        a.add(24);
        a.add(45);
        a.add(14);
        a.add(19);
        a.add(9);
        a.add(34);
        a.add(1);    // 4 2 43 24 45 14 19 9 34 1

        mergeSort(a, 0, a.size()-1);  // 1 2 4 9 14 19 24 34 43 45

        for(int i=0; i<a.size() ; i++) {
            System.out.print(a.get(i) + "  ");
        }
    }

    public static void mergeSort(ArrayList<Integer> a, int s, int e) {
        int mid = (e+s) / 2;

        if (s >= e)
            return;

        mergeSort(a, s, mid);
        mergeSort(a, mid + 1, e);
        merge(a, s, mid, e);
    }

    public static void merge(ArrayList<Integer> a, int s, int m, int e) {
        int i = s, j = m+1;
        ArrayList<Integer> al = new ArrayList<>();

        while( i <= m && j <= e) {
            int val = (a.get(i) < a.get(j)) ? a.get(i++) : a.get(j++);
            al.add(val);
        }

        while(i <= m) al.add(a.get(i++));
        while(j < e) al.add(a.get(j++));

        for(int p=0; p<al.size(); p++) {
            a.set((p+s), al.get(p));
        }
    }
}