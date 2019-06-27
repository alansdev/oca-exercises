package info.krogulec.exceptions;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class CausingExceptions {

    public static void main(String[] args) throws InterruptedException {
        //arrayIndex();
        //indexOutOfBound();
        //classCast();
        //IllegalArgument();
        //arithmetic();
        //nullPointer();
        //numberFormat();
        //initializerError();
        //stackOverflow();
        noClassDef();
        outOfMemory();
    }

    private static void outOfMemory() {




        //TODO Wywołać wyjątek
//        List<String> strings = new ArrayList<>();
//        while (true){
//            System.out.println(strings.size());
//            strings.add("Str" + new Random().nextInt());
//        }

        long [] longs = new long[Integer.MAX_VALUE];
    }

    private static void noClassDef() {
        //TODO Wywołać wyjątek

    }

    private static void stackOverflow() {
        //TODO Wywołać wyjątek
        stackOverflow();
    }

    private static void initializerError() {
        //TODO Wywołać wyjątek
        new InvalidInitialize();
    }

    private static void numberFormat() {
        //TODO Wywołać wyjątek
        Integer.valueOf("xxx");
    }

    private static void nullPointer() {
        //TODO Wywołać wyjątek
        String s = null;
        s.length();
    }

    private static void arithmetic() {
        //TODO Wywołać wyjątek
        double a = 1/0;
    }

    private static void IllegalArgument() throws InterruptedException {
        //TODO Wywołać wyjątek
        //Integer.valueOf("xxx");
        "".wait(-1);
    }

    private static void classCast() {
        //TODO Wywołać wyjątek
        Sparrow s = (Sparrow) new Bird();
    }

    private static void indexOutOfBound() {
        //TODO Wywołać wyjątek
        List<String>strs = new ArrayList<>();

        strs.get(10);
    }

    private static void arrayIndex() {
        //TODO Wywołać wyjątek
        int [] ints = {1,2,3,4,5};
        ints[10] = 15;
    }
}

class Bird{}

class Sparrow extends Bird{}

class InvalidInitialize{
    static {
        int i = Integer.parseInt("sd");
    }
}

class OutOfMem{
    private final String name;

    public OutOfMem(String name) {
        this.name = name;
    }
}
