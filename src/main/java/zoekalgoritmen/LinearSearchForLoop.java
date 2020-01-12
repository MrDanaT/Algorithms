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
public class LinearSearchForLoop extends Search {

    public LinearSearchForLoop() {
        super("Linear Search For-Loop");
    }

    @Override
    public int search(int[] array, int value) {
        int idx = -1;

        for (int i = 0; i < array.length; i++) {
            if (array[i] == value) {
                return i;
            }
        }

        return idx;
    }

}
