package info.krogulec.inheritance;

/**
 * Mogą być publiczne lub domyślne
 */
public interface CanSwimm {
    void swimm();

    //Pola domyśnie public static final
    static final String SWIMMER = "swimmer";

    //nowe w java 8
    default void place(){
        System.out.println("swimming pool");
    }

    //nowe w java 8
    static String prepareSwimmer(String name){
        return SWIMMER + " " + name;
    }


}

class Person implements CanSwimm{

    private String name;

    public static void main(String[] args) {
        CanSwimm canSwimm = new Person();
        canSwimm.swimm();
        canSwimm.place();
        System.out.println(CanSwimm.prepareSwimmer("Jan"));
    }

    @Override
    public void swimm() {
        System.out.println("I'm swimming");
    }
}
