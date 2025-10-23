package org.example;
interface Vehicle
{
    void start();
    void stop();
    default void fuel(){
        System.out.println("Fuel type is gas");
    }
}
interface Engine{
    void speed();
}
class Car implements Vehicle,Engine{
    public void start(){
        System.out.println("Car will start now");
    }
    public void stop(){
        System.out.println("Car will stop now");
    }
    public void speed(){
        System.out.println("Speed is good");
    }
}
class Bike implements Vehicle{
    public void start(){
        System.out.println("Bike will start now");
    }
    public void stop(){
        System.out.println("Bike will stop now");
    }

}
public class InterfaceExample {
    public static void main(String[] args) {
        Car car=new Car();
        car.start();
        car.stop();
        car.speed();
        car.fuel();
        Bike b=new Bike();
        b.start();
        b.stop();
        b.fuel();

    }
}
