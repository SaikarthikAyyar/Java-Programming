import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter any string:");
        String vowels="aeiou";
        String digits="0123456789";
        String consonants="bcdfghjklmnpqrstvwxyz";
        String inputString= scanner.next();
        int countVowel=0,countDigit=0,countConsonant=0,countSpaces=0;
        for(int i=0;i<inputString.length();i++){
            for(int j=0;j<vowels.length();j++){
                if(inputString.toLowerCase().charAt(i)==vowels.charAt(j)) {
                    countVowel++;
                }
            }
            for(int j=0;j<digits.length();j++) {
                if(inputString.charAt(i) == digits.charAt(j)) {
                    countDigit++;
                }
            }
            char ch = inputString.charAt(i);
            if(ch == ' ' ) {
                countSpaces++;
            }
            for(int j=0;j<consonants.length();j++) {
                if(inputString.toLowerCase().charAt(i) == consonants.charAt(j)) {
                    countConsonant++;
                }
            }

        }
        System.out.println("The number of vowels are:" + countVowel);
        System.out.println("The number of digits are:" + countDigit);
        System.out.println("The number of spaces are:" + countSpaces);
        System.out.println("The number of consonants are:" + countConsonant);
    }
}
