package info.krogulec.types;

public class Assignments {

    public static void main(String[] args) {
         char aChar = 'A';
         byte aByte = 120;
         short aShort= 1000;
         int anInt = 12344;
         long aLong = 12131234;
         float aFloat = 123f;
         double aDouble = 3333.00d;

         //przypisanie węższego typu do szerszego jest dozwolone
        aShort = aByte;
        anInt = aShort;
        aLong = anInt;
        aDouble = aFloat;
        aDouble = anInt;
        aFloat = anInt;
        aFloat = aLong;
        aDouble = aLong;

        //odwrotne przypisanie tylko po castowaniu - ryzyko utraty danych
        aShort = (short)anInt;
        anInt = (int) aDouble;
    }
}
