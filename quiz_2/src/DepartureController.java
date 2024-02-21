public class DepartureController implements TripController{
    public void TripController(){
        filehandler.writeToFile("output.txt","Departure order:",false,true);
        for(int y=0; y<trips.length;y++){
            if(trips[y] == null){
                filehandler.writeToFile("output.txt","",true,true);
                break;
            }
            filehandler.writeToFile("output.txt",String.format("%s depart at %s   Trip State:IDLE",trips[y].name, trips[y].departureTime.toString()),true,true);
        }
    };
}
