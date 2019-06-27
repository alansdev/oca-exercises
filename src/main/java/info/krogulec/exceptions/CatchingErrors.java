package info.krogulec.exceptions;

public class CatchingErrors {

    public static void main(String[] args) {
        try{
            prepareStackOverflow();
        } catch (Error error){
            System.out.println("Error caught: " + error.getMessage());
            error.printStackTrace();
        }

        System.out.println("After war...");
    }

    private static void prepareStackOverflow() {
        //TODO Jak wywołać stack overflow error?
        //prepareStackOverflow();
    }
}
