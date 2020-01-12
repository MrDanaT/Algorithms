/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.ap.danati.testproject2;

/**
 *
 * @author danai
 */
public class Insertionsort extends Sort {

    public Insertionsort() {
        super("Insertionsort");
    }

    @Override
    public void sort(int[] array) {
        for (int i = 1; i < 10; i++) {
            for (int j = i; j > 0; j--) {
                if (array[j] < array[j - 1]) {
                    swap(array, j, j - 1);
                }
            }
        }

    }

}
