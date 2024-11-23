import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        String[] alphabets={"A","B","C","D","E","F","G","H","I","J","K","L","M","N","O","P","Q","R","S","T","U","V","W","X","Y","Z"};
        Scanner scanner= new Scanner(System.in);
        System.out.print("Enter number of rows in pyramid:");
        int numberOFRows= scanner.nextInt();
        for(int i=0;i<numberOFRows;i++){
            for(int j=0;j<=i;j++){
                System.out.print(alphabets[j]);
            }
            System.out.print("\n");
        }
    }
}
