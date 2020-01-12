/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package zoekalgoritmen;

/**
 *
 * @author danai
 */
public class LinearSearchWhileLoopOptimized extends Search {

    public LinearSearchWhileLoopOptimized() {
        super("Lineair Search While-Loop Optimized");
    }

    @Override
    public int search(int[] array, int value) {
        int idx = 0;
        boolean found = false;

        while (!found && idx < array.length && array[idx] <= value) {
            if (array[idx] == value) {
                found = true;
            } else {
                idx++;
            }
        }

        if (found) {
            return idx;
        } else {
            return -1;
        }
    }
}
