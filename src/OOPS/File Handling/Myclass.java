import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.nio.Buffer;

public class Myclass{
    public static void main(String[] args) throws Exception{
        System.out.println("File Handling in Java using CRUD operations.");
        // File file = new File("file.txt");
        // System.out.println(file.exists());
        // System.out.println(file.canRead());

        FileWriter fw = new FileWriter("file.txt");
        BufferedWriter bw = new BufferedWriter(fw);
        bw.write("Hello World");
        bw.close();
        FileReader fr = new FileReader("file.txt");
        try (BufferedReader br = new BufferedReader(fr)) {
            System.out.println(br.readLine());
        }

        // We use buffer pool to read and write data to the file.
    }
}