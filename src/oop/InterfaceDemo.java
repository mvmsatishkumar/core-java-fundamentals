package oop;

interface Payment {
    void pay(double amount);
}

class UpiPayment implements Payment {
    @Override
    public void pay(double amount) {
        System.out.println("Paid " + amount + " by UPI");
    }
}

public class InterfaceDemo {
    public static void main(String[] args) {
        Payment payment = new UpiPayment();
        payment.pay(500);
    }
}
// Interview trap: interface methods without an implementation are public; an implementing method cannot reduce visibility.
