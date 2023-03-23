                                /* throwing User-Defined Exception */

public class Type_2 {
    public static void main(String[] args) {
        Bank b = new Bank();
        System.out.println("Available Balance is : " + b.balanceAvl());
        b.add_Amount(10000);
        System.out.println("Available Balance is : " + b.balanceAvl());
        // b.withdraw(4000); // No Handling code -> Will be terminated abnormally.
        try {
            b.withdraw(5000);
        } catch(InsufficientFunds e) {
            System.out.println(e.getMessage());
        }

        System.out.println("Available Balance is : " + b.balanceAvl());
        System.out.println("Thanking you for banking with us");
    }
}

class Bank {
    int avl_balance = 1000;

    public void withdraw(int amount) {
        if(amount > avl_balance)
        throw new InsufficientFunds("Amount not available this much");

        System.out.println("Withdrawn Amount is : " + amount);
        avl_balance = avl_balance - amount;
    }

    public void add_Amount(int amount) {
        avl_balance += amount;
        System.out.println(amount + " : Successfully added to your account");
    }

    public int balanceAvl() {
        return avl_balance;
    }
}

class InsufficientFunds extends Error {
    InsufficientFunds(String s) {
        super(s);
    }
}