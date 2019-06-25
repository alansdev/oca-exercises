package info.krogulec.flowcontrol;

import info.krogulec.Utils;

public class Switch {

    public static void main(String[] args) {

        Utils.breakingParts("Standardowe użycie switch");
        //standardSwitch();

        Utils.breakingParts("Z pustymi przypadkami");
        //withEmptyCases();

        Utils.breakingParts("Brak słowa break i tego konsekwencje");
        //lackOfBreak();

        Utils.breakingParts("Switch enums");
        //switchEnums();

        Utils.breakingParts("Switch enums - types");
        //switchingTypes();

    }

    private static void switchingTypes() {
        String b = "15";
        final String caseD = "D";

        switch(b){
            //nie może być duplikowanych case'ów
            case "A":
                System.out.println("Ten");
                break;
            case caseD:
                System.out.println("Fifteen");
                break;
            default:
                System.out.println("Not ten or fifteen");
        }
    }

    private static void switchEnums() {
        Days d = Days.MON;

        switch (d){
            case MON:
                System.out.println("MON");
            case TUE:
                break;
            default: //też może być pusto
        }
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
        final int case15 = 15;

        int age = 20;

        switch (age){
            case case15:
                System.out.println("age is 15");
                break;
            default:
                System.out.println("age is not 15 nor 20");
            case 50:
                System.out.println("age is 20");
                System.out.println("another line is ok");
                break;

        }


    }
}

enum Days{
    MON, TUE, WED
}
