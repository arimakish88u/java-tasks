Task

Your program should be organized into packages:
• Vehicles package for Vehicle, Car, ElectricCar, and
ElectricVehicle classes.
• The app package for the TestCar test class.
Create an abstract Vehicle class that will represent the general
characteristics of any vehicle. Include the following fields:
model, license, color, year, ownerName, insuranceNumber, engineType.
Define the methods: getters and setters for each field, as well as the method
toString(), which returns a string with a description of the vehicle.
Add an abstract VehicleType() method that will return the type
of vehicle (for example, "Car", "Electric Car").
The Car class must inherit from the abstract Vehicle class. In the constructor
, specify the engine type as "Combustion". Implement the VehicleType() method,
which returns "Car".
Define the ElectricVehicle interface, which will describe
specific methods for electric vehicles. The interface should have
the following methods: getBatteryCapacity() and setBatteryCapacity().
The ElectricCar class should inherit the Car class and implement the interface
ElectricVehicle. Implement the interface methods and add the batteryCapacity field
to store information about the battery capacity. In the constructor, set
the engine type as "Electric".

Program Testing Requirements:
• Instances of the Car and ElectricCar classes have been created.
• Change of the year of manufacture and the name of the owner.
• Change of insurance number.
• Getting information about the battery capacity of an electric vehicle.
• Output information about vehicles to the console using
the toString() method.
