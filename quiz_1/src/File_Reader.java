import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class File_Reader {
    public ArrayList<String> reader(String file_txt) {
        ArrayList<String> lines = new ArrayList<String>();
        try {
            FileReader fr = new FileReader(file_txt);
            BufferedReader br = new BufferedReader(fr);
            String line;
            while ((line = br.readLine()) != null) {
                lines.add(line);
            }
            br.close();
            fr.close();
        } catch (IOException e) {
            //System.out.println("Error reading file: " + e.getMessage());
        }
            return lines;
    }
}