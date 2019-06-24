package info.krogulec.arrays;

import info.krogulec.Utils;

/**
 * Trzeba pamiętać, że elementy indeksujemy od 0, a size liczymy od 1
 */
public class OneDimentionalArrays {

    public static void main(String[] args) {

        //tablica - inicjalizacja poprzez podanie pustej wartości w nawiasach
        int [] ints = new int[]{};

        //co się stanie po uruchomieniu?
//        ints[1] = 4;

        //tablica - inicjalizacja poprzez podanie ilości elementów
        byte [] bytes = new byte[2];

        // co się stanie?
//        bytes[0] = "Jan";

        //tablica - podanie jednocześnie ilości elementów oraz nawiasów klamrowych uniemożliwia kompilację
//        char [] chars = new char[2]{};

        String [] sts = {"Jan", "Marek"};

        //inny typ inicjalizacji
        short shorts [] = new short[]{};

        //negatywna wielkość - co się stanie?
        //String [] strings = new String[-5];

        //wielkość - floating - co się stanie?
        //Character [] characters = new Character[1.4];

        //inicjalizacja z klasami abstrakcyjnymi/ interfejsami - co się  stanie?
        //Car [] cars = new Car[]{new Car()};

        Utils.breakingParts("Obliczenie rozmiaru tablicy");
        //arraysSizes();

        Utils.breakingParts("Iterowanie po tablicach");
        iterating();


    }

    /**
     * Cwiczenie - iterowanie po tablicy jednowymiarowej
     */
    private static void iterating() {
        int [] ints = new int[]{1,2,3,4,5,6,7,8};

        for (int i = 0 ; i < ints.length ; i++) {
            System.out.println("Pętla for, idneks: " + ints[i]);
        }

        for(int i : ints){
            System.out.println("Pętla foreach, element: " + i);
        }

        int i = 0;
        while (i < ints.length){
            System.out.println("Pętla while, indeks: " + ints[i]);
            i++;
        }

        i = 0;
        do{
            System.out.println("Pętla do-while, indeks: " + ints[i]);
            i++;
        }while (i < ints.length);

    }

    /**
     * Jakie będą rozmiary poszczególnych tablic? Ile elementów się do nich zmieści?
     */
    private static void arraysSizes() {

        // 10
        int [] ints = new int[10];
        System.out.println(ints.length);

        // 5
        int [] ints2 = new int[]{1,2,3,4,5};
        System.out.println(ints2.length);

        // 50
        int [] ints3 = new int[ints.length*5];
        System.out.println(ints3.length);

        // 5
        int [] ints4 = new int[]{0,1,2,3,ints2.length};
        System.out.println(ints4.length);

        // 0
        int [] ints5 = new int[]{};
        System.out.println(ints5.length);


    }
}

abstract class Car{

}
