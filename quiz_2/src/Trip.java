import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.ZoneId;
import java.time.temporal.ChronoUnit;
import java.util.Calendar;
import java.util.Date;

public class Trip {
    public String name, state = "IDLE";
    public LocalTime departureTime, arrivalTime;
    public int duration;
    public Trip(String inputLine) {
        name = inputLine.split("\t")[0];
        departureTime = LocalTime.parse(inputLine.split("\t")[1]);
        duration = Integer.parseInt(inputLine.split("\t")[2]);
        arrivalTime = calculateArrival(departureTime, duration);
    }
    public LocalTime getDepartureTime() {
        return departureTime;
    }
    public LocalTime getArrivalTime(String newArrivalTime) {
        return arrivalTime;
    }
    public LocalTime calculateArrival(LocalTime tripDepartureTime, int tripDuration){
         return tripDepartureTime.plusMinutes(tripDuration);
    }
    public String getState() {
        return state;
    }
    public void setState(String newState) {
        this.state = newState;
    }

}
