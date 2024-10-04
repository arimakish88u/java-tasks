public class Main {
    public static void main(String[] args) {
        Car Car1 = new Car();
        Car Car2 = new Car("Camry", "yellow");
        Car Car3 = new Car("Corvette", "abc123", "red",2001);

        System.out.println(Car2.toString());
        System.out.println("Year of third car: " + Car3.getYear());
        Car3.setYear(2005);
        System.out.println("Updated year of third car: " + Car3.getYear());
        Car3.setYear(2024 - Car3.getYear());
        System.out.println("Age of car:" + Car3.getYear() );
    }
}
