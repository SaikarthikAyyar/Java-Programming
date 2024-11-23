import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
public class Main {
    public static void main(String[] args) {
        try {
            InputStream input = new FileInputStream("input.txt");
            System.out.print("Available bytes in the file:" + input.available());
        }
        catch (IOException e) {
            System.out.println("Unable to read input stream source");
        }
    }
}
