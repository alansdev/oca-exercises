package info.krogulec.basics;

//import nie importuje całego drzewa
import java.math.BigDecimal;
import java.math.BigInteger;
import java.time.LocalDateTime;
import static java.math.BigDecimal.*; //koeljność static/non static jest nieistotna
import java.util.*; //importuje wszystkie klasy z danego pakietu
import static java.math.BigInteger.ONE; //import pojedynczej stałej


public class Imports {

    private LocalDateTime someDate;
    private java.time.LocalDateTime someOtherDate;
    private List<String> someList;
    private Collection<String> someCollection;

    private BigInteger someBI = ONE;
    private BigInteger someOtherBI = BigInteger.TEN;
    private BigInteger someOtherNextBI = BigInteger.ONE;

    private BigDecimal someBD = TEN;



}
