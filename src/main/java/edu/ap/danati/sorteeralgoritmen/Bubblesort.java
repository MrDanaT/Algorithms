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
public class Bubblesort extends Sort {

    public Bubblesort() {
        super("Bubblesort");
    }

    @Override
    public void sort(int[] array) {

        for (int i = 0; i < array.length; i++) {
            for (int j = 1; j < array.length - i; j++) {
                if (array[j - 1] > array[j]) {
                    swap(array, j - 1, j);
                }

            }
        }
    }
}
