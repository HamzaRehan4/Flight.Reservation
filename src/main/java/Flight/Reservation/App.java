package Flight.Reservation;
import javax.lang.model.element.Name;
import java.io.FileWriter;
import java.util.Scanner;
import java.io.IOException;

public class App {

    /*private static EconomyClass Pak_Ger1;
    private static BusinessClass Pak_Ger2;
    private static ExecutiveClass Pak_Ger3;

    private static EconomyClass Pak_Net1;
    private static BusinessClass Pak_Net2;
    private static ExecutiveClass Pak_Net3;

    private static EconomyClass Pak_UAE1;
    private static BusinessClass Pak_UAE2;
    private static ExecutiveClass Pak_UAE3;
*/
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        EconomyClass Pak_Ger1 = new EconomyClass("Economy Class","Pakistan","Germany","18 Oct, 21",100,250000);
        BusinessClass Pak_Ger2 = new BusinessClass("Business Class","Pakistan","Germany","19 Nov, 21",100,300000);
        ExecutiveClass Pak_Ger3 = new ExecutiveClass("Executive Class","Pakistan","Germany","20 Oct, 21",100,350000);


        EconomyClass Pak_Net1 = new EconomyClass("Economy Class","Pakistan","Netherlands","1 Oct, 21",1,250000);
        BusinessClass Pak_Net2 = new BusinessClass("Business Class","Pakistan","Netherlands","9 Nov, 21",1,300000);
        ExecutiveClass Pak_Net3 = new ExecutiveClass("Executive Class","Pakistan","Netherlands","2 Oct, 21",1,350000);


        EconomyClass Pak_UAE1 = new EconomyClass("Economy Class","Pakistan","Dubai","8 Oct, 21",10,250000);
        BusinessClass Pak_UAE2 = new BusinessClass("Business Class","Pakistan","Dubai","29 Nov, 21",10,300000);
        ExecutiveClass Pak_UAE3 = new ExecutiveClass("Executive Class","Pakistan","Dubai","30 Oct, 21",10,350000);


        String Name, gender, address = null, flag = "True", origin = null, destination = null, rem, input, em, pass, flag2 = "False";
        int age = 0, passport = 0, opt, card, seat=0;
        char a = 0;
        char b = 0;
        char c = 0;
        char d = 0;
        char e = 0;
        int country = 0;
        int y = 0;
        int flight;
        String flightType = null;


        System.out.println("Welcome to Flight Reservation!!!");
        System.out.println("Please Select Your Destination From The Following Countries: ");
        System.out.println("1) Germany");
        System.out.println("2) Netherlands");
        System.out.println("3) Dubai");

        opt = sc.nextInt();

        if (country == 1) {
            destination = "Germany";
        }
        if (country == 2) {
            destination = "Netherlands";
        }
        if (country == 3) {
            destination = "Dubai";
        }


        System.out.println("Select Flight Type:");
        {
            flightType = Select_Flight_Type();
        }

        System.out.println("Ticket Prices:");
        {
            Check_Prices();
        }

        System.out.println("Enter your Details:");

        System.out.println("Enter your Name:");
        Name = sc.nextLine();
        Name = sc.nextLine();

        System.out.println("Enter your Gender:");
        gender = sc.nextLine();

        System.out.println("Enter your Age:");
        age = sc.nextInt();


        System.out.println("Enter your Origin:");
        origin = sc.nextLine();
        origin = sc.nextLine();

        System.out.println("Enter your Address:");
        address = sc.nextLine();

        System.out.println("Confirm Destination:");
        destination = sc.nextLine();


        System.out.println("Enter your Passport Number:");
        passport = sc.nextInt();


        Customer c4 = new Customer(4, Name, gender, age, address, passport);
        //Code to write in a File
        System.out.println("Please Enter a number from 1-100 to confirm your seat number");
        try{
            seat = sc.nextInt();
            if(seat >100)
                throw new WrongSeatException ("Wrong Seat");
        }catch (WrongSeatException E)
        {
            System.out.println(E);
            System.exit(1);
        }

