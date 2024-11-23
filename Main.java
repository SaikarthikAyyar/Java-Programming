import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter any string:");
        String string1 = scanner.next();
        System.out.print("Enter another string:");
        String string2 = scanner.next();
        char ch;
        String newString1 = " ";
        String newString2 = " ";
        for(int i=0;i<string1.length();i++){
            ch = string1.charAt(i);
            newString1 = ch + newString1;
        }
        for(int i=0;i<string2.length();i++){
            ch = string2.charAt(i);
            newString2 = ch + newString2;
        }
        System.out.println("First string reversed is:"+newString1);
        System.out.println("Second string reversed is:"+newString2);
    }
}