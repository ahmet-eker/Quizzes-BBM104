import java.io.FileNotFoundException;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.Date;

public class Main {
    static ArrayList<String> lines;
    public static void main(String[] args) throws FileNotFoundException {
        FileIO filehandler = new FileIO();
        lines = filehandler.readFile("input.txt");
        DepartureController dep_con = new DepartureController();
        ArrivalController arr_con = new ArrivalController();
        dep_con.TripController();
        arr_con.TripController();
    }
}