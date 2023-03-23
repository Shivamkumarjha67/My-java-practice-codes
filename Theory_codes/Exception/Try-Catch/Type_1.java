class Type_1 {
    public static void main(String[] args) {
        System.out.println("Hello");
        try {
            System.out.println("In try block");
            System.out.println(10/0);
        } catch(ArithmeticException e) {
            System.out.println(e);
            System.out.println(e.getMessage()); // Printing the message i.e holded by Exception.
            e.printStackTrace(); // Printing Exceotion Details.
        }
        System.out.println("Main ends");
    }
}

/*
 *    In catch Block if there is no printing statement -> Doesnt matter.
 *    As soon as we catch the exception it will not leads to abnormal termination.
 */