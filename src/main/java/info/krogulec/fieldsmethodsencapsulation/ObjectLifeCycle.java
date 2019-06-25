package info.krogulec.fieldsmethodsencapsulation;

public class ObjectLifeCycle {
    private Movie movie; //zaczyna się cykl życia obiketu - deklaracja pola

    public ObjectLifeCycle() throws InterruptedException {
        this.movie = new Movie("Star wars"); //tutaj obiket jest tworzony
        movie = null; //tutaj zmienna movie już nie wskazuje na utworzony wcześniej obiket - nie jest on już dostępny

        movie = new Movie("Bloody diamond"); //ten obiekt nie ma referencji - również po utworzeniu nie jest dostępny

        doSth();
    }

    public static void main(String[] args) throws InterruptedException {
        ObjectLifeCycle o = new ObjectLifeCycle();

        //nie gwarantuje wykonania GC i nie zaleca się jego używania
        System.gc();

        //TODO Kod pokazujący finalizację bez jej bezpośredniego wywołania
    }

    private static void doSth(){
        Movie m = new Movie("Green mile");
        //TODO Kiedy obiket movie będzie wskazany do usunięcia?
    }


}

class Movie{
    private String title;

    public Movie(String title) {
        this.title = title;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    /**
     * Metoda dziedziczona z klasy Object - wykonywana przed uruchomieniem GC - zaleca się nie nadpisywać jej
     *
     * @throws Throwable
     */
    @Override
    protected void finalize() throws Throwable {
        System.out.println("finalizacja: " + title);
        super.finalize();
    }
}
