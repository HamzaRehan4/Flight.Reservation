package Flight.Reservation;

public class WrongSeatException extends Exception {
    public WrongSeatException(String msg) {
        super(msg);
    }

    @Override
    public String toString() {
        return "WrongSeatException{}";
    }
}
