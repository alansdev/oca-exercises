package info.krogulec.types;

public class ObjectReferences {
    private Car mini = new Car();
    private Car smart;

    public static void main(String[] args) {

        ObjectReferences or = new ObjectReferences();

        System.out.println("initialized mini: " + or.mini);
        System.out.println("not initalized smart: " + or.smart);
    }


}

class Car {
    //zgodnie z dobrymi praktykami pola są prywatne, ale na egazminie trzeba się przygotować na różne ewentualności
    private String make;
    public String model;

    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }
}
