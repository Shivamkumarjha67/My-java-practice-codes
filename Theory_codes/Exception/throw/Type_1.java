                            /* throwing built in Exception */

public class Type_1 {
    public static void main(String[] args) {
        Bank b = new Bank();
        b.add_Amount(14000);
        try {
            System.out.println("You are in Bank");
            b.withdraw(5800);
        } catch(IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
        System.out.println("Thank you for Banking with us :) ");
    }
}

class Bank {
    int avl_balance = 1000;

    public void withdraw(int amount) {
        if(amount > avl_balance)
        throw new IllegalArgumentException("Amount not available this much");

        System.out.println("Your Amount is here : " + amount);
        avl_balance = avl_balance - amount;
        System.out.println("Remaining Balance is " + avl_balance);
    }

    public void add_Amount(int amount) {
        avl_balance += amount;
    }

    public int balanceAvl() {
        return avl_balance;
    }
}