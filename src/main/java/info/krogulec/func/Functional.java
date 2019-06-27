package info.krogulec.func;

public class Functional {
    public static void main(String[] args) {
        SomeAction sa = s -> Integer.parseInt(s);

        int i = sa.parseStr("3");
        System.out.println(i);
    }
}

@FunctionalInterface
interface SomeAction{
    int parseStr(String s);

    default void doSth(){

    }

    //Musi być jedna metoda abstrakcyjna w interfejsie funkcyjnym
    //String doing();
}
