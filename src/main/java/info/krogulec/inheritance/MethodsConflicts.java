package info.krogulec.inheritance;

public class MethodsConflicts implements Human, Alien {

    @Override
    public void canWalk() {

    }
}

interface Human{
    default void canWalk(){
        System.out.println("Human walks");
    }

    //...
}

interface Alien{
    default void canWalk(){};

    //...
}

//TODO Co zrobić, żeby ten kod się kompilował?
//interface HumanAlienHybrid extends Human, Alien{
//
//}
