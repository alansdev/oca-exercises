package info.krogulec.inheritance;

public class MethodsConflicts {
}

interface Human{
    default void canWalk(){
        System.out.println("Human walks");
    }

    //...
}

interface Alien{
    void canWalk();

    //...
}

//TODO Co zrobić, żeby ten kod się kompilował?
//interface HumanAlienHybrid extends Human, Alien{
//
//}
