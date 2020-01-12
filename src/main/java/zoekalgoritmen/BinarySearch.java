/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package zoekalgoritmen;

import java.util.Arrays;

/**
 *
 * @author danai
 */
public class BinarySearch extends Search {

    public BinarySearch() {
        super("Binary Search");
    }

    @Override
    public int search(int[] array, int value) {
        return binarySearch(array, 0, array.length, value);
    }

    public int binarySearch(int[] array, int start, int end, int value) {
        if (start < end) {

            int mid = start + (end - start) / 2;

            if (array[mid] > value) {
                return binarySearch(array, start, mid, value);
            } else if (array[mid] < value) {
                return binarySearch(array, mid + 1, end, value);
            } else {
                return mid;
            }
        }

        return -1;
    }
}
