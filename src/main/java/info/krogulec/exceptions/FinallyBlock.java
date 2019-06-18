package info.krogulec.exceptions;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/**
 * Wykorzystanie bloku finally
 */
public class FinallyBlock {

    public static void main(String[] args) {
        FileReader reader = null;
        try {
            reader = new FileReader("D:\\java.txt");
        } catch (FileNotFoundException e) {
            System.out.println("Error during constructing reader");
            e.printStackTrace();

            //return nie uchroni przed wejściem do finally
            return;
        } catch (IOException e){
            //wyjątkki bardziej ogólne muszą być po szczególnych
        }finally {
            System.out.println("Finally block...");
                if (reader != null) {
                    try {
                        reader.close();
                    } catch (IOException e) {
                        System.out.println("Something went wrong during close");
                }
            }
        }


        try {
            int a = 12;
        } finally {
            //blok finally jest wykonywany niezależnie od tego, czy w try będzie rzucony wyjątek
            System.out.println("Kończę zadanie. Blok catch nie jest wymagany");
        }
    }
}

