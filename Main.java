import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter any string:");
        String inputString = scanner.nextLine();
        System.out.print("Enter Character:");
        String character = scanner.nextLine();
        int count = 0;
        for(int i=0;i<inputString.length();i++){
            if(inputString.charAt(i) == character.charAt(0)){
                count++;
            }
        }
        System.out.println(count);
    }
}