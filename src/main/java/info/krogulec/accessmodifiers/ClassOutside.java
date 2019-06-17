package info.krogulec.accessmodifiers;

import info.krogulec.accessmodifiers.first.PublicClassInFirst;

public class ClassOutside {

    public static void main(String[] args) {
        PublicClassInFirst publicClassInFirst = new PublicClassInFirst();

        //poza pakietem first, tylko metoda publiczna jest dostępna dla klasy, która nie jest związana poprzez dziedziczenie
        publicClassInFirst.doSomethingPublic();

        //do klasy z domyśnym modyfikatorem dostępu nie ma

    }
}

class ClassOutsideConnected extends PublicClassInFirst{

    public void useProtectedMethod(){
        //do metod protected można się dostać w przypadku dziedziczenia
        this.doSomethingProtected();
    }
}
