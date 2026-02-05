package encapsulation;

import Inheritance.Person;   
import java.time.LocalDate;

public class Patient extends Person{

    String illness;
    
    public Patient(int personID, String firstName, String lastName,String illness, char gender, LocalDate dateOfbirth, String phoneNumber, String address) {
        super(personID, firstName, lastName, gender, dateOfbirth, phoneNumber, address);
        this.illness = illness;
    }
    
   
    
    @Override
    public String displayInfo(){
        return String.format (
                "============= Patient Information ==============\n" +
                "Patient ID:        %d%n" +
                "First Name:        %s%n" +
                "Last Name:         %s%n" +
                "Illness            %s%n" +
                "Gender:            %c%n" +
                "Date Of Birth:     %s%n" +
                "Phone Number:      %s%n" +
                "Address:           %s%n" +
                "=================================================",
                getPersonID(), getFirstName(),getLastName(),illness, getGender(),getDateOfbirth(),
                getPhoneNumber(),getAddress()
                
        );
               
    }
    
    
}
