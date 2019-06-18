package info.krogulec.exceptions;

import com.sun.jndi.toolkit.url.Uri;
import info.krogulec.basics.pone.ClassA;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;

public class CausingExceptions {
    public static void main(String[] args) {
        arrayIndex();
        indexOutOfBound();
        classCast();
        IllegalArgument();
        arithmetic();
        nullPointer();
        numberFormat();
        initializerError();
        stackOverflow();
        noClassDef();
        outOfMemory();
    }

    private static void outOfMemory() {
        //TODO Wywołać wyjątek
    }

    private static void noClassDef() {
        //TODO Wywołać wyjątek

    }

    private static void stackOverflow() {
        //TODO Wywołać wyjątek
    }

    private static void initializerError() {
        //TODO Wywołać wyjątek
    }

    private static void numberFormat() {
        //TODO Wywołać wyjątek
    }

    private static void nullPointer() {
        //TODO Wywołać wyjątek
    }

    private static void arithmetic() {
        //TODO Wywołać wyjątek
    }

    private static void IllegalArgument() {
        //TODO Wywołać wyjątek
    }

    private static void classCast() {
        //TODO Wywołać wyjątek
    }

    private static void indexOutOfBound() {
        //TODO Wywołać wyjątek
    }

    private static void arrayIndex() {
        //TODO Wywołać wyjątek
    }
}

class Bird{}

class Sparrow extends Bird{}

class InvalidInitialize{
    static {
        int i = Integer.parseInt("sd");
    }
}
