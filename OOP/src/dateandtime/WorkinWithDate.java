
package dateandtime;

import java.time.LocalDate; 
import java.time.format.DateTimeFormatter;
        
public class WorkinWithDate {
    public static void main(String[] args){
        LocalDate today = LocalDate.now();
        LocalDate myDate = LocalDate.of(2025, 8, 19);
        System.out.printf("%s%n",today);
        System.out.printf("%s%n",myDate);
        
        
        System.out.println(today.getYear());
        System.out.println(today.getMonth());
        System.out.println(today.getMonthValue());
        System.out.println(today.getDayOfMonth());
        
        //cmpare two dates
        System.out.println(today.isBefore(myDate));
        System.out.println(today.isAfter(myDate));
         
        System.out.println(today.plusMonths(4));
        System.out.println(today.minusYears(2));
        
        System.out.println(myDate.isLeapYear());
        
        DateTimeFormatter myFormat = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        //Displaing the formatted date
         String formattedDate = today.format(myFormat);
         
         System.out.println(formattedDate);
        
        
    }
}
