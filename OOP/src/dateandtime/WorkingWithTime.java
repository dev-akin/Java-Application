package dateandtime;

import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class WorkingWithTime {
    public static void main(String[] args) {

        LocalTime now = LocalTime.now();
        LocalTime myTime = LocalTime.of(14, 30, 45);

        System.out.printf("%s%n", now);
        System.out.printf("%s%n", myTime);

        // Getting time components
        System.out.println(now.getHour());
        System.out.println(now.getMinute());
        System.out.println(now.getSecond());

        // Compare two times
        System.out.println(now.isBefore(myTime));
        System.out.println(now.isAfter(myTime));

        // Manipulating time
        System.out.println(now.plusHours(4));
        System.out.println(now.minusMinutes(20));

        // Formatting time
        DateTimeFormatter myFormat = DateTimeFormatter.ofPattern("HH:mm:ss");
        String formattedTime = now.format(myFormat);

        System.out.println(formattedTime);
    }
}
