package lesson5.notification;

public class Main {
    public static void main(String[] args) {
        NotificationService notificationService = new NotificationService();
        NotificationChannel smsChannel = new SmsNotificationChannel("911");
        notificationService.subscribe(smsChannel);
        NotificationChannel emailChannel = new EmailNotificationChannel("support_hot@gmail.com");
        notificationService.subscribe(emailChannel);
        notificationService.notifyAllChannels("Today service is DOWN");

        notificationService.unsubscribe(emailChannel);
        notificationService.notifyAllChannels("Today service is DOWN");
    }
}
