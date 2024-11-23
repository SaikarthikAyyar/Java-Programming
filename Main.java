import java.util.Scanner;

public class Main{
    public static void main(String args[]){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter any year:");
        int inputYear= scanner.nextInt();
        if(inputYear%4==0)
            System.out.println("The year " + " is a leap year");
        else
            System.out.println("The year " + " is not a leap year");
    }
}