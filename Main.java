import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of rows in the pyramid:");
        int numberOfRows = scanner.nextInt();
        for (int i = numberOfRows; i > 0; i--) {
            int k = 0;
            for (int j = 1; j <= numberOfRows - i; j++) {
                System.out.print(" ");
            }
            for (k = 0; k < 2 * i - 1; k++) {
                System.out.print("*");
            }
            System.out.print("\n");
        }
    }
}