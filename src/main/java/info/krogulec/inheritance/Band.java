package info.krogulec.inheritance;

public abstract class Band {

    private String name;

    public Band(String name) {
        this.name = name;
    }

    protected void stopPlaying(){
        System.out.println("Band " + name +" stops playing");
    }

    //nie może być private - klasa potomna musi zaimplementować lub pozostawić abstrakcyjną
    protected abstract void startPlaying();

    protected String getName(){
        return name;
    }
}

/**\
 * Trzeba zaimplementować metody abstrakcyjne
 */
class RockBand extends Band{

    // Jeśli klasa nadrzędna nie ma bezparametrowego konstruktora, trzeba jawnie wywołać istniejący konstruktor
    public RockBand(String name) {
        super(name);
    }

    @Override //override nie jest wymagane
    protected void startPlaying() {
        System.out.println("Band " + getName() + " starts playing rock");
    }
}

class JazzBand extends Band{

    public JazzBand(String name){
        super(name);
    }

    /**
     * Trzeba pamiętać, że dostęp musi być taki sam lub szerszy w klasie dziedziczącej
     */
    @Override
    protected void startPlaying() {
        System.out.println("Band " + getName() + " starts playing jazz");
    }

    //overloading - nie moe być adnotacji override
    protected void stopPlaying(String cause){
        System.out.println("Jazz band " + getName() +" stops playing, because " + cause);
    }
}

class Festival{
    public static void main(String[] args) {
        //TODO Czy poniższy kod się skompiluje?
        //Band band = new Band();

        Band band = new RockBand("Metallica");
        band.startPlaying();
        band.stopPlaying();

        RockBand rockBand = new RockBand("Slayer");
        rockBand.startPlaying();
        rockBand.stopPlaying();

        Band jazzBand = new JazzBand("Miles Davies");
        jazzBand.startPlaying();
        jazzBand.stopPlaying();

        //TODO jakie będą wyniki poniższych rzutowań?
        Band c1 = (Band)jazzBand;
        RockBand c2 = (RockBand)jazzBand;
        JazzBand c3 = (JazzBand)band;
    }
}
