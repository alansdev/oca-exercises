package info.krogulec.accessmodifiers.second;

class UseClassInSamePackage {

    private void useClassInSamePackage(){
        DefaultClassInSecond defaultClassInSecond = new DefaultClassInSecond();

        defaultClassInSecond.doSomethingDefault();
        defaultClassInSecond.doSomethingProtected(); //protected to dostęp domyślny + dostęp w ramach dziedziczenia
        defaultClassInSecond.doSomethingPublic();
    }
}
