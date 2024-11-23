import java.util.Scanner;

class Vehicle {
    String model;
    int year;
    String fuelType;

    public static void fuelEfficiency(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the distance traveled:");
        float distance = scanner.nextFloat();
        System.out.print("Enter the litres of petrol consumed:");
        float petrolConsumed= scanner.nextFloat();
        System.out.println("Fuel efficiency is:" + (distance/petrolConsumed));
    }
    public static void distanceTraveled(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the distance traveled in kilometers:");
        int distanceKM = scanner.nextInt();
        double distanceMile = distanceKM*0.62137;
        System.out.println("The distance traveled in miles:" + distanceMile);
    }
    public static void averageSpeed(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the total distance travelled in meters:");
        float meters = scanner.nextFloat();
        System.out.print("\nEnter total time of journey in seconds:");
        float time=scanner.nextFloat();
        System.out.println("The average speed is:" + (meters/time));
    }
}
class Truck extends Vehicle {
    String model = "Tatra 810 4x4";
    int year = 2022;
    String fuelType = "Diesel";
    public static void averageSpeed(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the total distance travelled in meters:");
        float meters = scanner.nextFloat();
        System.out.print("\nEnter total time of journey in seconds:");
        float time=scanner.nextFloat();
        System.out.println("The average speed is:" + (meters/time));
    }
}
class Car extends Vehicle {
    String model = "Virtus";
    int year = 2020;
    String fuelType = "petrol";
}
class Motorcycle extends Vehicle {
    String model = "Warrior200";
    int year = 2023;
    String fuelType ="Unleaded fuel";

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
        vehicle1.averageSpeed();
        System.out.println("Car model:" + vehicle2.model);
        System.out.println("Car manufacture date:" + vehicle2.year);
        System.out.println("Car fuel type:" + vehicle2.fuelType);
        vehicle2.fuelEfficiency();
        vehicle2.distanceTraveled();
        vehicle2.averageSpeed();
        System.out.println("Motorcycle model:" + vehicle3.model);
        System.out.println("Motorcycle manufacture date:" + vehicle3.year);
        System.out.println("Motorcycle fuel type:" + vehicle3.fuelType);
        vehicle3.fuelEfficiency();
        vehicle3.distanceTraveled();
        vehicle3.averageSpeed();
    }
}
