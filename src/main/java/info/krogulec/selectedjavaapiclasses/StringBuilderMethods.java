package info.krogulec.selectedjavaapiclasses;

public class StringBuilderMethods {

    public static void main(String[] args) {
        StringBuilder stringBuilder = new StringBuilder();


        stringBuilder.append("java");
        System.out.println(stringBuilder);

        stringBuilder.append("java");
        System.out.println(stringBuilder);

        stringBuilder.insert(1, "P");
        System.out.println(stringBuilder);

        stringBuilder.delete(0,2); //zawsze pierwszy wchodzi, drugi nie
        System.out.println(stringBuilder);

        stringBuilder.deleteCharAt(1);
        System.out.println(stringBuilder);

        stringBuilder.append("    ");
        System.out.println(stringBuilder);

        stringBuilder.trimToSize();
        System.out.println(stringBuilder);

        stringBuilder.replace(0,2,"BB");
        System.out.println(stringBuilder);

        CharSequence charSequence = stringBuilder.subSequence(1, 3);//jak substring, ale zwraca subsequence i jako jedna z nielicznych nie modyfikuje zmiennej
        System.out.println(charSequence);
        System.out.println(stringBuilder);
    }
}
