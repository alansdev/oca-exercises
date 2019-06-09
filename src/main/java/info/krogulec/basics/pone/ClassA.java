package info.krogulec.basics.pone;

public class ClassA {
    public String getNemePublic(){
        return "some name public";
    }

    String getNemeDefault(){
        return "some name default";
    }

    private String getNemePrivate(){
        return "some name private";
    }

    protected String getNemeProtected(){
        return "some name protected";
    }
}
