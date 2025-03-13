import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class CheckedExceptionExample {
    public static void main(String[] args) {
        try {
            // Attempt to read a file that may not exist
            File file = new File("test.txt");
            FileReader fr = new FileReader(file);  // May throw IOException
            System.out.println("File opened successfully!");
        } catch (IOException e) {
            System.out.println("Caught Exception: " + e.getMessage());
        }
    }
}
