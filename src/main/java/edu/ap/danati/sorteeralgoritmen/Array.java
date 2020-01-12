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
public class Array {

    private int[] array;

    public Array(int[] array) {
        this.array = array;
    }

    public int[] getArray() {
        return array;
    }

    public void setArray(int[] array) {
        this.array = array;
    }

    public void sort(Sort algoritme) {
        algoritme.init(array);
    }

    @Override
    public String toString() {
        StringBuilder result = new StringBuilder();

        for (int i : array) {
            result.append(i).append(" - ");
        }

        return result.toString();
    }
}
