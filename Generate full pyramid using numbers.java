import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        System.out.print("Enter number of rows in the pyramid:");
        int numberOfRows= scanner.nextInt();
        int k;
        for(int i=1;i<=numberOfRows;i++){
            for(int j=1;j<=numberOfRows-i;j++){
                System.out.print(" ");
            }
        k=1;
        for(int l=(2*i-1);l>0;l--,k++)
            {
                if(l<=k)
                    System.out.print(k);
                else
                    System.out.print(l);
            }
            System.out.print("\n");
        }
    }
}
