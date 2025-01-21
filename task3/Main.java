package app;

// Импортируем пакет vehicles
import vehicles.*;

public class Main {
    public static void main(String[] args) {
        Car car1 = new Car();
        ElectricCar car2 = new ElectricCar();

        car1.setEngineType("Petrol");
        car1.setOwnerName("Dmitriy");

        // Используем методы, унаследованные от класса Car
        car2.setEngineType("Electric");
        car2.setOwnerName("Oleg");


    /*
    System.out.println(car1.engineType); - ошибка, к полю с модификатором protected, можно
                                           получить доступ  в приделах пакета vehicles.

    System.out.println(car2.ownerName); - ошибка, к полю с модификатором private можно получить
                                          доступ в приделах его класса.
      */

        System.out.println(car1.getOwnerName() + "'s car is " + car1.getEngineType());
        System.out.println(car2.getOwnerName() + "'s car is " + car2.getEngineType());

        car1.setInsuranceNumber(1238712032);

        System.out.println(car1.getInsuranceNumber());
        System.out.println(car2.getInsuranceNumber()); // т.к. поле InsuranceNumber для car2 не определено, выводится стандартное значение
        // унаследованное от класса Car
    }
}
