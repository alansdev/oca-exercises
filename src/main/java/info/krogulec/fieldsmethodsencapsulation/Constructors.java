package info.krogulec.fieldsmethodsencapsulation;

public class Constructors {

    static {
        System.out.println("Blok inicjalizacyjny static 1");
    }

    {
        System.out.println("Blok inicjalizacyjny 1");
    }

    private String name;

    /**
     * Konstruktor bez parametrów jest domyślny - nie trzeba go deklarować, ale można. Jeśli zostanie zadeklarowany jakikolwiek konstruktor w klasie, nie ma już konstruktora domyślnego
     */
    public Constructors() {
        System.out.println("constructor");
    }

    static {
        System.out.println("Blok inicjalizacyjny static 2");
    }

    /**
     * Można definiować wiele konstruktorów w klasie - podobieństwo do przeciążania metod
     *
     * @param param
     */
    public Constructors(String param, int someVAl){
        System.out.println("constructor");
    }

    {
        System.out.println("Blok inicjalizacyjny 2");
    }

    /**
     * Konstruktory stosujemy, aby ustawić okreslony stan obiektu
     * Możemy w nich wywoływać inne konstruktory, ale przez this i musi to być pierwsza linia w konstruktorze
     *
     * @param name
     */
    public Constructors(String name){
        this(name, 1);
        this.name = name;
        System.out.println("onstructor");
    }

    //region Konstruktory mogą mieć różne modyfikatory dostępu

    protected Constructors(int param){
        System.out.println("constructor int");
    }

    Constructors(Character param){
        System.out.println("constructor char");
    }

    private Constructors(Double param){
        System.out.println("constructor");
    }

    private Constructors(byte b){
        System.out.println("constructor byte");
    }

    //endregion

    public static void main(String[] args) {
        Constructors c = new Constructors();
        Constructors c2 = new Constructors("p", 1);
        Constructors c3 = new Constructors("p");
        Constructors c4 = new Constructors(1);
        Constructors c5 = new Constructors('A');
        Constructors c6 = new Constructors(1);

        byte primByte = 3;

        Constructors c7 = new Constructors(primByte);

        //TODO Jaki konstruktor został wywołany dla c4, c5 i c6?
    }
}
