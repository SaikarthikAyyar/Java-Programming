import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        System.out.print("Enter the number of rows in the pyramid:");
        int numberOfRows= scanner.nextInt();
        int numberCount=1;
        for(int i=1;i<=numberOfRows;i++){
            for(int j=1;j<=i;j++){
                System.out.print(numberCount+" ");
                numberCount++;
            }
            System.out.print("\n");
        }
    }
}