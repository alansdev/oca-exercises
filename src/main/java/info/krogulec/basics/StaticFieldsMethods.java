package info.krogulec.basics;

public class StaticFieldsMethods {

    private String name = "Not static";

    private static String staticName = "Static";


    public static void main(String[] args) {
        System.out.println(staticName);

        //to się nie skompiluje - z metody statycznej nie dostaniemy się do pola niestatycznego
        //System.out.println(name);

        StaticFieldsMethods sfm  = new StaticFieldsMethods();
        String name = sfm.name;

        //jest to dozwolone, choć niezbyt eleganckie - na egzaminie często się pojawia
        String staticName = sfm.staticName;
    }

}
