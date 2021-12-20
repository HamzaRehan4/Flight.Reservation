package Flight.Reservation;

import java.util.ArrayList;
import java.util.LinkedList;

public abstract class Flight {
    private String FlightType; //USELESS
    private String Origin;
    private String Destination;
    private String Date;
    //protected int SeatNo[];
    protected LinkedList<Customer> cust;

    public Flight(String flight_type, String org, String dest, String d,int p) {
        FlightType = flight_type;
        Origin = org;
        Destination = dest;
        Date = d;
        cust = new LinkedList<Customer>();
    }

    public Flight(Flight f) {
        FlightType = f.FlightType;
        Origin = f.Origin;
        Destination = f.Destination;
    }

    public String getFlightType() {
        return FlightType;
    }

    public void setFlightType(String flightType) {
        FlightType = flightType;
    }

    //public abstract int setSeatNo(int index);

    public String getOrigin() {
        return Origin;
    }

    public void setOrigin(String origin) {
        Origin = origin;
    }

    public String getDestination() {
        return Destination;
    }

    public void setDestination(String destination) {
        Destination = destination;
    }

    public abstract void AddCustomer(Customer c);

    public String getDate() {
        return Date;
    }

    public void setDate(String date) {
        this.Date = date;
    }


    public abstract void CancelFlight(String name);

}