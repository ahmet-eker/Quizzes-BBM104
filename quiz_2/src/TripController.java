import java.util.ArrayList;

public interface TripController {
    TripSchedule trip_schedule = new TripSchedule();
    FileIO filehandler = new FileIO();
    public Trip[] trips = trip_schedule.addToList(Main.lines);
    void TripController();

}
