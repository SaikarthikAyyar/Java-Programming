import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter any string:");
        String inputString = scanner.nextLine();
        System.out.print("Enter word in string to be replaced:");
        String stringWord = scanner.nextLine();
        System.out.print("Enter replace word:");
        String replaceWord = scanner.nextLine();
        System.out.println(inputString.replaceAll(stringWord,replaceWord));
    }
}
