package info.krogulec.flowcontrol;

public class IfElse {

    private static int age = 15;

    /**
     * Poniżej poprawne użycie kontrukcji if-else
     * @param args
     */
    public static void main(String[] args) {
        //basic if-else
        if (age == 15){
            System.out.println("age is 15");
        } else {
            System.out.println("age is not 15");
        }

        //if-else bez nawiasów curly
        if(age < 20)
            System.out.println("age is less then 20");
        else
            System.out.println("age is 20 or more");

        //if bez else
        if(age < 7)
            System.out.println("age is less then 7");

        //if-else else-if
        if (age == 15 && 1 == 1){
            System.out.println("age is 15 and 1 == 1");
        } else if (age < 15){
            System.out.println("age is less then 15");
        } else {
            System.out.println("age is not 15 nor less");
        }

        //formatowanie
        if (age > 100) System.out.println("age is more than 100"); else {System.out.println("age is less then 100");}

        //zagnieżdżenia - trzeba mocno na to uważać na egzaminie
        if (age > 10)
            if (age > 11)
                if (age > 12)
                    System.out.println("age is more the 12");
            System.out.println("age is more then 11");
        System.out.println("age is more then 10");

        //brak kodu w if - bez pustego bloku - nie skompiluje się
//        if (age > 10)
//        else

        //brak kodu w if - może tak być, ale muszą być nawiasy
        if (age > 10){}
        else
            System.out.println("age is less then 10");

        //wyrażenie w if-else musi dać w wyniku boolean - poniższe się nie skompiluje
//        if (age = 5){
//
//        }


        boolean adult = false;

        //Sytuacja poprawna pod kątem kompilacji - wyrażenie musi zwrócić true lub false
        if (adult = true){
            System.out.println("is adult");
        }

        System.out.println(adult);






    }
}
