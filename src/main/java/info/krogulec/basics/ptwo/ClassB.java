package info.krogulec.basics.ptwo;

import info.krogulec.basics.pone.ClassA;

public class ClassB {

    private String useSomeMethods(){
        ClassA classA = new ClassA();

        //mozna użyć tylko publicznej
        return classA.getNemePublic();
    }
}
