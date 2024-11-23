import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter any string of characters:");
        String string1 = scanner.next();
        System.out.print("Enter another string of characters:");
        String string2 = scanner.next();
        int countOfCharacters=0;
        String newString1 = " ";
        String newString2 = " ";
        for(int i=0;i<string1.length();i++) {
            for (int j = 0; j < string2.length(); j++) {
                if (string1.charAt(i) == string2.charAt(j)) {
                    countOfCharacters++;
                }
            }
        }
        if(countOfCharacters == string1.length() && countOfCharacters == string2.length()) {
            System.out.println("Both strings are anagrams");
        }
        else
            System.out.println("Both strings are not anagrams");
    }
}