import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        System.out.print("Enter the number of rows in the pyramid:");
        int numberOfRows= scanner.nextInt();
        for(int i=1;i<=numberOfRows;i++){
            int k=0;
            for(int j=1;j<=numberOfRows-i;j++){
                System.out.print(" ");
            }
            for(k=0;k<2*i-1;k++){
                System.out.print("*");
            }
            System.out.print("\n");
        }
    }
}