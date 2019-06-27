package info.krogulec.selectedjavaapiclasses;

import java.time.format.DateTimeFormatter;

public class StringBuilderMethods {

    public static void main(String[] args) {
        StringBuilder stringBuilder = new StringBuilder();

        stringBuilder.append("java");
        System.out.println(stringBuilder); //java

        stringBuilder.append("java");
        System.out.println(stringBuilder); //javajava

        stringBuilder.insert(1, "P");
        System.out.println(stringBuilder); //jPavajava

        stringBuilder.delete(0,2); //zawsze pierwszy wchodzi, drugi nie
        System.out.println(stringBuilder); //avajava

        stringBuilder.deleteCharAt(1);
        System.out.println(stringBuilder); //aajava

        stringBuilder.append("    ");
        System.out.println(stringBuilder); //aajava    "

        stringBuilder.trimToSize();
        System.out.println(stringBuilder); //aajava

        stringBuilder.replace(0,2,"BB");
        System.out.println(stringBuilder); //BBjava

        //Tutaj mamy nowy obiekt String
        String substring = stringBuilder.substring(3);

        //Tutaj mamy nowy obiekt CharSequence
        CharSequence charSequence = stringBuilder.subSequence(1, 3);//jak substring, ale zwraca subsequence i jako jedna z nielicznych nie modyfikuje zmiennej
        System.out.println(charSequence);
        System.out.println(stringBuilder);


        //Wywołanie string buildera - wzorzec Builder
        String string = stringBuilder
                .append("a")
                .append("a")
                .insert(1, "A")
                .toString();
    }
}
