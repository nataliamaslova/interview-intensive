package lesson3.transport;

public class ElectricCar extends Vehicle implements Refuelable {
    private double batteryLevel;

    public ElectricCar(String brand, String model, int year) {
        super(brand, model, year);
        this.batteryLevel = 50.0; // // Аналогично, предполагаем, что новая машина приходит с половиной заряда батареи
    }

    @Override
    public void refuel() {
        batteryLevel = 100.0;
        System.out.println("Электромобиль полностью заряжен");
    }

    @Override
    public boolean needsRefueling() {
        return batteryLevel < 25.0;
    }

    @Override
    public String getFuelStatus() {
        return "Уровень заряда батареи: " + batteryLevel + "%";
    }

    @Override
    public String toString() {
        return "ElectricCar{" +
                "batteryLevel=" + batteryLevel +
                ", brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", year=" + year +
                '}';
    }
}
