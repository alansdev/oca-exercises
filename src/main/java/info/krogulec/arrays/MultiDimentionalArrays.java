package info.krogulec.arrays;

import info.krogulec.Utils;

public class MultiDimentionalArrays {

    public static void main(String[] args) {
        //tablica - inicjalizacja poprzez podanie pustej wartości w nawiasach
        int [][] ints = new int[][]{};

        //co się stanie po uruchomieniu?
//        ints[1][1] = 4;

        //tablica - inicjalizacja poprzez podanie ilości elementów
        byte [] bytes [] = new byte[2][];

        // co się stanie?
//        bytes[0] = new byte[]{1,2};

        //inicjalizacja tablicy trzywymiarowej
        int [][][] i3 = new int[1][][];

        //tablica - podanie jednocześnie ilości elementów oraz nawiasów klamrowych uniemożliwia kompilację
//        char [][] chars = new char[2][]{};

        Utils.breakingParts("Obliczenie rozmiaru tablicy");
        arraysSizes();

        Utils.breakingParts("Iterowanie po tablicach");
        iterating();

    }

    /**
     * Cwiczenie - iterowanie po tablicy wielowymiarowej
     */
    private static void iterating() {
        int [][] ints = new int[][]{{1,2,3},{9,8}};

        for (int i = 0 ; i < 2 ; i++) {
            for (int j = 0 ; j< ints[i].length ; j++){
                System.out.println("Pętla for, element: " + ints[i][j]);
            }
        }

        for(int[] i1 : ints){
            for (int i : i1){
                System.out.println("Pętla foreach, element: " + i);
            }
        }

        int i = 0;
        while (i < ints.length){
            int j = 0;
            while (j < ints[i].length){
                System.out.println("Pętla while, element: " + ints[i][j]);
                j++;
            }
            i++;
        }

        i = 0;
        do{
            int j = 0;
            do {
                System.out.println("Pętla do-while, element: " + ints[i][j]);
                j++;
            }while (j < ints[i].length);
            i++;
        }while (i < ints.length);

    }

    /**
     * Jakie będą rozmiary poszczególnych tablic? Ile elementów się do nich zmieści?
     */
    private static void arraysSizes() {

        // ?
        int [][] ints = new int[10][];
        System.out.println(ints.length);

        // ?
        int [][] ints2 = new int[][]{{1,2,3},{1,2}};
        System.out.println(ints2.length);

    }
}
