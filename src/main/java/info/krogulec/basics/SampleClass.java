//nazwa pakietu - nie musi jej być, choć w realnych projektach zawsze jest
package info.krogulec.basics;

//importy muszą być po pakietach, jeśli występują - nie są obowiązkowe
import java.io.Serializable;
import java.lang.String;
import java.util.ArrayList;
import java.util.Collection;
import java.util.*;

//importy statyczne zaczynają się od import static (nie może być static import)
//mogą być wymieszane ze zwykłymi importami
import static java.math.BigDecimal.ROUND_CEILING;


//modyfikatory dostępu: public, default - nie pisze się go, private
//słowo kluczowe class
//nazwa klasy PascalCase
//opcjonalne oznaczenie klasy rozszerzanej oraz implementowanych interfejsów, oddzielnonych przecinkami
//Nawiasy curly
public class SampleClass extends ArrayList implements Serializable, Collection {

    //klasa może być pusta - nie jest konieczne umieszczenie w niej czegokolwiek
}

//Nazwa klasy może się zaczynać od $ lub _
class $ {}