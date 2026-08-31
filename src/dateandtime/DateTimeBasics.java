package dateandtime;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class DateTimeBasics {
    public static void main(String[] args) {
        LocalDate date = LocalDate.of(2026, 8, 31);
        LocalDateTime dateTime = LocalDateTime.of(2026, 8, 31, 18, 30);

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");
        System.out.println(date.format(formatter));
        System.out.println(dateTime);
    }
}
// Interview trap: java.time classes are immutable and thread-safe; avoid legacy Date/Calendar for new code when possible.
