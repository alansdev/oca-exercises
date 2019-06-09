package info.krogulec.basics.ptwo;

import info.krogulec.basics.pone.ClassA;

public class ClassC extends ClassA {

    public String useSomeClasses(){

        //trzeba zwrócić uwagę, że jeśli pole/ metoda jest protected to poza pakietem może być wykorzystana tylko jako metoda klasy dziedziczącej
        return getNemeProtected();
    }
}
