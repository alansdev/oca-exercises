package info.krogulec.types;

import info.krogulec.Utils;

public class Primitives {

    //Wszystkie typy prymitywne
    private char aChar;
    private byte aByte;
    private short aShort;
    private int anInt;
    private long aLong;
    private float aFloat;
    private double aDouble;
    private boolean aBoolean;

    public static void main(String[] args) {
        Utils.breakingParts("Primitives init values");
        primitivesInitValues();

        Utils.breakingParts("Primitives min/max values");
        minMaxValues();

        Utils.breakingParts("Underscore in digots");
        underscore();

        Utils.breakingParts("Initialization of primitive numbers");
        primitiveNumbersInitialization();

        Utils.breakingParts("Characters");
        characters();

        Utils.breakingParts("Valid identifiers");
        validIdentifiers();

    }

    private static void validIdentifiers() {
        //zaczynają się literą lub znakami waluty lub _ i nie mają ograniczeń długości
        long _l = 123L;
        char $l = 2;
        double d = 1;
        float F = 3;
        boolean brakOgraniczenDlugosci = true;
        int s2d = 222;

        //poniższe się nie skompilują
//        long #l = 123;
//        char e!e = 88;
//        float 1l = 23;
//        boolean boolean = false;
    }

    private static void characters() {
        char c = 'c';

        //nie skompiluje się - "" inicjalizują String
        //char c2 = "c2";

        //poprawny sposób inicjalizacji
        char cAlt = 67;
        char cAlt2 = 99;

        //nie skompiluje się
        //char charMinus = -120;

        char charMinus2 = (char) -65;

        System.out.println("c: " + c);
        System.out.println("cAlt (67): " + cAlt);
        System.out.println("cAlt (99): " + cAlt2);
        System.out.println("ccharMinus2 (-65): " + charMinus2);

    }

    private static void primitiveNumbersInitialization() {
        double d = 123d;
        double d2 = 123D;
        float f = 123f;
        float f2 = 123F;

        System.out.println("d: " + d);
        System.out.println("d2: " + d2);
        System.out.println("f: " + f);
        System.out.println("f2: " + f2);

    }

    /**
     * Trzeba umieć określić, gdzie może się znaleźć podkreślik
     */
    private static void underscore() {
        System.out.println(123_000);
        System.out.println(0x2_23);
        System.out.println(0b10_00_1);

        //nie skompilują się
//        System.out.println(0x_99);
//        System.out.println(0b_00);
//        System.out.println(0b00_);
//        System.out.println(123_000_);
    }

    private static void minMaxValues() {
        byte byteMaxValue = Byte.MAX_VALUE;
        byte byteMinValue = Byte.MIN_VALUE;
        short shortMaxValue = Short.MAX_VALUE;
        short shortMinValue = Short.MIN_VALUE;
        int intMaxValue = Integer.MAX_VALUE;
        int intMinValue = Integer.MIN_VALUE;
        long longMaxValue = Long.MAX_VALUE;
        long longMinValue = Long.MIN_VALUE;

        System.out.println("byteMaxValue" + byteMaxValue);
        System.out.println("byteMinValue" + byteMinValue);
        System.out.println("shortMaxValue" + shortMaxValue);
        System.out.println("shortMinValue" + shortMinValue);
        System.out.println("intMaxValue" + intMaxValue);
        System.out.println("intMinValue" + intMinValue);
        System.out.println("longMaxValue" + longMaxValue);
        System.out.println("longMinValue" + longMinValue);
    }

    private static void primitivesInitValues() {
        Primitives primitives = new Primitives();

        //Pokazujemy jaką wartość bazową przyjmują
        System.out.println("char initial value: " + primitives.aChar);
        System.out.println("byte initial value: " + primitives.aByte);
        System.out.println("short initial value: " + primitives.aShort);
        System.out.println("int initial value: " + primitives.anInt);
        System.out.println("long initial value: " + primitives.aLong);
        System.out.println("float initial value: " + primitives.aFloat);
        System.out.println("double initial value: " + primitives.aDouble);
        System.out.println("boolean initial value: " + primitives.aBoolean);
    }
}
