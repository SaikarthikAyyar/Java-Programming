import java.util.ArrayList;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) throws Exception{
        Scanner integer = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<Integer>();
        System.out.print("Enter number of elements in list:");
        int sizeOfList = integer.nextInt();
        for(int i=0;i<sizeOfList;i++) {
            System.out.print("Enter list element:");
            int listElement = integer.nextInt();
            list.add(listElement);
            try {
                for(int j=0;j<i;j++) {
                    if(listElement == list.get(j)) {
                        throw new Exception("Duplicate");
                    }
                }
            }
            catch (Exception e) {
                System.out.println("This number is repeated.");
            }
        }
    }
}
