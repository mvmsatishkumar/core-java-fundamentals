package oop;

class BankAccount {

    private double balance;

    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
        }
    }

    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
        }
    }

    public double getBalance() {
        return balance;
    }
}

// simply private variables + methods to access those variables
public class Encapsulation {
    public static void main(String[] args) {
    	
        BankAccount account = new BankAccount();
        account.deposit(1000);
        account.deposit(-1000);
        account.withdraw(300);
        System.out.println(account.getBalance());
    }
}
// Interview question: encapsulation bundles state and behavior while controlling direct access to state.

//Encapsulation is bundling an object's state and the operations that work on that state together
//while restricting direct access to the state and providing controlled access through methods.