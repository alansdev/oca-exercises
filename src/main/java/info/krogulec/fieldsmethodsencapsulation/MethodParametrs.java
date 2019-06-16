package info.krogulec.fieldsmethodsencapsulation;

public class MethodParametrs {

    private int a = 1;
    private static String s = "ABC";

    public static void main(String[] args) {
        MethodParametrs methodParametrs = new MethodParametrs();
    }

    /**
     * Parametry do metody mogą mieć tę samą nazwą co pola, ale nie jest to dobrą praktyką
     *
     * @param a - zmienna nie związana z polem a z wyjątkiem tej samej nazwy
     * @param s- zmienna nie związana z polem s z wyjątkiem tej samej nazwy
     */
    private void someMethodParams(int a, String s){
        //TODO co się wydarzy, gdy zdefiniujemy zmienną o tej samej nazwie co parametr do metody
    }


}
