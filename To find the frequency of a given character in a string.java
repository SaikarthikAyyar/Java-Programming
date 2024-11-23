import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter any string:");
        String inputString = scanner.next();
        System.out.print("\nEnter any character in the string:");
        char stringCharacter = scanner.next().charAt(0);
        int frequency = 0;
        for(int i=0;i<inputString.length();i++) {
            if(inputString.charAt(i) == stringCharacter) {
                frequency++;
            }
        }
        System.out.println("The frequency of the character is:" + frequency);
    }
}
