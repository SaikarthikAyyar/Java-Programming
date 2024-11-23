import java.util.Scanner;
class NewMethod{
    public void stringChecker() throws  Exception{
        Scanner input = new Scanner(System.in);
        int count = 0;
        System.out.print("Enter any string input:");
        String givenString = input.next();
        int stringSize = givenString.length();
        for(int i=0;i<stringSize;i++) {
            if (givenString.toLowerCase().charAt(i) == 'a' || givenString.toLowerCase().charAt(i) == 'e' || givenString.toLowerCase().charAt(i) == 'i' || givenString.toLowerCase().charAt(i) == 'o' || givenString.toLowerCase().charAt(i) == 'u') {
                count++;
            }
        }
        try {
            if(count == 0){
                throw new Exception();
            }
        }
        catch (Exception e) {
            System.out.println("No vowels");
        }
    }

}
public class Main {
    public static void main(String[] args) throws Exception {
        NewMethod checkVowel = new NewMethod();
        checkVowel.stringChecker();
    }
}