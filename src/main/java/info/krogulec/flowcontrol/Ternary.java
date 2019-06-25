package info.krogulec.flowcontrol;

public class Ternary {

    private static short sum = 100;

    public static void main(String[] args) {

        //standardowe użycie ternary
        String out = sum < 200 ? "sum is less than 200" : "sum in more than 200";
        System.out.println(out);

        int i = 2;

        //mniej standardowe użycie ternary
        String out2 = sum < 200 && ++i == 5 ? "out 1" : "out 2";
        System.out.println(out2);

        boolean b = false;

        //mniej standardowe użycie ternary v2 - musi być nawias (b = true)
        String out3 = (sum < 200) && (b = true) ? "out 1" : "out 2";
        System.out.println(out3);

        //Jeśli podamy przynajmniej jedno wyjście jako double wyrażenie się skompiluje
        Double i6 = sum > 200 ? 4 : 6D;

        //W tym przypadku się nie kompiluje
        //Double i7 = sum > 200 ? 4 : 6;

        //bez else się nie skompiluje
//        out = sum < 200 ? "sum is less than 200";

        //trzeba się przygotować na różne konstrukcie w ramach tych wyrażeń
        int outInt = sum < 200 ? ++sum : sum++;
        System.out.println(outInt);

        outInt = sum < 200 ? sum++ : sum;
        System.out.println(outInt); //trzeba zwrócić uwagę na preinkrementację i postinkrementację -
        System.out.println(sum);

        //może też wkrać się temat z konwersją - poniższe się nie skompiluje
        //Long l = (sum > 300) ? new Integer(100) : new Integer(200);

    }
}
