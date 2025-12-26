import javax.xml.namespace.QName;

public class Passenger extends User {
    private String passportNumber;

    public Passenger (String name,String email,String passportNumber){
        super(name,email);
        this.passportNumber=passportNumber;
    }
    public String getPassport(){
        return passportNumber;
    }

    public void displaydetails() {
        System.out.println("passenger "+getName()+" | Email "+getEmail()+" | passport "+passportNumber);
    }
}
