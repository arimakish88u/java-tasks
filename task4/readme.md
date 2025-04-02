Task
Your program should be organized into packages:
● Vehicles package for Vehicle, Car, ElectricCar classes
● The app package for the TestCar test class.
Using the program implemented in the 2nd and 3rd practical papers, make
the following changes:
1. Add an abstract Vehicle class that will represent
the common properties of all vehicles. Include
the following general fields for vehicles in this class: model;
license (license plate); color (color); year (year of manufacture);
ownerName (owner's name); insuranceNumber (insurance
number); EngineType (engine type, the field must be
protected for inheritance). Define an abstract method
VehicleType(), which will return the type
of vehicle. Add methods for getting and changing
field values (getters and setters).
• Change the Car class so that it inherits Vehicle. Implement
an abstract VehicleType() method so that it returns "Car". In
the constructor of the Car class, use the fields and methods of the parent
class.
• Change the ElectricCar class so that it inherits Car. Add the
batteryCapacity field to the class and the methods for working with it.
Implement the VehicleType() method, which will return "Electric
Car". Use the protected EngineType field to set the value
"Electric" in the ElectricCar class.
• Use polymorphism in the test class to work with objects
Car and ElectricCar via links to parent classes. Create
Car and ElectricCar objects, change their properties using
setters, and display the information on the screen using the method
toString().
• Enable encapsulation: Make sure that the fields of each class are
accessed through methods (getters and setters), and not directly.
