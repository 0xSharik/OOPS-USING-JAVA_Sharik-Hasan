import java.util.*;
import java.lang.*;

 class Main {

    static class Vehicle {
        int speed = 120;
        String brand = "Honda";

        public void displayInfo() {
            System.out.println("Brand: " + brand);
            System.out.println("Speed: " + speed);
        }
    }

    static class Bike extends Vehicle {
        int topspeed = 150;

        public void displayInfo() {
            System.out.println("Brand: " + brand);
            System.out.println("Speed: " + speed);
            System.out.println("Top Speed: " + topspeed);
        }
    }

    static class Car extends Vehicle {
        int seats = 5;

        public void displayInfo() {
            System.out.println("Brand: " + brand);
            System.out.println("Speed: " + speed);
            System.out.println("Seats: " + seats);
        }
    }

    public static void main(String[] args) {
        Vehicle obj1 = new Vehicle();
        Bike obj2 = new Bike();
        Car obj3 = new Car();

        obj1.displayInfo();
        System.out.println();

        obj2.displayInfo();
        System.out.println();

        obj3.displayInfo();
    }
}