import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class ReadFileCSV {
    public static void readCSV(File csv) throws IOException {
        FileReader file = new FileReader(csv);
        BufferedReader br = null;
        String line = null;
        String comma = ",";
        String[] country;

        try {
            br = new BufferedReader(file);
            while ((line = br.readLine()) != null) {
                country = line.split(comma);
                System.out.println("Country [code = "+country[4]+", name = "+country[5]+"]");
            }
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        } finally {
            if (br != null){
                try {
                    br.close();
                } catch (IOException ex){
                    System.out.println(ex.getMessage());
                }
            }
        }
    }
}