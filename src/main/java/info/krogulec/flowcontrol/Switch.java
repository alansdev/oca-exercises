package info.krogulec.flowcontrol;

import info.krogulec.Utils;

public class Switch {

    public static void main(String[] args) {

        Utils.breakingParts("Standardowe użycie switch");
        standardSwitch();

        Utils.breakingParts("Z pustymi przypadkami");
        withEmptyCases();

        Utils.breakingParts("Brak słowa break i tego konsekwencje");
        lackOfBreak();
    }

    /**
     * trzeba zwrócić uwagę na break - jeśli nie ma go w przypadku, który został znaleziony sterowanie przejdzie przez wszystki poniższe przypadki, aż do napotkania słowa break
     */
    private static void lackOfBreak() {
        Character a = 'A';

        switch (a){
            case 'B':
                System.out.println("B");
                break;
            case 'A':
                System.out.println("A");
                //brak słowa kluczowego break
            case 'D':
                System.out.println("D");
            case 'E':
                System.out.println("E");
                break;
            default:
                System.out.println("no matches");
        }
    }

    private static void withEmptyCases() {
        String day = "WED";

        switch (day){
            case "MON":
            case "TUE":
                System.out.println("do something");
            case "WED":
                System.out.println("WED it is");
            //default nie jest potrzebne

        }
    }

    private static void standardSwitch() {

        //musi być finalna zmienna
        int age = 20;

        switch (age){
            case 15:
                System.out.println("age is 15");
                break;
            case 20:
                System.out.println("age is 20");
                System.out.println("another line is ok");
                break;
            default:
                System.out.println("age is not 15 nor 20");

        }


    }
}
