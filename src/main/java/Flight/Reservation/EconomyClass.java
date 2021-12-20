package Flight.Reservation;

public class EconomyClass extends Flight {

    private int availableSeats;
    private int price;
    private int array[];

    public EconomyClass(String flight_type, String org, String dest, String d, int seats, int p) {
        super(flight_type, org, dest, d, seats);
        availableSeats = seats;
        price = p;
        array = new int[availableSeats];
        for(int i=0;i<availableSeats;i++) {
            array[i] = 0;
        }
    }

    public void AddCustomer(Customer c) {
        cust.add(c);
        availableSeats--;
    }

    public int getAvailableSeats() {
        return availableSeats;
    }



    public void CancelFlight(String name) {
        cust.remove("name");
    }


    public void DisplaySeatNumbers() {
        for(int i=0;i<availableSeats;i++) {
            System.out.println(array[i]+ " ");
        }
    }

    /*public int SetSeatNumber(int index){
        if(array[index] == 1) {
            try {
                throw new WrongSeatException("Inavlid seat number");
            } catch (WrongSeatException e) {
                e.printStackTrace();
            }
        }
        array[index] = 1;
        return 1;
    }*/


}