import java.util.Arrays;

class BubbleSortN{
    public static void myBubble(int[] brr){
        boolean swapped;
        int w= brr.length-1;

        // Sorting Method
        for(int i=0; i<=w; i++){
            swapped=false;
            for(int j=0; j<w-i; j++){
                if(brr[j]>brr[j+1]){
                    int temp;
                    temp= brr[j];
                    brr[j] = brr[j+1];
                    brr[j+1]= temp;
                    swapped=true;
                }
            }
            if(swapped==false)
            break;
        }
        
        System.out.print("After sorting our arrays element are \n");
        for(int i=0; i<=w; i++){
            System.out.print(brr[i]+" ,");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int[] brr={56,3,45,32,22,11,46,9,2,10};
        int[] jrr={1,2,3,5};

        myBubble(brr);
        myBubble(jrr);
    }
}