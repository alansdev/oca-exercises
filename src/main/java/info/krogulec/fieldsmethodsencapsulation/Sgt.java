package info.krogulec.fieldsmethodsencapsulation;

public class Sgt {
    private static Sgt instance;

    private Sgt(){}

    public static Sgt getInstance(){
        if (instance != null){
            return instance;
        } else {
            instance = new Sgt();
            return instance;
        }
    }
}
