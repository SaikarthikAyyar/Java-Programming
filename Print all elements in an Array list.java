import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter number of elements in the arraylists:");
        int listSize = scanner.nextInt();
        for(int i=0;i<listSize;i++){
            System.out.print("Enter list element:");
            int listElement = scanner.nextInt();
            list.add(listElement);
        }
        for(int i=0;i<listSize;i++){
            System.out.println(list.get(i));
        }
    }
}
