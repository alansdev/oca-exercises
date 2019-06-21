package info.krogulec.arrays;

import java.util.Arrays;

public class SortingAndSearching {

    public static void main(String[] args) {
        int [] numbers = {2,3,1,6,5,4,9};

        //sortowanie
        Arrays.sort(numbers);

        System.out.println(Arrays.toString(numbers));

        //binary search musi działać na posortowanej tablicy!!!
        int i = Arrays.binarySearch(numbers, 4);

        //szukanie - zwraca indeks szukanej liczby, albo indeks, gdzie taki element by pasował ze znakiem ujemnym -1
        System.out.println(i);

        System.out.println(Arrays.binarySearch(numbers, 8));


    }
}
