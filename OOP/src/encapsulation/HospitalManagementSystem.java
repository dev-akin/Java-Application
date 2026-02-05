
package encapsulation;

import java.time.LocalDate;
public class HospitalManagementSystem {
    public static void main(String[] args){
        Patient patient1 = new Patient(1, "John", "Tom", "Maleria", 'M',
        LocalDate.parse("1990-08-12"),
          "080234456789","No 1 amadi Street port harcourt");
        System.out.println(patient1.displayInfo());
        
        Doctor doctor = new Doctor(1, "John", "Tom",  'M',
        LocalDate.parse("1990-08-12"),
         "080234456789","No 1 amadi Street port harcourt", "Optician");
        System.out.println(doctor.displayInfo());
    }
}
