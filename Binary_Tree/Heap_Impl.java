public class Heap_Impl{

    static int[] arr = new int[6];
    static int size = 0;
    static int capacity = 6;

    // Heap_Impl(int cap) {
    //     capacity = cap;
    //     arr = new int[cap];
    //     size = 0;
    // }

    // Parent index
    public static int parent_index(int i) {
        return (i - 1) / 2;
    }

    // Left_child index
    public static int left_child(int i) {
        return (2 * i) + 1;
    }

    // Right_child index
    public static int right_child(int i) {
        return (2 * i) + 2;
    }

    // Intertion Operation (in Min Heap)
    public static void insert(int elm) {
        if(size == capacity) 
        return;

        size++;
        arr[size - 1] = elm;

        for(int i=(size - 1); i!=0 && arr[parent_index(i)] > arr[i];) {
            int temp = arr[parent_index(i)];
            arr[parent_index(i)] = arr[i];
            arr[i] = temp;

            i = parent_index(i);
        }
    }

    // Heapify Operation (Min-Heapify)
    public static void minHeapify(int i) {
        int left = left_child(i);
        int right = right_child(i);
        int smallest = i;

        if((left < size) && (arr[smallest] > arr[left])) {
            smallest = left;
        }

        if((right < size) && (arr[smallest] > arr[right])) {
            smallest = right;
        }

        if(smallest != i) {
            int temp = arr[i];
            arr[i] = arr[smallest];
            arr[smallest] = temp;

            minHeapify(smallest);
        }
    }

    // Extract Minimum
    public static int extractMin() {
        if(size == 0)
        return Integer.MAX_VALUE;

        if(size == 1) {
            size--;
            return arr[0];
        }

        int temp = arr[0];
        arr[0] = arr[size - 1];
        arr[size - 1] = temp;

        size--;
        minHeapify(0);
        return temp;
    }

    // Decrease Key Operation
    public static void decreaseKey(int index , int elm) {
        arr[index] = elm;

        while((index != 0) && (arr[index] < arr[(index - 1)/2])) {
            int temp = arr[(index - 1)/2];
            arr[(index - 1)/2] = arr[index];
            arr[index] = temp;

            index = (index - 1)/2;
        }
    }

    // Delete Operation
    public static void deleteKey(int index) {
        decreaseKey(index, Integer.MIN_VALUE);
        extractMin();
    }

    // Build Heap Operation --> O(n).
    public static void build_Heap() {
        for(int i=(size - 2)/2; i>=0; i--) 
        minHeapify(i);
    }

    public static void main(String[] args) {
        insert(5);
        insert(8);
        insert(2);
        insert(4);
        insert(9);
        insert(1);
        // System.out.println(extractMin());
        decreaseKey(4, 3);

        for(int i=0; i<size; i++)
        System.out.print(arr[i] + " ");
        System.out.println();

        deleteKey(3);

        for(int i=0; i<size; i++)
        System.out.print(arr[i] + " ");
    }
}