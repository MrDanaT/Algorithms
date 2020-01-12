/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package zoekalgoritmen;

import java.util.Random;

/**
 *
 * @author danai
 */
public abstract class Search implements Comparable<Search> {

    private static final Random RANDOM = new Random();

    private final String name;
    private long duration;

    public Search(String name) {
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

    public int init(int[] array, int value) {
        int result;
        long start = System.nanoTime();
        result = search(array, value);
        long end = System.nanoTime() - start;
        this.setDuration(end);
        return result;
    }

    public abstract int search(int[] array, int value);

    @Override
    public int compareTo(Search o) {
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
