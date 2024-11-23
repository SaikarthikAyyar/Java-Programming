import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter number of elements in an arraylist:");
        int listSize = scanner.nextInt();
        ArrayList<Integer> reverseList = new ArrayList<>();
        for(int i=0;i<listSize;i++){
            System.out.print("Enter list element:");
            int listElement = scanner.nextInt();
            list.add(listElement);
        }
        for(int i=0;i<listSize;i++){
            reverseList.add(list.get(listSize-1-i));
        }
        System.out.println(reverseList);
    }
}