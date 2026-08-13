
public class Person {
    private int personID;
    private static int counter = 1;
    private String name;
    private String nationalID;
    private String phone;

    public Person(String name, String nationalID, String phone) {
        this.name = name;
        this.nationalID = nationalID;
        this.phone = phone;
        this.personID = counter++;
    }

    public Person() {
        this("Unknown", "000", "000");
    }

    public Person(String name) {
        this(name, "000", "000");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNationalID() {
        return nationalID;
    }

    public void setNationalID(String nationalID) {
        this.nationalID = nationalID;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public int getPersonID() {
        return personID;
    }

    public void displayInfo() {
        System.out.println("ID: " + personID + "\nName: " + name + "\nNational ID: " + nationalID + "\nPhone: " + phone);
    }
}
