import java.io.File;

public class Main {
    public static void main(String[] args) {
        String path = "G:\\codegym\\module2\\btReadFileCSV\\src\\example.csv";
        File file = new File(path);
        ReadFileCSV.readCSV(file);
    }
}