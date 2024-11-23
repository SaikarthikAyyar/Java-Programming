import java.util.Scanner;

class Employee {
    public static void work(){
        System.out.println("This gentleman works as an emplyee in our company");
    }
    public static void getSalary(int salary) {
        System.out.println("The salary of the employee:"+salary);
    }
}
class HRManager extends Employee {
    public static void work() {
        System.out.println("This respected gentleman manages all the employees in our company:");
    }
    public static void getSalary(int managerSalary) {
        System.out.println("The manager's salary:"+managerSalary);
    }
    public static void addEmployee(){
        System.out.println("Our company has been gifted with another gentleman");
    }
}
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the salary of the employee:");
        int inputSalary1 = scanner.nextInt();
        System.out.print("\nEnter the salary of the manager:");
        int inputSalary2 = scanner.nextInt();
        Employee gentleman = new Employee();
        gentleman.work();
        gentleman.getSalary(inputSalary1);
        HRManager renownedGentleman = new HRManager();
        renownedGentleman.work();
        renownedGentleman.getSalary(inputSalary2);
        renownedGentleman.addEmployee();
    }
}