package info.krogulec.types;

public class Comparing {

    public static void main(String[] args) {

        //referencje do obiektu są różne
        Integer i1 = new Integer(100);
        Integer i2 = new Integer(100);

        System.out.println(i1 == i2);
        System.out.println(i1.equals(i2));

        Integer i3 = Integer.valueOf(100);
        Integer i4 = Integer.valueOf(100);

        System.out.println(i3 == i4);
        System.out.println(i3.equals(i4));

        //autoboxing (od -128 do 127 wartości są w cache
        Integer i5 = 100;
        Integer i6 = 100;

        System.out.println(i5 == i6);
    }
}
