package info.krogulec.flowcontrol;

public class WhileAndDoWhile {

    private static int age = 40;

    public static void main(String[] args) {
        //standardowa pętla while - warunek musi być spełniony, żeby wejść do pętli
        while (age < 50){
            System.out.println("not so old :)" + age);
            age++; //trzeba pamiętać - bez tego pętla będzie nieskończona
        }

        while (age == 40){
            //nie wejdzie do pętli bo wyrażenie jest true - musi być false, żeby pętla wykonała się przynajmniej raz
            System.out.println("do something");
        }

        //pętla do while pozwoli na przynajmniej jedno wykonanie
        do {
            //ta pętla przy nie spełnionym warunku wykona kod przynajmneij raz
            System.out.println("do while");
        } while ((age == 40));
    }
}
