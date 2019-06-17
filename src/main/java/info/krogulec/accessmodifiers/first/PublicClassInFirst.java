package info.krogulec.accessmodifiers.first;

public class PublicClassInFirst {

    private void doSomethingInPrivate(){
        System.out.println("doSomethingInPrivate");
    }

    void doSomethingDefault(){
        System.out.println("doSomethinDefault");
    }

    protected void doSomethingProtected(){
        System.out.println("doSomethingProtected");
    }

    public void doSomethingPublic(){
        System.out.println("doSomethingPublic");
    }

}
