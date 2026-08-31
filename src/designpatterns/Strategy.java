package designpatterns;

interface PaymentStrategy {
    void pay(int amount);
}

class CardPayment implements PaymentStrategy {
    public void pay(int amount) {
        System.out.println("Paid by card: " + amount);
    }
}

class UpiPayment implements PaymentStrategy {
    public void pay(int amount) {
        System.out.println("Paid by UPI: " + amount);
    }
}

public class Strategy {
    static void checkout(PaymentStrategy strategy, int amount) {
        strategy.pay(amount);
    }

    public static void main(String[] args) {
        checkout(new CardPayment(), 500);
        checkout(new UpiPayment(), 800);
    }
}
// Interview point: Strategy moves interchangeable behavior behind an interface instead of hard-coding conditionals.
