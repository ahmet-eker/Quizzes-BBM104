import java.util.ArrayList;

public class TripSchedule {
    public static Trip[] trips_ex = new Trip[100];
    public Trip[] addToList(ArrayList<String> inputLines){
        for(int i=0; i<inputLines.size(); i++){
            Trip newTrip = new Trip(inputLines.get(i));
            trips_ex[i] = newTrip;
        }
        return trips_ex;
    }
}
