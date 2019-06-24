package info.krogulec.basics;

//klasa nie musi być publiczna
public class MainMethodValidA {

    //Main musi być publiczny
    //Musi byc static
    //Musi byc void
    public static void main(String... vars) {
        System.out.println("Valid signature: public static void main(String[] args)");
    }
}

//Moze być kilka mainów
class NotPublic {
    public static void main(String[] args) {

    }
}
