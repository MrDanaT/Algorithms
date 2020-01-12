/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.ap.danati.testproject2;

import java.util.Arrays;

/**
 *
 * @author danai
 */
public class Mergesort extends Sort {

    public Mergesort() {
        super("Mergesort");
    }

    @Override
    public void sort(int[] array) {
        mergesort(array);
    }

    public void mergesort(int[] arr) {
        if (arr.length <= 1) {
            return;
        }

        int mid = arr.length/ 2;

        int[] arr1 = Arrays.copyOf(arr, mid);
        int[] arr2 = Arrays.copyOfRange(arr, mid, arr.length);

        mergesort(arr1);
        mergesort(arr2);

        merge(arr, arr1, arr2);
    }

    public void merge(int[] arr, int[] arr1, int[] arr2) {
        int cResult, c1, c2;
        cResult = c1 = c2 = 0;

        while (c1 < arr1.length && c2 < arr2.length) {
            if (arr1[c1] <= arr2[c2]) {
                arr[cResult] = arr1[c1++];
            } else {
                arr[cResult] = arr2[c2++];
            }
            cResult++;
        }

        while (c1 < arr1.length) {
            arr[cResult] = arr1[c1++];
            cResult++;
        }
        while (c2 < arr2.length) {
            arr[cResult] = arr2[c2++];
            cResult++;
        }
    }
}
