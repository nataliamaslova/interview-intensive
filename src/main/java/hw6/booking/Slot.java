package hw6.booking;

public class Slot {
    private int day;
    private int hour;
    private boolean isBooked;

    public Slot(int day, int hour) {
        this.day = day;
        this.hour = hour;
        this.isBooked = false;
    }

    public boolean isBooked() {
        return isBooked;
    }

    public void book() {
        if (isBooked) {
            throw new IllegalStateException("Slot is already booked");
        }
        isBooked = true;
    }

    public void cancelBooking() {
        if (!isBooked) {
            throw new IllegalStateException("Slot is not booked");
        }
        isBooked = false;
    }

    @Override
    public String toString() {
        return "Slot{" +
                "day=" + day +
                ", hour=" + hour +
                ", isBooked=" + isBooked +
                '}';
    }
}
