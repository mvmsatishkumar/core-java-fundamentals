package exceptionhandling;

class InsufficientBalanceException extends Exception {
	
    InsufficientBalanceException(String message) {
        super(message);
    }
}

public class CustomException {
	
    static void withdraw(double balance, double amount) throws InsufficientBalanceException {
    	
        if (amount > balance) throw new InsufficientBalanceException("Insufficient balance");
        System.out.println("Withdrawal successful");
    }

    public static void main(String[] args) {
    	
        try {
            withdraw(100, 150);
            
        } catch (InsufficientBalanceException e) {
            System.out.println(e.getMessage());
        }
    }
}
// Interview question: checked custom exceptions extend Exception; unchecked ones commonly extend RuntimeException.
