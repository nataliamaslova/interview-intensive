package hw6.booking;

public class Main {
    public static void main(String[] args) {
        Calendar calendar = new Calendar(31);
        System.out.println(calendar.getAvailableHours());
        System.out.println(calendar.getAvailableSlots());

        calendar.book(9, 15);
        calendar.book(10, 15);
        System.out.println(calendar.getAvailableHours());

        calendar.cancelBooking(9, 15);
        System.out.println(calendar.getAvailableHours());
    }
}
