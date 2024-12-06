package lesson5.notification;

public class SmsNotificationChannel extends NotificationChannel {
    private String phone;

    public SmsNotificationChannel(String phone) {
        this.phone = phone;
    }

    @Override
    public void notifyFromChannel(String message) {
        System.out.println("Sending SMS [" + message + "] to: " + this.phone);
    }
}
