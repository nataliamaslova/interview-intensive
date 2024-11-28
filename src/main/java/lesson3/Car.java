package lesson3;

public class Car {
    private String brand;
    private String model;
    private int year;
    private boolean isEngineOn;

    public void turnOnEngine() {
        this.isEngineOn = true;
        System.out.println("Двигатель включен");
    }

    public void turnOffEngine() {
        this.isEngineOn = false;
        System.out.println("Двигатель выключен");
    }

    public String getCarInfo() {
        return "Car{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", year=" + year +
                ", isEngineOn=" + isEngineOn +
                '}';
    }

    public Car(String brand, String model, int year) {
        this.brand = brand;
        this.model = model;
        this.year = year;
        this.isEngineOn = false;    // Двигатель выключен по умолчанию
    }

    public static void main(String[] args) {
        Car car = new Car("X-trail", "Nissan", 2017);
        System.out.println(car.getCarInfo());
        car.turnOnEngine();
        System.out.println(car.getCarInfo());
        car.turnOffEngine();
        System.out.println(car.getCarInfo());
    }
}
