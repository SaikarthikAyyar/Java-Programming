import java.util.Scanner;

public class Main{
    public static int fibonacciSeries(int seriesLimit){
        if(seriesLimit==0) {
            return 0;
        }
        else if(seriesLimit==1) {
            return 1;
        }
        else
            return (fibonacciSeries(seriesLimit-1) + fibonacciSeries(seriesLimit-2));
    }
    public static void main(String args[]){
        Scanner scanner= new Scanner(System.in);
        System.out.print("Enter the number of elements in the fibonacci series:");
        int numberOfElementsInTHeSeries= scanner.nextInt();
        for(int i=0;i<numberOfElementsInTHeSeries;i++){
            System.out.println(fibonacciSeries(i));
        }
    }
}
