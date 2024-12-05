package lesson5.notification;

/**
 * Сервис с подпиской на канал смс или емайл.
 * Подписчик выбирает канал.
 * Уведомлять всех подписчиков в зависимости от типа канала
 */
public class NotificationService {
    private final EmailSender emailSender = new EmailSender();
    private final SmsSender smsSender = new SmsSender();

    public void sendEmail(String email, String message) {
        emailSender.send(email, message);
    }

    public void sendSms(String phone, String message) {
        smsSender.send(phone, message);
    }

}
