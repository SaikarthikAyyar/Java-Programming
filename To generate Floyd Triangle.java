import java.util.Scanner;


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
