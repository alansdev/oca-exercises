package info.krogulec.fieldsmethodsencapsulation;

import info.krogulec.Utils;

public class Scope {

    //pole klasy
    private String name;

    //pole statyczne - wszystkie obiekty klasy dzielą jego stan
    private static int legCount;

    public static void main(String[] args) {

        Utils.breakingParts("Zmienne lokalne");
        localVariables();

        Utils.breakingParts("Wykonanie statycznej metody");
        someStaticMethod();

        //TODO jak się dostać do niestatycznej metody z poziomu metody statycznej?
    }

    /**
     * Można również zasłaniać pola w argumencie do metody - ma podobne skutki jak robienie tego w ciele metody
     *
     * @param name - parametr nie mający związku z polem, oprócz tego, że się tak samo nazywa
     * @param legCount - parametr nie mający związku z polem, oprócz tego, że się tak samo nazywa
     */
    private void hidingInMethodParam(String name, int legCount){

    }

    /**
     * W metodach można stosować zmienne o takiej nazwie jak zmienne w klasie (nie jest to dobra praktyka)
     */
    private void hidingFields() {
        String name = "Jacek";

        //Statyczne pola można tylko tworzyć na poziomie klasy - w metodzie można stworzyć zmienną niestatyczną o takiej nazwie jak statyczne pole
        int legCount = 2;

        System.out.println("Przesłonięta wartość pola: " + name);
        System.out.println("Wartość pola klasy: " + this.name);
    }

    /**
     * Życie zmiennych lokalnych kończy się wraz z nawiasem curly
     */
    private static void localVariables() {
        //Zmienna lokalna
        int localField = 3;

        //TODO Czy można zostawić zmienną lokalną bez inicjalizacji?
        int anotherLocalField;

        localField = 5;

        if (localField == 5){
            String out = "Zmienna out dożyje do końca konstrukcji if - najbliższy zamykający nawias curly";
            System.out.println(out);
        } else {
            //TODO Czy tutaj będzie dostęp do zmiennej out
        }

        //TODO Czy tutaj będzie dostęp do zmiennej out

    }

    /**
     * Metoda statyczna ma dostęp do wszystkich pól/ metod statycznych w klasie
     */
    private static void someStaticMethod() {
        System.out.println("mam dostęp jako static do: " + legCount);

        //co się wydarzy?
        //name = "Jan";

        //TODO Czy będzie tutaj dostęp do localField z metody main?
    }

    /**
     * Metoda nie statyczna ma dostęp do pól/ metod statycznych oraz nie statycznych
     */
    private void nonStaticMethod(){
        name = "Marek";
        System.out.println("Nie statyczna metoda ma również dostęp do statycznych pól: " + legCount);
        System.out.println("Nie statyczna metoda ma też dostęp do statycznych metod: ");
        someStaticMethod();
    }
}
