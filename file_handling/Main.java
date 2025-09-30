import java.io.File;
import java.io.FileWriter;

public class Main {
    public static void main(String[] args) {
        String data = "Hello World!!\n";
        String filename="text.txt";
        filewrite writer = new filewrite();
        writer.filewriter(filename, data);

        file f = new file();
        f.filereader(filename);
    }
}
