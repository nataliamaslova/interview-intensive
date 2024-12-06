package lesson5.notification;

public class NotificationServiceInitial {
    private final EmailSender emailSender = new EmailSender();
    private final SmsSender smsSender = new SmsSender();

    public void sendEmail(String email, String message) {
 //       emailSender.send(email, message);
    }

    public void sendSms(String phone, String message) {
//        smsSender.send(phone, message);
    }

}
