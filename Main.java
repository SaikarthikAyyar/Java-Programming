import java.util.Scanner;

class Vehicle {
    String model;
    int year;
    String fuelType;

    public static void fuelEfficiency(){};
    public static void distanceTraveled(){};
}
class Truck extends Vehicle {
    String model = "Tatra 810 4x4";
    int year = 2022;
    String fuelType = "Diesel";
    public static void fuelEfficiency(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the distance traveled:");
        int distance = scanner.nextInt();
        System.out.print("Enter the litres of petrol consumed:");
        int petrolConsumed= scanner.nextInt();
        System.out.println("Fuel efficiency is" + (distance/petrolConsumed));
    }
    public static void distanceTraveled(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the distance traveled in miles:");
        int distanceMile1 = scanner.nextInt();
        System.out.println("The distance traveled is:" + distanceMile1);
    }
    public static void maxSpeed(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the max distance travelled in meters:");
        int meters = scanner.nextInt();
        System.out.print("\nEnter time of journey in seconds:");
        int time=scanner.nextInt();
        System.out.println("The maximum speed is:" + (meters/time));
    }
}
class Car extends Vehicle {
    String model = "Virtus";
    int year = 2020;
    String fuelType = "petrol";
    public static void fuelEfficiency(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the distance traveled:");
        int distance = scanner.nextInt();
        System.out.print("Enter the litres of petrol consumed:");
        int petrolConsumed= scanner.nextInt();
        System.out.println("Fuel efficiency is" + (distance/petrolConsumed));
    }
    public static void distanceTraveled(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the distance traveled in miles:");
        int distanceMile1 = scanner.nextInt();
        System.out.println("The distance traveled is:" + distanceMile1);
    }
    public static void maxSpeed(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the max distance travelled in meters:");
        int meters = scanner.nextInt();
        System.out.print("\nEnter time of journey in seconds:");
        int time=scanner.nextInt();
        System.out.println("The maximum speed is:" + (meters/time));
    }
}
class Motorcycle extends Vehicle {
    String model = "Warrior200";
    int year = 2023;
    String fuelType ="Unleaded fuel";
    public static void fuelEfficiency(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the distance traveled:");
        int distance = scanner.nextInt();
        System.out.print("Enter the litres of petrol consumed:");
        int petrolConsumed= scanner.nextInt();
        System.out.println("Fuel efficiency is" + (distance/petrolConsumed));
    }
    public static void distanceTraveled(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the distance traveled in miles:");
        int distanceMile1 = scanner.nextInt();
        System.out.println("The distance traveled is:" + distanceMile1);
    }
    public static void maxSpeed() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the max distance travelled in meters:");
        int meters = scanner.nextInt();
        System.out.print("\nEnter time of journey in seconds:");
        int time = scanner.nextInt();
        System.out.println("The maximum speed is:" + (meters / time));
    }
    }


public class Main {
    public static void main(String[] args) {
        Truck vehicle1 = new Truck();
        Car vehicle2 = new Car();
        Motorcycle vehicle3 = new Motorcycle();
        System.out.println("Truck model:" + vehicle1.model);
        System.out.println("Truck manufacture date:" + vehicle1.year);
        System.out.println("Truck fuel type:" + vehicle1.fuelType);
        vehicle1.fuelEfficiency();
        vehicle1.distanceTraveled();
        vehicle1.maxSpeed();
        System.out.println("Car model:" + vehicle2.model);
        System.out.println("Car manufacture date:" + vehicle2.year);
        System.out.println("Car fuel type:" + vehicle2.fuelType);
        vehicle2.fuelEfficiency();
        vehicle2.distanceTraveled();
        vehicle2.maxSpeed();
        System.out.println("Motorcycle model:" + vehicle3.model);
        System.out.println("Motorcycle manufacture date:" + vehicle3.year);
        System.out.println("Motorcycle fuel type:" + vehicle3.fuelType);
        vehicle3.fuelEfficiency();
        vehicle3.distanceTraveled();
        vehicle3.maxSpeed();
    }
}