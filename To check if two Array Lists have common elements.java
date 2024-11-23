import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> list1 = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter number of elements in the arraylists:");
        int listSize = scanner.nextInt();
        for(int i=0;i<listSize;i++){
            System.out.print("Enter list element:");
            int listElement = scanner.nextInt();
            list1.add(listElement);
        }
        ArrayList<Integer> list2 = new ArrayList<>();
        for(int i=0;i<listSize;i++){
            System.out.print("Enter list element:");
            int listElement = scanner.nextInt();
            list2.add(listElement);
        }
        for(int i=0;i<listSize;i++){
            if(list1.get(i) == list2.get(i)){
                System.out.println("Yes");
            }
            else{
                System.out.println("No");
            }
        }
    }
}
