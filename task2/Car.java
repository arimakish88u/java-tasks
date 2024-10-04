public class Car {
    // Поля класса
    private String model;
    private String license;
    private String color;
    private int year;

    // Конструктор, который включает все поля класса
    public Car(String model, String license, String color, int year) {
        this.model = model;
        this.license = license;
        this.color = color;
        this.year = year;
    }

    // Конструктор по умолчанию
    public Car() {
        this.model = "Unknown";
        this.license = "Unknown";
        this.color = "Unknown";
        this.year = 0;
    }

    // Конструктор, который включает поля по выбору студента
    public Car(String model, String color) {
        this.model = model;
        this.color = color;
        this.license = "Unknown";
        this.year = 0;
    }

    // Геттеры и сеттеры для доступа к полям

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }


    // Метод toString() для вывода значений полей
    @Override
    public String toString() {
        return "Car{" +
                "model='" + model + '\'' +
                ", license='" + license + '\'' +
                ", color='" + color + '\'' +
                ", year=" + year +
                '}';
    }

}
