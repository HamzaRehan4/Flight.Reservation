package Flight.Reservation;

public class ExecutiveClass extends Flight {
    private int availableSeats;
    private int price;
    int array[];

    public ExecutiveClass(String flight_type, String org, String dest, String d, int seats, int p) {
        super(flight_type, org, dest, d, seats);
        availableSeats = seats;
        price = p;
        array = new int[availableSeats];
    }


    public int getAvailableSeats() {
        return availableSeats;
    }

    @Override
    public void AddCustomer(Customer c) {

    }

    public void CancelFlight(String name) {
        cust.remove("name");
    }

    public int getPrice() {
        return price;
    }

    public void DisplaySeatNumbers() {
        for (int i = 0; i < availableSeats; i++) {
            System.out.println(array[i] + " ");
        }
    }

    }
