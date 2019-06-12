package info.krogulec.flowcontrol;

public class Ternary {

    private static short sum = 100;

    public static void main(String[] args) {

        //standardowe użycie ternary
        String out = sum < 200 ? "sum is less than 200" : "sum in more than 200";
        System.out.println(out);

        //nie skompiluje się jeśli nie będzie to poprawne wyrażenie
//        sum < 200 ? "sum is less than 200" : "sum in more than 200";

        //bez else się nie skompiluje
//        out = sum < 200 ? "sum is less than 200";

        //trzeba się przygotować na różne konstrukcie w ramach tych wyrażeń
        int outInt = sum < 200 ? ++sum : sum;
        System.out.println(outInt);

        outInt = sum < 200 ? sum++ : sum;
        System.out.println(outInt); //trzeba zwrócić uwagę na preinkrementację i postinkrementację -
        System.out.println(sum);

        //może też wkrać się temat z konwersją - poniższe się nie skompiluje
//        Long l = (sum > 300) ? new Integer(100) : new Integer(200);

    }
}
