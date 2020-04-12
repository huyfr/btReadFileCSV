import java.io.*;

public class ReadFileCSV {
    public static void readCSV(File csv) {
        FileReader file = null;
        BufferedReader br = null;
        String line = null;
        String comma = ",";
        String[] country;

        try {
            file = new FileReader(csv);
        } catch (FileNotFoundException ex) {
            System.out.println(ex.getMessage());
        }

        try {
            br = new BufferedReader(file);
            while ((line = br.readLine()) != null) {
                country = line.split(comma);
                System.out.println("Country [code = " + country[4] + ", name = " + country[5] + "]");
            }
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        } finally {
            if (br != null) {
                try {
                    br.close();
                } catch (IOException ex) {
                    System.out.println(ex.getMessage());
                }
            }
        }
    }
}