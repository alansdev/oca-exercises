package info.krogulec.flowcontrol;

import info.krogulec.Utils;

public class BreakAndContinue {

    public static void main(String[] args) {

        Utils.breakingParts("Break statement");
        breakStatement();

        Utils.breakingParts("Continue statement");
        continueStatement();
    }

    private static void continueStatement() {
        for (int i = 0 ; i < 10 ; i++){
            if (i == 5){
                continue;
            }
            System.out.println("Pętla z continue: " + i);
        }

        for (int hour = 0; hour < 24 ; hour++){
            if (hour == 10){
                continue;
            }
            for(int min = 0; min < 60 ; min++){
                if(min == 24){
                    continue; //przechodzi do następnej iteracji
                }
                System.out.println("Pętla z continue. Hour: " + hour + " Minute: " + min);
            }
        }

        int age = 40;
        while (age < 50){
            age++;
            if (age == 45){
                continue;
            }
            System.out.println("not so old :)" + age);
        }

        int [] ints = new int[]{1,2,3,4,5};
        for (int i : ints){
            if (i == 2){
                continue;
            }
            System.out.println("In foreach" + i);
        }
    }

    /**
     * Pozwala na natychmiastowe wyjście z pętli
     */
    private static void breakStatement() {

        for (int i = 0 ; i < 10 ; i++){
            if (i == 5){
                break;
            }
            System.out.println("Jeszcze nie było break: " + i);
        }

        for (int hour = 0; hour < 24 ; hour++){
            if (hour == 10){
                break;
            }
            for(int min = 0; min < 60 ; min++){
                if(min == 24){
                    break; //wychodzi z wewnętrznej pętli
                }
                System.out.println("Hour: " + hour + " Minute: " + min);
            }
        }

        int age = 40;
        while (age < 50){
            System.out.println("not so old :)" + age);
            age++; //trzeba pamiętać - bez tego pętla będzie nieskończona
            if (age == 45){
                break;
            }
        }

        int [] ints = new int[]{1,2,3,4,5};
        for (int i : ints){
            System.out.println("In foreach" + i);
            if (i == 2){
                break;
            }
        }
    }
}
