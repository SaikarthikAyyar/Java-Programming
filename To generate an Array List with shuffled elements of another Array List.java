import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter number of elements in an arraylist:");
        int listSize = scanner.nextInt();
        ArrayList<Integer> shuffleList = new ArrayList<>();
        for(int i=0;i<listSize;i++){
            System.out.print("Enter list element:");
            int listElement = scanner.nextInt();
            list.add(listElement);
        }
        for(int i=0;i<listSize;i++){
            System.out.print("Enter any random number from 0" + " to " + (listSize) + ":");
            int shuffleIndex = scanner.nextInt();
            shuffleList.add(list.get(shuffleIndex));
        }
        System.out.println(shuffleList);
    }
}
