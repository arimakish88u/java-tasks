package app;

import vehicles.Car;
import vehicles.ElectricCar;

public class TestCar {
    public static void main(String[] args) {
        Car car = new Car("Toyota", "ABC123", "Red", 2020, "John Doe", "INS12345");
        ElectricCar electricCar = new ElectricCar("Tesla Model S", "EV456", "Blue", 2022, "Alice Smith", "INS67890", 100);

        // Изменение года выпуска и имени владельца
        car.setYear(2021);
        car.setOwnerName("Jane Doe");

        // Изменение страхового номера
        electricCar.setInsuranceNumber("INS54321");

        // Получение информации о емкости батареи
        int batteryCapacity = electricCar.getBatteryCapacity();
        System.out.println("Battery Capacity: " + batteryCapacity + " kWh");

        // Вывод информации о транспортных средствах
        System.out.println(car);
        System.out.println(electricCar);
    }
}

