import java.util.Scanner;



public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Choose an operation:");
        char operation= scanner.next().charAt(0);
        System.out.print("Enter the first number:");
        int number1= scanner.nextInt();
        System.out.print("Enter the second number:");
        int number2= scanner.nextInt();
        switch (operation) {
             case '+':
                  System.out.print(number1 + "+" + number2 + "=" + (number1 + number2));
                  break;
             case '-':
                  System.out.print(number1 + "-" + number2 + "=" + (number1 - number2));
                  break;
             case '*':
                  System.out.print(number1 + "*" + number2 + "=" + (number1 * number2));
                  break;
             case '/':
                  System.out.print(number1 + "/" + number2 + "=" + (number1 / number2));
                  break;
             default:
                  System.out.print("Invalid operator!");
        }
        scanner.close();
    }
}
