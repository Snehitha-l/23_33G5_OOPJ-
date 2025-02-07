class Vehicle
{
void start()
{
System.out.println("Vehicle is starting...");
}
}
class Car extends Vehicle
{
void drive()
{
System.out.println("Car is being driven...");
}
}
class ElectricCar extends Car
{
void charge()
{
System.out.println("Electric car is charging...");
}
}
class MultiInheritance
{
public static void main(String[] args)
{
ElectricCar tesla=new ElectricCar();
tesla.start();
tesla.drive();
tesla.charge();
}
}


Output:
D:\33g5>javac MultiInheritance.java

D:\33g5>java MultiInheritance
Vehicle is starting...
Car is being driven...
Electric car is charging...
