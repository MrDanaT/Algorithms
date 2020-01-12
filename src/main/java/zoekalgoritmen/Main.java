/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package zoekalgoritmen;

import com.sun.java.swing.plaf.windows.WindowsTreeUI;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 *
 * @author danai
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        List<Search> algoritmes = new ArrayList<Search>(Arrays.asList(new LinearSearchForLoop(), new LinearSearchWhileLoop(), new BinarySearch(), new LinearSearchForLoopOptimized(), new LinearSearchWhileLoopOptimized()));
//        Array array = new Array(new int[]{1, 3, 5, 2, 1, 7, 4, 8, 2, 4, 5, 7, 1, 5});
        Array array = new Array(new int[]{3, 5, 6, 8, 11, 12, 14, 15, 17, 18});
        array.sort();

        for (Search algo : algoritmes) {
            System.out.println(array.search(algo, 7));
        }

        Collections.sort(algoritmes);
        for (Search algo : algoritmes) {
            System.out.println(algo);
        }
    }

}
