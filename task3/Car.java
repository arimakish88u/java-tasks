package vehicles;

public class Car {
    private String ownerName;
    private int insuranceNumber = -1;
    protected String engineType;


    // Методы доступа для поля ownerName

    public void setOwnerName(String name) {
        this.ownerName = name;
    }

    public String getOwnerName() {
        return this.ownerName;
    }

    // Методы доступа для поля insuranceNumber

    public void setInsuranceNumber(int number) {
        this.insuranceNumber = number;
    }

    public int getInsuranceNumber() {
        return this.insuranceNumber;
    }

    // Методы доступа для поля engineType


    public String getEngineType() {
        return engineType;
    }

    public void setEngineType(String engineType) {
        this.engineType = engineType;
    }
}
