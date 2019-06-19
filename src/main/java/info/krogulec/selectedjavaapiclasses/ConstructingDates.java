package info.krogulec.selectedjavaapiclasses;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;
import java.time.temporal.TemporalAccessor;

public class ConstructingDates {

    public static void main(String[] args) {

        //Nie można użyć new LocalDate(...) - tylko statyczne metody fabrykujące
        LocalDate evacuationDay = LocalDate.of(2019,06,18);
        LocalDate today = LocalDate.now();
        LocalDate slayerDay = LocalDate.parse("2019-06-06");
        LocalDate evacuationDay2 = LocalDate.of(2019,Month.JUNE,18); //można korzystać z enuma dla miesięcy

        //Próba wpisania nieprawidłowego parametru skutkuje wyjątkiem
        //LocalDate badDay = LocalDate.of(19, 01, 44);

        LocalTime onePm = LocalTime.of(13,00);
        LocalTime now = LocalTime.now();
        LocalTime oneAm = LocalTime.parse("01:00:00"); //musi być taki format przy parsowaniu bez formattera

        //Będzie wyjątek w przypadku błędnego formatu
        LocalTime notValid = LocalTime.parse("not valid");

        //Można wykorzystać datę i czas
        LocalDateTime ldt1 = LocalDateTime.of(evacuationDay, oneAm);

        //Można po kolei wpisywać składniki (tak, jakbyśmy połączyli medtody fabrykujące LocalDate i LocalTime)
        LocalDateTime ldt2 = LocalDateTime.of(2019, Month.AUGUST, 13, 12, 15);

        LocalDateTime ldt3 = LocalDateTime.now();


    }
}
