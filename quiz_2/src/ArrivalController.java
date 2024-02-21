public class ArrivalController implements TripController{
    public void TripController(){
        filehandler.writeToFile("output.txt","Arrival order:",true,true);
        for(int y=0; y<trips.length;y++){
            if(trips[y] == null){
                break;
            }
            filehandler.writeToFile("output.txt",String.format("%s arrive at %s   Trip State:%s", trips[y].name, trips[y].arrivalTime.toString(), trips[y].state),true,true);
        }
    }
}
