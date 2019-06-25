package info.krogulec.fieldsmethodsencapsulation;


public class Methods {

    private static int primitiveField;
    private Person person;

    public static void main(String[] args) {

        /* Odwołanie do statycznej metody poprzez nazwę klasy i przypisanie wyjścia do zmiennej*/
        //String retFromStatic = Methods.staticMethodWithReturnValue();
        //System.out.println(retFromStatic);

        /* Odwołanie do statycznej metody poprzez nazwę klasy i brak przypisania*/
        //staticMethodWithReturnValue();

        // Porównanie przekazania przez wartość i referencję
        //passByValueAndReference();

        Photo photo = new Photo();
        System.out.println(photo.takePhoto(new Phone()));
        System.out.println(photo.takePhoto(new Camera()));

    }

    private static void passByValueAndReference() {
        Person person = new Person();
        person.setName("Jacek");

        changePerson(person, primitiveField);

        System.out.println("Zmienione pole przekazane przez referencję: " + person.getName() + " Nie zmienione pole przekazane przez wartość: " + primitiveField);
    }

    /**
     * Metoda z parametrami wejściowymi - przykład
     *
     * @param s
     * @return
     */
    private String methodWithParams(String s){
        return s;
    }

    /**
     * Jeśli zdefiniujemy wartość zwracaną przez metodę, trzeba ją faktycznie zwrócić za pomocą return lub rzucić wyjątek
     *
     * @return
     */
    private String methodWithReturningValue(){
        return "";
    }

    /**
     * Jeśli metoda nie zwraca niczego deklarujemy to poprzez słowo void
     */
    private void methodWithNOReturnValue(){
        //w tym przypadku ciało metody może być puste
    }

    /**
     * metoda może być statyczna - należy wtedy do klasy, a nie konkretnego obiketu i można ją wykorzystywać bez utworzenia obiketu
     *
     * @return
     */
    private static String staticMethodWithReturnValue(){

        //return musi być ostatnim kodem WYKONANYM w metodzie - nie musi to być ostatnia linia
        return "r";
    }

    //TODO: Co zwróci ta metoda?
//    private String getSth(void){
//    }

    /**
     * Vararg jest poprawnym argumentem do metody - odwołujemy się do niego jak do tablicy
     *
     * @param sth
     */
    private void vararg(int... sth){

    }

    //TODO Czy ta metoda się skompiluje?
    private void vararg2(String s, Character... vararg2){

    }

    //TODO Napisać metodę, która się skompiluje, a return nie będzie ostatnnią linią

    //Metody ptzeciążone - muszą być inne parametry wejściowe, ale typ zwracany nie jest konieczny taki sam
    public String overload(int i){return String.valueOf(i);}
    public String overload(String i){return i;}

    /**
     * Porównanie przekazania przez wartość i referencję
     *
     * @param person - obiket jest przekazywany przez referencję
     * @param primitiveField - pole jest przekazywane przez wartość
     */
    private static void changePerson(Person person, int primitiveField){
        person.setName("Placek");
        primitiveField = 100;
    }


}

/**
 * Klasa z przeciążonymi metodami
 */
class Photo{
    public String takePhoto(Camera camera){
        return "Taking photo with camera";
    }

    public String takePhoto(Phone phone){
        return "Taking photo with phone";
    }

    //Przeciążana metoda może mieć inny typ zwracany - musi być inny typ przekazywany
    public int takePhoto(String sth){
        return 10;
    }
}

class Camera{}

class Phone{}

class Person{

    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}


