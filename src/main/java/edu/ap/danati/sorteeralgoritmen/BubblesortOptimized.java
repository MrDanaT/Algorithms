/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.ap.danati.sorteeralgoritmen;

/**
 *
 * @author danai
 */
public class BubblesortOptimized extends Sort {

    public BubblesortOptimized() {
        super("Bubblesort optimized");
    }

    @Override
    public int[] sort(int[] array) {
        boolean swapped;
        for (int i = 0; i < array.length; i++) {
            swapped = true;
            for (int j = 1; j < array.length - i; j++) {
                if (array[j] < array[j - 1]) {
                    swap(array, j, j - 1);
                    swapped = false;
                }
            }

            if (swapped) {
                break;
            }

        }

        return array;
    }

}
