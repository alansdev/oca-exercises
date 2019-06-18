package info.krogulec.inheritance;

public class ShowObjectInheritance {

    public static void main(String[] args) throws Throwable {
        //poniżej przykadowe metody dziedziczone z klasy Object
        ShowObjectInheritance soi = new ShowObjectInheritance();
        soi.equals(soi);
        int i = soi.hashCode();
        soi.toString();
        soi.finalize();
        Class<? extends ShowObjectInheritance> aClass = soi.getClass();
    }
}
