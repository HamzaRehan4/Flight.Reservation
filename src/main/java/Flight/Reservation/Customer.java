package Flight.Reservation;

public class Customer {
    //private String date;
    private int id;
    private String name;
    private String gender;
    private int age;
    private String address;
    private int passport;


    //Constructor
    public Customer(int i,String n, String gen, int a, String add, int pass) {
        //date = d;
        id = i;
        name = n;
        gender = gen;
        age = a;
        address = add;
        passport = pass;

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getPassport() {
        return passport;
    }

    public void setPassport(int passport) {
        this.passport = passport;
    }

}
