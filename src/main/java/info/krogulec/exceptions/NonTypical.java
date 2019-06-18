package info.krogulec.exceptions;

/**
 * NIetypowa sytuacja, która może się znaleźć na egzaminie
 */
public class NonTypical {

    int getNumber(){
        int retValue = 10;

        try {
            String[] students = {"Jacek", "Placek"};
            students [3] = "Bolek";
        } catch (ArrayIndexOutOfBoundsException e){
            System.out.println("Almost returning: " + retValue );
            return retValue;
        } finally {
            retValue += 10;
            System.out.println("Returning " + retValue);
        }


        return retValue;
    }

    public static void main(String[] args) {
        NonTypical nonTypical = new NonTypical();
        System.out.println(nonTypical.getNumber());
    }
}
