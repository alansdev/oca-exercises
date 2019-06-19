package info.krogulec.selectedjavaapiclasses;

import info.krogulec.Utils;

public class Strings {
}

class StringMethods{
    public static void main(String[] args) {
        String java = "JAVA";


        System.out.println(java.charAt(0));
        System.out.println(java.indexOf("G")); //jeśli czegoś nie znaleziono dostajemy -1
        System.out.println(java.substring(1)); //od wskazanego znaku do końca
        System.out.println(java.substring(1,3)); //trzeba pamiętać, że zawsze początek jest uwzględniony, a koniec nie
        System.out.println(java.trim()); //obcina spacie z początku i końca
        System.out.println(java.length()); //długość - sługość tablicy char [], która wewnętrznie przechowuje składniki pola
        System.out.println(java.startsWith("J"));
        System.out.println(java.endsWith("J"));

        //Warto zwrócić uwagę, że wyjściowa zmienna się nie zmieniła
        System.out.println(java);
    }
}

/**
 * Ile obiektów jest tworzonych? Jak porównywać stringi?
 */
class CountingObjects{
    public static void main(String[] args) {
        String dog = new String("dog"); //tworzy się obiekt w puli
        String dog2 = "dog"; //nie jest tworzony nowy obiket - jest zabierany z publi
        String dog3 = "dog";
        String dog4 = new String("dog");
        String dog5 = String.valueOf("dog");

        Utils.breakingParts("Porównanie po equals");
        System.out.println("ddog.equals(dog2): " + dog.equals(dog2));
        System.out.println("dog2.equals(dog3): " + dog2.equals(dog3));
        System.out.println("dog3.equals(dog4): " + dog3.equals(dog4));
        System.out.println("dog.equals(dog4): " + dog.equals(dog4));
        System.out.println("dog3.equals(dog5): " + dog3.equals(dog5));

        Utils.breakingParts("Porównanie po == (czy to ten sam obiekt)");
        System.out.println("dog == dog2: " + (dog == dog2));
        System.out.println("dog == dog3: " + (dog == dog3));
        System.out.println("dog == dog4: " + (dog == dog4));
        System.out.println("dog2 == dog3: " + (dog2 == dog3));
        System.out.println("dog3 == dog5: " + (dog3 == dog5));
    }
}
