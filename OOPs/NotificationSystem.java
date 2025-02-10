package OOPs;

import java.util.Scanner;

// Step 1: Define the NotificationService interface
interface NotificationService {
    void sendNotification(String recipient, String message);
}

// Step 2: Implement Email Notification
class EmailNotification implements NotificationService {
    @Override
    public void sendNotification(String email, String message) {
        System.out.println("📧 Sending email to " + email + " with message: " + message);
    }
}

// Step 3: Implement SMS Notification
class SMSNotification implements NotificationService {
    @Override
    public void sendNotification(String phone, String message) {
        System.out.println("📱 Sending SMS to " + phone + " with message: " + message);
    }
}

// Step 4: Implement Push Notification
class PushNotification implements NotificationService {
    @Override
    public void sendNotification(String deviceId, String message) {
        System.out.println("🔔 Sending push notification to device " + deviceId + ": " + message);
    }
}

// Step 5: Main Class to Test Dynamic Notification System
public class NotificationSystem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Choose notification type (Email / SMS / Push): ");
        String type = scanner.nextLine().trim();

        System.out.print("Enter recipient (Email, Phone, or Device ID): ");
        String recipient = scanner.nextLine();

        System.out.print("Enter message: ");
        String message = scanner.nextLine();

        NotificationService notificationService;

        // Step 6: Select Notification Type Dynamically
        if (type.equalsIgnoreCase("Email")) {
            notificationService = new EmailNotification();
        } else if (type.equalsIgnoreCase("SMS")) {
            notificationService = new SMSNotification();
        } else if (type.equalsIgnoreCase("Push")) {
            notificationService = new PushNotification();
        } else {
            System.out.println("❌ Invalid notification type!");
            return;
        }

        // Step 7: Send the Notification
        notificationService.sendNotification(recipient, message);
        scanner.close();
    }
}

