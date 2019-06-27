package info.krogulec.selectedjavaapiclasses;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class ArrayListClass {

    public static void main(String[] args) {

        //Można przekazać inicjalną pojemność wewnętrznej tablicy - domyślnie jest to 10
        List<String> strings = new ArrayList<>(20);
        strings.add("One");
        strings.add("Two");
        strings.add("Three");
        strings.add("Four");
        strings.add("Five");
        strings.add("Six");
        strings.add("Seven");

        boolean b = strings.removeIf(s -> s.startsWith("F"));

        strings.replaceAll(s -> s.toLowerCase());

        System.out.println("To lower case: " + strings);

        List<String> f = strings.stream()
                .filter(s -> s.startsWith("F"))
                .collect(Collectors.toList());

        System.out.println("After removing with predicate: " + strings);

        //iterowanie
        //TODO Napisać pętle, które przejdą przez wszystkie elementy tej tablicy - for, foreach, while, do-while
        for (String s : strings){
            System.out.println("Foreach: " + s);
        }

        for(int i = 0; i < strings.size(); i++){
            System.out.println("For: " + strings.get(i));
        }

        int i = 0;
        while (i < strings.size()){
            System.out.println("While: " + strings.get(i));
            i++;
        }

        i = 0;
        do {
            System.out.println("Do-while: " + strings.get(i));
            i++;
        } while (i < strings.size());

        //strings.forEach(s -> System.out.println(s));



        //modyfikacja
        //add dodaje element na końcu
        strings.add("Eight");

        //set pozwala na modyfikacje elementu
        strings.set(0, "One moded");

        strings.remove("One");
        strings.remove(0);

        //TODO Do napisania próba usunięcia z kolekcji Integerów
        List<Integer> ints = new ArrayList<>();
        ints.add(7);
        ints.add(6);
        ints.add(5);
        ints.add(4);
        ints.add(3);
        ints.add(2);
        ints.add(1);

        ints.remove(new Integer(1));

        System.out.println(ints);

        //modyfikacja referencji
        Instrument guitar = new Instrument("guitar");
        Instrument violin = new Instrument("violin");

        final ArrayList<Instrument> instruments = new ArrayList<>();
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