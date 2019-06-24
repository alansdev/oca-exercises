package info.krogulec.types;

import info.krogulec.Utils;

public class Operators {

    public static void main(String[] args) {
        Utils.breakingParts("Operatory prypisania");
        assignmentOperators();

        Utils.breakingParts("Operatory arytmetyczne");
        arithmeticOperators();

        Utils.breakingParts("Operatory porównania");
        relationalOperatosrs();

        Utils.breakingParts("Operatory logiczne");
        logicalOperators();

        Utils.breakingParts("Małe ćwiczenie");
        littleExcercise();


    }

    private static void littleExcercise() {
        int a = 10;

        a = a++ + a + a-- - a-- + ++a;
        System.out.println(a);
    }

    private static void logicalOperators() {
        int a = 1;
        int b = 2;

        System.out.println("a = " + a + " b = " + b);

        System.out.println("false || true : " + (false || true));
        System.out.println("false && true : " + (false && true));
        System.out.println("!false : " + (!false));

        //short circuit
        boolean bool = a == b && a++ != b;
        System.out.println("Zmienna a po wyrażeniu: a == b && a++ != b : " + a);

        //not short circuit
        boolean bool2 = a == b & a++ != b;
        System.out.println("Zmienna a po wyrażeniu: a == b && a++ != b : " + a);
    }

    private static void relationalOperatosrs() {
        int a = 1;
        int b = 2;

        System.out.println("a = " + a + " b = " + b);

        System.out.println("a == b : " + (a == b));
        System.out.println("a <= b : " + (a <= b));
        System.out.println("a >= b : " + (a >= b));
        System.out.println("a > b : " + (a > b));
        System.out.println("a < b : " + (a < b));
        System.out.println("a != b : " + (a != b));
    }

    private static void assignmentOperators() {
        int a = 1;
        int b = 2;

        System.out.println("a = " + a + " b = " + b);

        System.out.println("a = b : " + (a = b));

        a = 1;
        b = 2;

        System.out.println("a += b : " + (a += b));

        a = 1;
        b = 2;

        System.out.println("a -= b : " + (a -= b));

        a = 1;
        b = 2;

        System.out.println("a *= b : " + (a *= b));

        a = 1;
        b = 2;

        // Tu warto zwrócić uwagę na wynik dzielenia dwóch intów - został zaokrąglony do zera
        System.out.println("a /= b : " + (a /= b));

        //typ wynikowy jest brany z pierwszej zmiennej
        double c = 3.12;
        int d = 4;

        System.out.println(c*=d);


    }

    private static void arithmeticOperators() {
        int a = 1;
        int b = 2;

        System.out.println("a = " + a + " b = " + b);

        System.out.println("a + b : " + (a + b));

        a = 1;
        b = 2;

        System.out.println("a - b : " + (a - b));

        a = 1;
        b = 2;

        System.out.println("a * b : " + (a * b));

        a = 1;
        b = 2;

        System.out.println("a / b : " + (a / b));

        a = 1;
        b = 2;

        // W szczególności warto zrócić uwagę na poniższe pięć operatorów
        System.out.println("a % b : " + (a % b));

        a = 1;

        System.out.println("a++ : " + (a++));

        a = 1;

        System.out.println("a-- : " + (a--));

        a = 1;

        System.out.println("++a : " + (++a));

        a = 1;

        System.out.println("--a : " + (--a));
    }

}
