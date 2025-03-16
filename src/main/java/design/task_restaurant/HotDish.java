package design.task_restaurant;

public class HotDish implements Printable {
    private int temperature; // C

    public HotDish(int temperature) {
        this.temperature = temperature;
    }

    public int getTemperature() {
        return temperature;
    }

    @Override
    public void print() {
        System.out.println("Interface -> Hot dish: temperature " + temperature);
    }
}
