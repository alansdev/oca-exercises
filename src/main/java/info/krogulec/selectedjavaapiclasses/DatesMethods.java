package info.krogulec.selectedjavaapiclasses;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.temporal.ChronoUnit;

public class DatesMethods {
    public static void main(String[] args) {
        LocalDate now = LocalDate.now();
        LocalDate twelveDaysFromNow = now.plusDays(12);

        //Trzeba pamiętać, że klasy java.time LcoalDate, ... - są immutable - zachowują się podobnie jak String
        System.out.println("now: " + now + " twelveDaysFromNow: " + twelveDaysFromNow);

        LocalTime nowLt = LocalTime.now();
        LocalTime nowLtMinusTwoHours = nowLt.minusHours(2);

        System.out.println("nowLt: " + nowLt + " nowLtMinusTwoHours: " + nowLtMinusTwoHours);

        LocalDateTime localDateTime = LocalDateTime.now();
        LocalDateTime localDateTimeWith11 = localDateTime.withHour(11);

        System.out.println("localDateTime: " + localDateTime + " localDateTimeWith11: " + localDateTimeWith11);

    }
}
