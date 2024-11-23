import java.util.Scanner;

public class Main {
    public static void main(String args[]){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number:");
        int number= scanner.nextInt();
        int productOfNumbersTillNumber=1;
        for(int i=number;i>0;i--)
            productOfNumbersTillNumber=productOfNumbersTillNumber*i;
        System.out.println("The factorial of " + number + " is " + productOfNumbersTillNumber);
    }
}