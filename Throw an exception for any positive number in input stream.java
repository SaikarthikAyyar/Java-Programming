import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
public class Main {
    public static void main(String[] args) {
        byte[] array = new byte[100];
        try {
            InputStream input = new FileInputStream("input.txt");
            input.read(array);
            for(int i=0;i<100;i++){
                if(array[i]>0) {
                    throw new IOException();
                }
            }
        }
        catch (IOException e) {
            System.out.println("Positive Number present");
        }
    }
}
