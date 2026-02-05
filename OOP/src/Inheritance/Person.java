package Inheritance;
import java.time.LocalDate;
public abstract class Person {
    private int personID;
    private String firstName;
    private String lastName;
    private char gender;
    private LocalDate dateOfbirth;
    private String phoneNumber;
    private String address;

    public Person(int personID, String firstName, String lastName, char gender, LocalDate dateOfbirth, String phoneNumber, String address) {
        this.personID = personID;
        this.firstName = firstName;
        this.lastName = lastName;
        this.gender = gender;
        this.dateOfbirth = dateOfbirth;
        this.phoneNumber = phoneNumber;
        this.address = address;
    }

    public int getPersonID() {
        return personID;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public char getGender() {
        return gender;
    }

    public LocalDate getDateOfbirth() {
        return dateOfbirth;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public String getAddress() {
        return address;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }

    public void setDateOfbirth(LocalDate dateOfbirth) {
        this.dateOfbirth = dateOfbirth;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public void setAddress(String address) {
        this.address = address;
    }
    
    abstract public String displayInfo();
    
    
}