        int ret;
        System.out.println("Enter Your Card pin");
        card = sc.nextInt();
        String ticket = "\0";
        ticket = "E" + seat;
        try {
            FileWriter filewriter = new FileWriter("filename.txt");
            filewriter.write("Name: " + Name + "\n");
            filewriter.write("Gender: " + gender + "\n");
            String ticketNo = "PK765";
            filewriter.write("Ticket No: " + ticketNo + "\n");
            filewriter.write("Flight Type: " + flightType + "\n");
            filewriter.write("Source: " + origin + "\n");
            filewriter.write("Address: " + address + "\n");
            filewriter.write("Destination: " + destination + "\n");
            filewriter.write("Seat No: " + seat);
            filewriter.close();
        } catch (IOException E) {
            System.out.println("Unable to create file.");
            E.printStackTrace();
        }

        System.out.println("Ticket Booked");
        System.out.println("**********************************************************************");


        System.out.println("Press 1 to Cancel Your Flight");
        System.out.println("Press 2 to Exit");
        System.out.println("Enter Option");
        opt = sc.nextInt();

        if (opt == 1) {
            System.out.println("Which Flight Type Were You On?");
            System.out.println("Press 1 for Economy Class");
            System.out.println("Press 2 for Business Class");
            System.out.println("Press 3 for Executive Class");
            System.out.println("Enter Option");
            opt = sc.nextInt();

            System.out.println("Where was your destination? ");
            System.out.println("1) Germany");
            System.out.println("2) Netherlands");
            System.out.println("3) Dubai");
            country = sc.nextInt();

            if (country == 1 && flightType == "Economy Class"){
                Pak_Ger1.CancelFlight(Name);
                System.out.println("Flight cancelled");
            }
            if (country == 1 && flightType == "Business Class") Pak_Ger2.CancelFlight(Name);
            {
                Pak_Ger2.CancelFlight(Name);
                System.out.println("Flight cancelled");
            }
            if (country == 1 && flightType == "Executive Class") {
                Pak_Ger3.CancelFlight(Name);
                System.out.println("Flight cancelled");
            }

            if (country == 2 && flightType == "Economy Class") {
                Pak_Net1.CancelFlight(Name);
                System.out.println("Flight cancelled");
            }
            if (country == 2 && flightType == "Business Class")
            {
                Pak_Net2.CancelFlight(Name);
                System.out.println("Flight cancelled");
            }
            if (country == 2 && flightType == "Executive Class") {
                Pak_Net3.CancelFlight(Name);
                System.out.println("Flight cancelled");
            }

            if (country == 3 && flightType == "Economy Class") {
                Pak_UAE1.CancelFlight(Name);
                System.out.println("Flight cancelled");
            }
            if (country == 3 && flightType == "Business Class") {
                Pak_UAE2.CancelFlight(Name);
                System.out.println("Flight cancelled");
            }
            if (country == 3 && flightType == "Executive Class") {
                Pak_UAE3.CancelFlight(Name);
                System.out.println("Flight cancelled");
            }

        }
        if (opt == 2)
        {
            System.out.println("Exit");
        }
    }

    private static String Select_Flight_Type() {
        System.out.println("Please Select Your Flight Type:");
        System.out.println("Press 1 for Economy Class");
        System.out.println("Press 2 for Business Class");
        System.out.println("Press 3 for Executive Class");

        Scanner sc = new Scanner(System.in);
        int flight = sc.nextInt();
        String flightType = null;
        if (flight == 1)
            flightType = "Economy Class";


        if (flight == 2)
            flightType = "Business Class";


        if (flight == 3)
            flightType = "Executive Class";

        return flightType;
    }

    private static void Check_Prices() {
        String destination = null;

        double Gprice = 500.50;

        double GBprice = 1000.50;

        double GEprice = 1500.50;

        double Nprice = 550.50;

        double NBprice = 1000.50;

        double NEprice = 2000.50;

        double Dprice = 120.50;

        double DBprice = 300.50;

        double DEprice = 500.50;

        System.out.println("The ticket price for economy class Ticket to Germany is:" + Gprice);
        System.out.println("The ticket price for business class Ticket to Germany is:" + GBprice);
        System.out.println("The ticket price for executive class Ticket to Germany is:" + GEprice);

        System.out.println("The ticket price for economy class Ticket to Netherlands is:" + Nprice);
        System.out.println("The ticket price for business class Ticket to Netherlands is:" + NBprice);
        System.out.println("The ticket price for executive class Ticket to Netherlands is:" + NEprice);

        System.out.println("The ticket price for economy class Ticket to Dubai is:" + Dprice);
        System.out.println("The ticket price for business class Ticket to Dubai is:" + DBprice);
        System.out.println("The ticket price for executive class Ticket to Dubai is:" + DEprice);
    }
}
