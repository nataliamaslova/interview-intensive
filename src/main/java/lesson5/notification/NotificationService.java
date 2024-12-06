package lesson5.notification;

import java.util.ArrayList;
import java.util.List;

/**
 * Сервис с подпиской на канал смс или емайл.
 * Подписчик выбирает канал.
 * Уведомлять всех подписчиков в зависимости от типа канала
 */
public class NotificationService {
    private List<NotificationChannel> channels = new ArrayList<>();

    public void subscribe(NotificationChannel channel) {
        channels.add(channel);
    }

    public void unsubscribe(NotificationChannel channel) {
        channels.remove(channel);
    }

    public void notifyAllChannels(String message) {
        for (NotificationChannel channel : channels) {
            channel.notifyFromChannel(message);
        }
    }
}
