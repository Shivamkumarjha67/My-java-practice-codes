class Product{
    int price;
    String name;
    Product(String s,int x){
        this.name=s;
        this.price=x;
    }
}

class Main{

    public static void main(String args[]){
        Product arr[];
        arr = new Product[5];

        arr[0] = new Product( "sugar", 40 );
        arr[1] = new Product( "salt", 25 );
        arr[2] = new Product( "rice", 35 );
        arr[3] = new Product( "pulse", 45 );
        arr[4] = new Product( "soya", 15 );

        for(int i=0;i<arr.length;i++){
            System.out.println("Item name is " + arr[i].name + " and it costs " + arr[i].price);
        }
    }
}