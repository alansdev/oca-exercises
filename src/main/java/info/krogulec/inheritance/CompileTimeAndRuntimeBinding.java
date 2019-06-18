package info.krogulec.inheritance;

/**
 * Pola są compile tima, a metody runtime - trzeba pamiętać tę różnicę na egzaminie
 */
public class CompileTimeAndRuntimeBinding {

    public static void main(String[] args) {
        Employee employee = new Employee();
        Employee programmer = new Programmer();
        System.out.println(employee.name);
        System.out.println(programmer.name);
        employee.printName();
        programmer.printName();
    }
}

class Employee {
    String name = "Employee";
    void printName(){
        System.out.println(name);
    }
}

class Programmer extends Employee{
    String name = "Programmer";

    void printName(){
        System.out.println(name);
    }
}
