package edu.ap.danati.sorteeralgoritmen;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 *
 * @author danai
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        List<Sort> algoritmes = new ArrayList<>();

        algoritmes.add(new Bubblesort());
        algoritmes.add(new SelectionSort());
        algoritmes.add(new Insertionsort());
        algoritmes.add(new Quicksort());
        algoritmes.add(new Mergesort());
        algoritmes.add(new BubblesortOptimized());
        algoritmes.add(new QuicksortOptimized());

        int[] arr = new int[1000];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int) (Math.random() * 100);
        }

        final Array array = new Array(arr);
        algoritmes.forEach((algo) -> {
            array.sort(algo);
        });

        Collections.sort(algoritmes);

        algoritmes.forEach((algo) -> System.out.println(algo));
    }

}
