package info.krogulec.selectedjavaapiclasses;

import java.util.ArrayList;

public class ArrayListClass {

    public static void main(String[] args) {

        //Można przekazać inicjalną pojemność wewnętrznej tablicy - domyślnie jest to 10
        ArrayList<String> strings = new ArrayList<>(20);
        strings.add("One");
        strings.add("Two");
        strings.add("Three");
        strings.add("Four");
        strings.add("Five");
        strings.add("Six");
        strings.add("Seven");

        //iterowanie
        //TODO Napisać pętle, które przejdą przez wszystkie elementy tej tablicy - for, foreach, while, do-while

        //modyfikacja
        //add dodaje element na końcu
        strings.add("Eight");

        //set pozwala na modyfikacje elementu
        strings.set(0, "One moded");

        strings.remove("One");
        strings.remove(0);

        //TODO Do napisania próba usunięcia z kolekcji Integerów

        //modyfikacja referencji
        Instrument guitar = new Instrument("guitar");
        Instrument violin = new Instrument("violin");

        ArrayList<Instrument> instruments = new ArrayList<>();
        instruments.add(guitar);
        instruments.add(violin);

        ArrayList<Instrument> instruments2 = new ArrayList<>();
        instruments2.add(guitar);
        instruments2.add(violin);

        guitar.name = "guitar mod";

        //Trzeba mieć świadomość, że w listach są trzymane referencje - jeśli zmodyfikujemy referencję to będzie to globalne
        System.out.println(instruments);
        System.out.println(instruments2);
    }
}

class Instrument{
    public String name;

    public Instrument(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Instrument{" +
                "name='" + name + '\'' +
                '}';
    }
}