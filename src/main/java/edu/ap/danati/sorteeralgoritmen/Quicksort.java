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
public class Quicksort extends Sort {

    public Quicksort() {
        super("Quicksort");
    }

    @Override
    public void sort(int[] array) {
        quicksort(array, 0, array.length - 1);
    }

    public void quicksort(int[] arr, int lo, int hi) {
        int pivot = lo + (hi - lo) / 2;
        int i = lo, j = hi;

        while (i <= j) {
            while (arr[i] < arr[pivot]) {
                i++;
            }
            while (arr[j] > arr[pivot]) {
                j--;
            }

            if (i <= j) {
                swap(arr, i, j);
                j--;
                i++;
            }
        }

        if (i < hi) {
            quicksort(arr, i, hi);
        }
        if (j > lo) {
            quicksort(arr, lo, j);
        }
    }

}
