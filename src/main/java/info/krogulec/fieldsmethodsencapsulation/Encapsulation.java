package info.krogulec.fieldsmethodsencapsulation;

/**
 * Prawidłowa enkapulacja
 */
public class Encapsulation {
    private String a;
    private String b;

    public String getA() {
        return a;
    }

    /**
     * Mamy kontrolę nad tym co będzie ustawione w ramach pola
     *
     * @param a
     */
    public void setA(String a) {
        if (!a.equals("zakazana wartość")) {
            this.a = a;
        }

    }

    public String getB() {
        return b;
    }

    public void setB(String b) {
        this.b = b;
    }
}

/**
 * Brak enkapsulacji
 */
class Car{

    public String make;
    public String model;

}
