package hw6.booking;

import java.util.ArrayList;
import java.util.List;

public class Calendar {
    private List<Slot> slots;
    private int daysInMonth;

    public Calendar(int daysInMonth) {
        this.daysInMonth = daysInMonth;
        this.slots = new ArrayList<>();
        for (int day = 1; day <= daysInMonth; day++) {
            for (int hour = 0; hour < 24; hour++) {
                slots.add(new Slot(day, hour));
            }
        }
    }

    public List<Slot> getAvailableSlots() {
        List<Slot> availableSlots = new ArrayList<>();
        for (Slot slot : slots) {
            if (!slot.isBooked()) {
                availableSlots.add(slot);
            }
        }
        return availableSlots;
    }

    public int getAvailableHours() {
        return getAvailableSlots().size();
    }

    public void book(int day, int hour) {
        Slot slot = findSlot(day, hour);
        slot.book();
    }

    public void cancelBooking(int day, int hour) {
        Slot slot = findSlot(day, hour);
        slot.cancelBooking();
    }

    public Slot findSlot(int day, int hour) {
        return slots.get(day * 24 + hour);
    }
}
