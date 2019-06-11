package info.krogulec.types;

import info.krogulec.Utils;

public class WrapperClasses {

    private Character aChar; //inna nazwa niż primitive
    private Byte aByte;
    private Short aShort;
    private Integer anInt; //inna nazwa niż primitive
    private Long aLong;
    private Float aFloat;
    private Double aDouble;
    private Boolean aBoolean;


    public static void main(String[] args) {
        Utils.breakingParts("Wrappers init values");
        wrappersInitValues();

        Utils.breakingParts("Autoboxing");
        autoboxing();

        Utils.breakingParts("Using wrappers constructors");
        wrappersConstructors();

        Utils.breakingParts("Static parsing method");
        parsingMethods();
    }

    /**
     * Wszystkie klasy wrapperów mają metody parsujące stringa oprócz Character - podobnie jak w przypaku konstruktowa
     */
    private static void parsingMethods() {
        Byte.parseByte("1");
        Short.parseShort("1");
        Integer.parseInt("12");
        Long.parseLong("12");
        Float.parseFloat("12");
        Double.parseDouble("12");
        Boolean.parseBoolean("true");

    }

    /**
     * Wszystkie klasy wrapperów oprócz Character mają konstruktor z parametrem String
     */
    private static void wrappersConstructors() {
        //jedyny wrapper, który nie ma w parametrze konstruktora Stringa
        Character c = new Character('C');

        //nie skompiluje się
        //Character d = new Character("D");

        Byte b = new Byte("222");
        Short s = new Short("1");
        Integer i = new Integer("12");
        Long l = new Long("12");
        Float f = new Float("12");
        Double d = new Double("12");
        Boolean bool = new Boolean("true");
    }

    private static void autoboxing() {
        WrapperClasses wrapperClasses = new WrapperClasses();
        wrapperClasses.aChar = 'A';
        wrapperClasses.aDouble = 10.9;

        //nie skompiluje się - nie jest możliwy "podwójny skok"
        //wrapperClasses.aDouble = 10;

        wrapperClasses.aByte = 111;
        wrapperClasses.aShort = 1234;
        wrapperClasses.anInt = 312;
        wrapperClasses.aLong = 222L;

        //nie skompiluje się - nie jest możliwy "podwójny skok"
        //wrapperClasses.aLong = 222;

        wrapperClasses.aFloat = 12.2f;

        //nie skompiluje się - nie jest możliwy "podwójny skok"
        //wrapperClasses.aFloat = 12;
        //wrapperClasses.aFloat = 12.2;

        wrapperClasses.aBoolean = true;
    }

    private static void wrappersInitValues() {
        WrapperClasses wrapperClasses = new WrapperClasses();

        //Pokazujemy jaką wartość bazową przyjmują
        System.out.println("Character initial value: " + wrapperClasses.aChar);
        System.out.println("Byte initial value: " + wrapperClasses.aByte);
        System.out.println("Short initial value: " + wrapperClasses.aShort);
        System.out.println("Integer initial value: " + wrapperClasses.anInt);
        System.out.println("Long initial value: " + wrapperClasses.aLong);
        System.out.println("Float initial value: " + wrapperClasses.aFloat);
        System.out.println("Double initial value: " + wrapperClasses.aDouble);
        System.out.println("Boolean initial value: " + wrapperClasses.aBoolean);
    }
}
