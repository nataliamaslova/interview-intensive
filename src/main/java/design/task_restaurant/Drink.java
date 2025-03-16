package design.task_restaurant;

public class Drink implements Printable{
    private int volume; // ml

    public Drink(int volume) {
        this.volume = volume;
    }

    public int getVolume() {
        return volume;
    }

    @Override
    public void print() {
        System.out.println("Interface -> Drink: volume " + volume);
    }
}
