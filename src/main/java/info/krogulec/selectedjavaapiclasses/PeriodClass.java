package info.krogulec.selectedjavaapiclasses;

import java.time.LocalDate;
import java.time.Period;

public class PeriodClass {

    public static void main(String[] args) {
        Period minus15 = Period.ofDays(-15);
        LocalDate localDate = LocalDate.now().plus(minus15);

        System.out.println(localDate);

        Period monthFifteen = Period.of(0, 1, 15);
        //poniższe nie jest rozbijane na miesiąc i dzień
        Period fourtyFiveDays = Period.ofDays(45);

        System.out.println(monthFifteen);
        System.out.println(fourtyFiveDays);

        //Period nie przelicza jednostek
        Period sum = monthFifteen.plus(fourtyFiveDays);
        System.out.println(sum);


    }
}
