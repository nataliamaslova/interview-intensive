package lesson3.transport;

public class Car extends Vehicle implements Refuelable {
    private double fuelLevel;

    public Car(String brand, String model, int year) {
        super(brand, model, year); // Использование конструктора родительского класса
        this.fuelLevel = 50.0; // Предположим, что новая машина приходит с половиной бака
    }

    @Override
    public void refuel() {
        fuelLevel = 100.0;
        System.out.println("Машина заправлена полностью");
    }

    @Override
    public boolean needsRefueling() {
        return fuelLevel < 25.0;
    }

    @Override
    public String getFuelStatus() {
        return "Уровень топлива: " + fuelLevel + "%";
    }

    @Override
    public String toString() {
        return "Car{" +
                "fuelLevel=" + fuelLevel +
                ", brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", year=" + year +
                '}';
    }
}
