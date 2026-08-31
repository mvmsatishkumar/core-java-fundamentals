package designpatterns;

interface Notification {
    void send();
}

class EmailNotification implements Notification {
    public void send() {
        System.out.println("Email");
    }
}

class SmsNotification implements Notification {
    public void send() {
        System.out.println("SMS");
    }
}

class NotificationFactory {
    static Notification create(String type) {
        return switch (type) {
            case "email" -> new EmailNotification();
            case "sms" -> new SmsNotification();
            default -> throw new IllegalArgumentException("Unknown type");
        };
    }
}

public class Factory {
    public static void main(String[] args) {
        Notification notification = NotificationFactory.create("email");
        notification.send();
    }
}
// Interview idea: Factory centralizes object-creation logic so callers depend on an abstraction rather than concrete constructors.
