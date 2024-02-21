import java.util.ArrayList;
import java.util.Comparator;

public class idComparator implements Comparator<String> {

    @Override
    public int compare(String verse1, String verse2) {
        // Split the strings into their component parts
        String[] parts1 = verse1.split("\t");
        String[] parts2 = verse2.split("\t");

        // Convert the first component to integers
        int number1 = Integer.parseInt(parts1[0]);
        int number2 = Integer.parseInt(parts2[0]);

        // Compare the integers and return the result
        return Integer.compare(number1, number2);
    }
}

