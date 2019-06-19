package info.krogulec.selectedjavaapiclasses;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

/**
 * Formaty obowiązujące na egzaminie
 */
public class DateFormatters {

    public static void main(String[] args) {

        LocalDate ld = LocalDate.now();
        System.out.println("BASIC_ISO_DATE: " + ld.format(DateTimeFormatter.BASIC_ISO_DATE));
        System.out.println("ISO_DATE: " + ld.format(DateTimeFormatter.ISO_DATE));
        System.out.println("ISO_LOCAL_DATE: " + ld.format(DateTimeFormatter.ISO_LOCAL_DATE));

        LocalTime lt = LocalTime.now();

        System.out.println("ISO_TIME: " + lt.format(DateTimeFormatter.ISO_TIME));
        System.out.println("ISO_LOCAL_TIME: " + lt.format(DateTimeFormatter.ISO_LOCAL_TIME));

        LocalDateTime ldt = LocalDateTime.now();

        System.out.println("BASIC_ISO_DATE: " + ldt.format(DateTimeFormatter.BASIC_ISO_DATE));
        System.out.println("ISO_DATE: " + ldt.format(DateTimeFormatter.ISO_DATE));
        System.out.println("ISO_LOCAL_DATE: " + ldt.format(DateTimeFormatter.ISO_LOCAL_DATE));
        System.out.println("ISO_TIME: " + ldt.format(DateTimeFormatter.ISO_TIME));
        System.out.println("ISO_LOCAL_TIME: " + ldt.format(DateTimeFormatter.ISO_LOCAL_TIME));
        System.out.println("ISO_LOCAL_DATE_TIME: " + ldt.format(DateTimeFormatter.ISO_LOCAL_DATE_TIME));
        System.out.println("ISO_DATE_TIME: " + ldt.format(DateTimeFormatter.ISO_DATE_TIME));

        DateTimeFormatter isoDate = DateTimeFormatter.ISO_DATE;
        System.out.println("Metoda format na obiekcie formattera: " + isoDate.format(ld));

        //TODO Jakie wyjątki mogą wystąpić?

    }
}
