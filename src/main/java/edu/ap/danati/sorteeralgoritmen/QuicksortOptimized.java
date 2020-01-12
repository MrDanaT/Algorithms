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
public class QuicksortOptimized extends Sort {

    public QuicksortOptimized() {
        super("Quicksort optimized");
    }

    @Override
    public void sort(int[] array) {
        quicksort(array, 0, array.length - 1);
    }

    public void quicksort(int[] arr, int lo, int hi) {
        if (hi - lo <= 5) {
            insertion(arr, lo, hi);
        } else {

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

    public void insertion(int[] arr, int start, int end) {
        for (int i = start; i < end; i++) {
            for (int j = i; j > start; j--) {
                if (arr[j] > arr[j - 1]) {
                    swap(arr, j, j - 1);
                }
            }

        }
    }

}
