// LINEAR QUEUE

class QueueY{
    static class Queue{
        static int arr[];
        static int size;
        static int rear = -1;
        //arr = new arr[size];
        //Queue(){};
        Queue (int n){
            arr = new int[n];
            this.size=n;
        }

        public static boolean isEmpty(){
            return rear == -1;
        }

        //Enqueue or add
        public static int add(int x){
            if(rear==size-1){
                System.out.println("Queue is full");
                return 0;
            }
            else{
                arr[++rear]=x;
                System.out.println(x+" is added in Queue");
                return 0;
            }
        }

        //Dequeue
        public static int remove(){
            if(rear == -1){
                System.out.println("Queue is empty");
                return 0;//-1
            }
            else{
                int p=arr[0];
                for(int i=0;i<size-1;i++){
                    arr[i]=arr[i+1];
                }
                System.out.println(p + " is removed from Queue");
                rear--;
                return 0;
            }
        }

        //Show peek
        public static int peek(){
            if(isEmpty()){
                System.out.println("Queue is Empty");
                return 0;
            }
            
            int o=arr[0];
            System.out.println(o + " is in the front");
            return 0;
        }
    }
        public static void main(String[] args) {
            Queue q = new Queue(6);
            q.add(10);
            q.add(13);
            q.add(19);
            q.add(23);
            q.add(78);
            q.add(45);
            //q.size=5;

            q.peek();
            q.remove();

            while(q.rear>-1){
                q.peek();
                q.remove();
            }
            if(q.isEmpty())
            System.out.println("Queue is empty");
            else
            System.out.println("Queue is not");
        }
}