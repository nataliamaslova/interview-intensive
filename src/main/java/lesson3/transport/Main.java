package lesson3.transport;

public class Main {
    public static void main(String[] args) {
        Vehicle vehicle1 = new Car("Nissan", "Juke", 2020);
        Vehicle vehicle2 = new ElectricCar("Nissan", "Leaf", 2023);
        System.out.println(vehicle1);
        System.out.println(vehicle2);
        Car fuelCar = (Car) vehicle1;
        fuelCar.refuel();
        ElectricCar eCar = (ElectricCar) vehicle2;
        eCar.refuel();
        fuelCar.needsRefueling();
        eCar.needsRefueling();
        System.out.println(fuelCar);
        System.out.println(eCar);
    }
}
