import java.util.*;
public class Main {
    public static void main(String[] args) {
    Scanner in =new Scanner(System.in);
        ArrayList<Flight>flights=new ArrayList<>();
        ArrayList<Booking>bookings=new ArrayList<>();
        flights.add(new Flight("AI1001","cairo","Dubai",50,50));
        flights.add(new Flight("FL1021","Qatar","Holonda",100,100));
        flights.add(new Flight("EW5321","Delhi","cairo",150,150));
while (true){
    System.out.println("\n---Fight Booking System ---");
    System.out.println("1. view All Flights ");
    System.out.println("2. Book a Flight ");
    System.out.println("3. View My Bookings");
    System.out.println("4. Search Flight");
    System.out.println("5.cancel Booking");
    System.out.println("6. Exit ");
    System.out.println("choose option: ");
   String choice= in.nextLine();
   // in.nextLine();
    if(Objects.equals(choice, "1")){
        for (Flight f:flights)f.displayFlightinfo();
    }
    else if (Objects.equals(choice, "2")) {
        System.out.println("Enter Name: ");
        String name=in.nextLine();
        System.out.println("Enter Email: ");
        String email=in.nextLine();
        System.out.println("Enter passport: ");
        String passprt=in.nextLine();
        System.out.println("Enter Flight Number: ");
        String flightNumber=in.nextLine();
    Flight selctedFlight=null;
    for(Flight f:flights){
        if(f.getflightNumber().equalsIgnoreCase( flightNumber)){
            selctedFlight=f;
            break;
        }
    }
    if(selctedFlight!=null&&selctedFlight.reserveSeats()){
        Passenger p=new Passenger(name,email,passprt);
        Booking b=new Booking(p,selctedFlight);
        bookings.add(b);
        System.out.println("Booking Successful!");
    }
    else {
        System.out.println("Flight Not found or no Seats Available.");
    }
    } else if (Objects.equals(choice, "3")) {
        System.out.println("Enter your passport Number");
        String passportn=in.nextLine();
        boolean booked=false;
        for(Booking b:bookings){
            if(Objects.equals(b.getPassport(), passportn)) {
                b.getBookingDetails();
                booked=true;
            }
        }
        if(!booked) System.out.println("there is no Bookings plesse fort his passport  Book first! :)");
    }
    else if(Objects.equals(choice, "4")){
        System.out.println("Enter Source");
        String src=in.nextLine();
        System.out.println("Enter Destination");
        String des=in.nextLine();
        boolean found =false;
        for (Flight f:flights){
            if(f.getSource().equalsIgnoreCase(src)&&f.getDestination().equalsIgnoreCase(des)){
                found=true;
                f.displayFlightinfo();
                break;
            }
        }
if(!found)
    System.out.println("no Flight found for this rout :(");
    }

    else if (choice.equalsIgnoreCase("5")) {
        System.out.println("Enter Passport Number please: ");
        String pasport=in.nextLine();
        Iterator<Booking>it=bookings.iterator();
        boolean removed=false;
        while (it.hasNext()){
            Booking b=it.next();
            if(b.getPassport().equalsIgnoreCase(pasport)){
                it.remove();
                removed=true;
                break;
            }
        }
        if(!removed)
            System.out.println("Booking Not Found");
        else
            System.out.println("Booking Cancelled Successfully");
    }
    else if (choice.equalsIgnoreCase("6")) {
        System.out.println("GOOD BYE :)");
        break;
    }
    else{
        System.out.println("Enter an Valid option");
    }
}
    }
}