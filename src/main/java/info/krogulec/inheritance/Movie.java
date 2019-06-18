package info.krogulec.inheritance;

import java.time.Duration;

public class Movie {
    private String internals;
    protected String title;
    protected Duration lenght;

    void startMovie(){
        System.out.println("Movie started: " + title);
    }

    void stopMovie(){
        System.out.println("Movie stopped: " + title + " after: " + lenght);
    }
}

class Horror extends Movie{

    private int scarryScale;

    public Horror(String title, Duration duration, int scarryScale){

        //możemy ustawić pola z klasy z której dziedziczymy, jeśli nie są private lub default (chyba, że jestesmy w tym samym pakiecie)
        this.title = title;
        this.lenght = duration;
        this.scarryScale = scarryScale;
    }

    /**
     * Overrida - nadpsanie działania klasy z której dziedziczymu
     */
    @Override // adnotacja nie jest wymagana, ale wskazana
    void stopMovie(){
        System.out.println("Horror stopped: " + title + " after: " + lenght);
    }
}

class FilmsConsumer {
    public static void main(String[] args) {

        Horror horror = new Horror("From dusk till down", Duration.ofMinutes(130), 6);
        //użycie metod z klasy po której dziedziczymy
        horror.startMovie();
        horror.stopMovie();

        //posługujemy się typem klasy nadrzędnej
        Movie movie = new Horror("The Shining", Duration.ofMinutes(140), 7);
        movie.startMovie();
        movie.stopMovie();

        //TODO Czy poniższy kod się skompiluje?
        //Horror h = new Movie("The Shining", Duration.ofMinutes(140), 7);
        //Movie m = new Movie("The Shining", Duration.ofMinutes(140), 7);

        //TODO Jaki będzie wynik wykonania rzutowania w poszczególnych liniach metody casting()?
        FilmsConsumer fc = new FilmsConsumer();
        //fc.casting();
    }

    /**
     * Rzutowanie w ramach relacji dziedziczenia
     */
    private void casting(){
        Horror horror = new Horror("From dusk till down", Duration.ofMinutes(130), 6);
        Movie movieHorror = new Horror("The Shining", Duration.ofMinutes(140), 7);
        Movie movie = new Movie();

        Movie movie1 = (Movie)movieHorror;
        //Movie movie2 = (Movie)horror;
        //Horror horror1 = (Horror)movieHorror;
        //Horror horror2 = (Horror)movie;
    }
}
