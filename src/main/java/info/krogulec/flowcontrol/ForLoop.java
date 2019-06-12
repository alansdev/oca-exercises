package info.krogulec.flowcontrol;

import info.krogulec.Utils;

import javax.rmi.CORBA.Util;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ForLoop {
    public static void main(String[] args) {

        Utils.breakingParts("Jednopoziomowa pętla for");
        oneLevelForLoop();

        Utils.breakingParts("Dwupoziomowa pętla for");
        twoLevelForLoop();

        Utils.breakingParts("Pętla foreach lub enhanced for loop");
        foreachLoop();
    }

    /**
     * Ta pętla broni nas przez wyjściem poza zakres - wylicza tylko to co jest w danej tablicy/ kolekcji
     */
    private static void foreachLoop() {

        int[] arr = new int[]{1,2,3,4,5,6,7};

        for (int i : arr){
            System.out.println("Foreach, iteracja: " + i);
        }

        //nie są również potrzebne nawiasy
        List<String> strings = new ArrayList<>();
        strings.add("one");
        strings.add("two");
        strings.add("three");

        for (String s : strings){
            System.out.println(s);
            s = "new"; //wartość można zmienić jeśli jest to obiekt i jest mutowalny - w tym przypadku nie
        }

        System.out.println(strings);

        //W tym przypadku tworzymy kolekcję mutowalnych obiektów
        List<StringBuilder> stringsMutable = new ArrayList<>();
        stringsMutable.add(new StringBuilder("one"));
        stringsMutable.add(new StringBuilder("one"));
        stringsMutable.add(new StringBuilder("one"));

        for (StringBuilder s : stringsMutable){
            System.out.println(s);
            s.append("new"); //wartość można zmienić jeśli jest to obiekt i jest mutowalny - w tym przypadku nie
        }

        stringsMutable.forEach(sm -> System.out.println(sm.toString()));

        //nie można modyfikowaać składników tablicy
        for (int i : arr){
            System.out.println("Foreach, iteracja: " + i);
            arr[i] = 4;
        }

        System.out.println("Przy próbie modyfikacji elementów nic się nie zmieniło: " + Arrays.toString(arr));


        //nie można usuwać elementów kolekcji po której się iteruje - będzie wyjątek
        for (String s : strings){
            System.out.println(s);
            strings.remove(s);
        }

    }

    private static void twoLevelForLoop() {

        //standardowa wersja - ładnie sformatowana - na egzaminie może być różnie - np. bez nawiasów
        for (int hour = 0; hour < 24 ; hour++){
            for(int min = 0; min < 60 ; min++){
                System.out.println("Hour: " + hour + " Minute: " + min);
            }
        }

        //wersja bez nawiasów + iterowanie po tablicy dwuwymiarowej
        int [][] arr = new int[][]{{1,2,3},{4,5,6}};

        for (int i = 0; i< arr.length; i++)
            for (int j = 0; j<arr[i].length; j++)
                System.out.println("Tablica dwuwymiarowa - pętla for bez nawiasów: " + arr[i][j]);
    }

    private static void oneLevelForLoop() {
        //standardowa pętla
        for(int i = 0; i < 10; i++){
            System.out.println("Standardowa pętla for. Przypadek: " + i);
        }

        //kilka zmiennych w bloku inicjalizacyjnym - muszą być tego samego typu
        for(int i = 0, j = 1; i < 10; i++){
            System.out.println("Dwie zmienne w bloku inicjalizacyjnym. Przypadek: " + i + " druga zmienna: " + j);
        }

        //wyrażenie update - wykonuje się po przypadku - trzeba to pamiętać
        for(int i = 0; i < 1; System.out.println("A")){
            System.out.println("Standardowa pętla for. Przypadek: " + i);
            i++;
        }

        //wyrażenie update - może mieć kilka działań oddzielonych przecinkami
        for(int i = 0; i < 1; System.out.println("A"), doSth()){
            System.out.println("Dwa wyrażenia w sekcji update. Przypadek: " + i);
            i++;
        }

        //brak nawiasów
        for(int i = 0; i < 10; i++)
            System.out.println("Brak nawiasów - wykonuje się tylko jedna linijka. Przypadek: " + i);
        System.out.println("po pętli");


        //może nie być bloku update
//        for(int i = 0; ;){
//            System.out.println("Brak wyrażenia update - pętla nieskończona. Przypadek: " + i);
//        }


        //może nie być wyrażenia terminującego - pętla nieskończona
//        for(int i = 0; ; i++){
//            System.out.println("Brak wyrażenia terminującego - pętla nieskończona. Przypadek: " + i);
//        }

        //przypadek skrajny - brak jakiejkolwiek części - pętla nieskończona
//        for(;;){
//            System.out.println("infinite");
//        }
    }

    private static void doSth() {
        System.out.println("second in update");
    }
}
