
package encapsulation;

import Inheritance.Person;
import java.time.LocalDate;


public class Doctor extends Person{
   
    private String specialty;

    public Doctor(int personID, String firstName, String lastName, char gender, LocalDate dateOfbirth, String phoneNumber, String address, String specialty) {
        super(personID, firstName, lastName, gender, dateOfbirth, phoneNumber, address);
        this.specialty = specialty;
    }
    
    
    @Override
    public String displayInfo(){
        return String.format (
                "============= Doctor Information ==============\n" +
                "Patient ID:        %d%n" +
                "First Name:        %s%n" +
                "Last Name:         %s%n" +
                "Gender:            %c%n" +
                "Date Of Birth:     %s%n" +
                "Phone Number:      %s%n" +
                "Address:           %s%n" +
                "Specialty:         %s%n" +
                "=================================================",
                getPersonID(), getFirstName(),getLastName(), getGender(), getDateOfbirth(),
                getPhoneNumber(),getAddress(), specialty
                
        );
               
    }
}
