/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.ap.danati.testproject2;

import java.util.Random;

/**
 *
 * @author danai
 */
public abstract class Sort implements Comparable<Sort> {

    private static final Random RANDOM = new Random();

    private final String name;
    private long duration;

    public Sort(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public long getDuration() {
        return duration;
    }

    public void setDuration(long duration) {
        this.duration = duration;
    }

    public static void swap(int arr[], int idx1, int idx2) {
        int tmp = arr[idx1];
        arr[idx1] = arr[idx2];
        arr[idx2] = tmp;
    }

    public static void shuffle(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            swap(arr, RANDOM.nextInt(arr.length), i);
        }

    }

    public void init(int[] array) {
        int[] copy = array.clone();
        long start = System.nanoTime();
        sort(copy);
        long end = System.nanoTime() - start;
        this.setDuration(end);
    }

    public abstract void sort(int[] array);

    @Override
    public int compareTo(Sort o) {
        if (o == null) {
            return 1;
        }

        int result = Long.compare(this.duration, o.duration);

        return result;
    }

    @Override
    public String toString() {
        return this.name + " - " + this.duration;
    }

}
