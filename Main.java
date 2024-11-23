import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter any string:");
        String inputString = scanner.nextLine();
        System.out.print("Enter substring:");
        String subString = scanner.nextLine();
        String checkString = inputString.substring(0,subString.length());
        if(checkString.equals(subString)){
            System.out.println("Given string " + inputString + " starts with " + subString);
        }
        else{
            System.out.println("The string does not begin with substring");
        }
    }
}