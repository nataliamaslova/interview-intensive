package lesson5.theory.solid.d;

public class OrderService {
    private final NotificationService notificationService;

    public OrderService(NotificationService notificationService) {
        this.notificationService = notificationService;
    }

    public void completeOrder() {
        notificationService.sendNotification("Заказ выполнен");
    }
}
