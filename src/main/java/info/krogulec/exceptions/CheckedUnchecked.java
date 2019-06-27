package info.krogulec.exceptions;

import java.io.IOException;

public class CheckedUnchecked {

    public static void main(String[] args) {

    }

    //Można obsłużyć wyjątek lub rzucić go dalej
    private void useMethodThatThrowsCheckedException() throws CheckedException {
        doSomenthingThatThrowsCheckedException();
    }

    //Można obsłużyć wyjątek lub rzucić go dalej
    private void anotherUseMethodThatThrowsCheckedException() {
        try {
            doSomenthingThatThrowsCheckedException();
        } catch (CheckedException e) {
            System.out.println("Złapałem wyjątek");
        }
    }

    //Pomimo deklaracji nie musimy obsługiwać sytuacji wyjątkowej
    private void useUnchecked(){
        throwRuntimeException();
    }

    private void doSomenthingThatThrowsCheckedException() throws CheckedException{
        throw new CheckedException();
    }

    //Nie trzeba rzucać wyjątku, żeby zadeklarować, że metoda rzuca wyjątek
    private void doSomenthingThatInDesignedToThrowCheckedException() throws CheckedException{

    }

    //nie trzeba deklarować, wyjątku runtime, ale można to również zrobić
    private void throwRuntimeException(){
        throw new UncheckedException();
    }
}

class CheckedException extends Exception{}
class UncheckedException extends RuntimeException{}
