import java.util.Date;

public class Booking {
    private Passenger p;
    private Flight f;
    private Date bookingDate;
    public Booking(Passenger p,Flight f){
        this.p=p;
        this.f=f;
        this.bookingDate=new Date();
    }
    public String getPassport(){
        return p.getPassport();
    }
    public Flight getFlight(){
        return f;
    }
    public void getBookingDetails(){
        System.out.println("----- Bookingreceipt-----");
        System.out.println("Date "+bookingDate);
        p.displaydetails();
        f.displayFlightinfo();
    }
}
