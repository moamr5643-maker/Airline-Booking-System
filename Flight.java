public class Flight {
    private String flightNumber;
    private String source;
    private String destination;
    private int totalSeats;
    private int availableSeats;
public Flight(String flightNumber,String source,String destination,int totalSeats,int availableSeats){
    this.flightNumber=flightNumber;
    this.source=source;
    this.destination=destination;
    this.totalSeats=totalSeats;
    this.availableSeats=availableSeats;
}
public String getflightNumber(){
    return flightNumber ;
}

public int getAvailableSeats() {
        return availableSeats;
    }
public String getSource(){
    return  source;
}
public String getDestination(){
    return destination;
}
    public boolean reserveSeats(){
    if(availableSeats>0){
        availableSeats--;
        return true;
    }
    else
        return false;
    }
    public void cancelSeat(){
    if(availableSeats<totalSeats)
        availableSeats++;
    }
    public void displayFlightinfo(){
        System.out.println(flightNumber+": "+source+" to "+destination+"(Available: "+availableSeats+"/"+totalSeats+")");
    }
}
