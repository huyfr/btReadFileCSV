import java.io.File;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        String path = "G:\\codegym\\module2\\btReadFileCSV\\src\\example.csv";
        File file = new File(path);
        ReadFileCSV.readCSV(file);
    }
}