import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter any string:");
        String inputString = scanner.nextLine();
        int totalSize = inputString.length();
        int breakSize=1;
        for(int i=2;i<totalSize;i++){
            if(totalSize%i == 0){
                breakSize = i;
            }
        }
        System.out.println("The string divide into " + (totalSize/breakSize) + " parts and they are:");
        for(int i=0;i<totalSize;i=i+breakSize){
            System.out.println(inputString.substring(i,i+breakSize));
        }
    }
}
