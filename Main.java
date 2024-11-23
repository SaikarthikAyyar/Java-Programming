import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        System.out.print("Enter the number of rows in the pyramid:");
        int numberOfRows= scanner.nextInt();
        int coef=1;
        for(int i=0;i<numberOfRows;i++) {
            for (int j = 1; j <= numberOfRows - i; j++) {
                System.out.print(" ");
            }
            for (int k = 0; k <= i; k++) {
                if (k == 0 || i == 0) {
                    coef = 1;
                    System.out.print(coef+" ");
                }
                else {
                    coef = coef * (i - k + 1) / k;
                    System.out.print(coef+ " ");
                }
            }
            System.out.print("\n");
        }
    }
}