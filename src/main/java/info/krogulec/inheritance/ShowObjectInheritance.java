package info.krogulec.inheritance;

public class ShowObjectInheritance {

    public static void main(String[] args) throws Throwable {
        //poniżej przykadowe metody dziedziczone z klasy Object
        ShowObjectInheritance soi = new ShowObjectInheritance();
        System.out.println(soi.equals(soi));
        int i = soi.hashCode();
        System.out.println(i);
        System.out.println(soi.toString());
        soi.finalize();
        Class<? extends ShowObjectInheritance> aClass = soi.getClass();

        System.out.println(aClass);
    }
}
