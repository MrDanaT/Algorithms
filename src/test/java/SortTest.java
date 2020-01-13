/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import com.sun.scenario.effect.Merge;
import edu.ap.danati.sorteeralgoritmen.*;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Assert;
import static org.junit.Assert.assertArrayEquals;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

/**
 *
 * @author danai
 */
public class SortTest {

    public SortTest() {
    }

    @BeforeClass
    public static void setUpClass() {
    }

    @AfterClass
    public static void tearDownClass() {
    }

    @Before
    public void setUp() {
    }

    @After
    public void tearDown() {
    }

    @Test
    public void bubbleSortEmptyArray() {
        Array array = new Array(new int[]{});
        int[] toControl = array.sort(new Bubblesort());
        int[] controleArray = new int[]{};
        assertArrayEquals(controleArray, toControl);
    }

    @Test
    public void bubbleSortSingleArray() {
        Array array = new Array(new int[]{1});
        int[] toControl = array.sort(new Bubblesort());
        int[] controleArray = new int[]{1};
        assertArrayEquals(controleArray, toControl);
    }

    @Test
    public void bubbleSortDoubleSortedArray() {
        Array array = new Array(new int[]{1, 2});
        int[] toControl = array.sort(new Bubblesort());
        int[] controleArray = new int[]{1, 2};
        assertArrayEquals(controleArray, toControl);
    }

    @Test
    public void bubbleSortDoubleUnsortedArray() {
        Array array = new Array(new int[]{2, 1});
        int[] toControl = array.sort(new Bubblesort());
        int[] controleArray = new int[]{1, 2};
        assertArrayEquals(controleArray, toControl);
    }

    @Test
    public void bubbleSortTripleUnsortedArray() {
        Array array = new Array(new int[]{1, 3, 2});
        int[] toControl = array.sort(new Bubblesort());
        int[] controleArray = new int[]{1, 2, 3};
        assertArrayEquals(controleArray, toControl);
    }

    @Test
    public void bubbleSortTripleUnsorted2Array() {
        Array array = new Array(new int[]{2, 3, 1});
        int[] toControl = array.sort(new Bubblesort());
        int[] controleArray = new int[]{1, 2, 3};
        assertArrayEquals(controleArray, toControl);
    }

    @Test
    public void bubbleSortTripleUnsorted3Array() {
        Array array = new Array(new int[]{3, 2, 1});
        int[] toControl = array.sort(new Bubblesort());
        int[] controleArray = new int[]{1, 2, 3};
        assertArrayEquals(controleArray, toControl);
    }

    @Test
    public void bubbleSortTenUnsorted3Array() {
        Array array = new Array(new int[]{1, 2, 10, 3, 4, 5, 6});
        int[] toControl = array.sort(new Bubblesort());
        int[] controleArray = new int[]{1, 2, 3, 4, 5, 6, 10};
        assertArrayEquals(controleArray, toControl);
    }

    @Test
    public void insertionSortEmptyArray() {
        Array array = new Array(new int[]{});
        int[] toControl = array.sort(new Insertionsort());
        int[] controleArray = new int[]{};
        assertArrayEquals(controleArray, toControl);
    }

    @Test
    public void insertionSortSingleArray() {
        Array array = new Array(new int[]{1});
        int[] toControl = array.sort(new Insertionsort());
        int[] controleArray = new int[]{1};
        assertArrayEquals(controleArray, toControl);
    }

    @Test
    public void insertionSortDoubleSortedArray() {
        Array array = new Array(new int[]{1, 2});
        int[] toControl = array.sort(new Insertionsort());
        int[] controleArray = new int[]{1, 2};
        assertArrayEquals(controleArray, toControl);
    }

    @Test
    public void insertionSortDoubleUnsortedArray() {
        Array array = new Array(new int[]{2, 1});
        int[] toControl = array.sort(new Insertionsort());
        int[] controleArray = new int[]{1, 2};
        assertArrayEquals(controleArray, toControl);
    }

    @Test
    public void insertionSortTripleUnsortedArray() {
        Array array = new Array(new int[]{1, 3, 2});
        int[] toControl = array.sort(new Insertionsort());
        int[] controleArray = new int[]{1, 2, 3};
        assertArrayEquals(controleArray, toControl);
    }

    @Test
    public void insertionSortTripleUnsorted2Array() {
        Array array = new Array(new int[]{2, 3, 1});
        int[] toControl = array.sort(new Insertionsort());
        int[] controleArray = new int[]{1, 2, 3};
        assertArrayEquals(controleArray, toControl);
    }

    @Test
    public void insertionSortTripleUnsorted3Array() {
        Array array = new Array(new int[]{3, 2, 1});
        int[] toControl = array.sort(new Insertionsort());
        int[] controleArray = new int[]{1, 2, 3};
        assertArrayEquals(controleArray, toControl);
    }

    @Test
    public void insertionSortTenUnsorted3Array() {
        Array array = new Array(new int[]{1, 2, 10, 3, 4, 5, 6});
        int[] toControl = array.sort(new Insertionsort());
        int[] controleArray = new int[]{1, 2, 3, 4, 5, 6, 10};
        assertArrayEquals(controleArray, toControl);
    }

    @Test
    public void selectionSortEmptyArray() {
        Array array = new Array(new int[]{});
        int[] toControl = array.sort(new SelectionSort());
        int[] controleArray = new int[]{};
        assertArrayEquals(controleArray, toControl);
    }

    @Test
    public void selectionSortSingleArray() {
        Array array = new Array(new int[]{1});
        int[] toControl = array.sort(new SelectionSort());
        int[] controleArray = new int[]{1};
        assertArrayEquals(controleArray, toControl);
    }

    @Test
    public void selectionSortDoubleSortedArray() {
        Array array = new Array(new int[]{1, 2});
        int[] toControl = array.sort(new SelectionSort());
        int[] controleArray = new int[]{1, 2};
        assertArrayEquals(controleArray, toControl);
    }

    @Test
    public void selectionSortDoubleUnsortedArray() {
        Array array = new Array(new int[]{2, 1});
        int[] toControl = array.sort(new SelectionSort());
        int[] controleArray = new int[]{1, 2};
        assertArrayEquals(controleArray, toControl);
    }

    @Test
    public void selectionSortTripleUnsortedArray() {
        Array array = new Array(new int[]{1, 3, 2});
        int[] toControl = array.sort(new SelectionSort());
        int[] controleArray = new int[]{1, 2, 3};
        assertArrayEquals(controleArray, toControl);
    }

    @Test
    public void selectionSortTripleUnsorted2Array() {
        Array array = new Array(new int[]{2, 3, 1});
        int[] toControl = array.sort(new SelectionSort());
        int[] controleArray = new int[]{1, 2, 3};
        assertArrayEquals(controleArray, toControl);
    }

    @Test
    public void selectionSortTripleUnsorted3Array() {
        Array array = new Array(new int[]{3, 2, 1});
        int[] toControl = array.sort(new SelectionSort());
        int[] controleArray = new int[]{1, 2, 3};
        assertArrayEquals(controleArray, toControl);
    }

    @Test
    public void selectionSortTenUnsorted3Array() {
        Array array = new Array(new int[]{1, 2, 10, 3, 4, 5, 6});
        int[] toControl = array.sort(new SelectionSort());
        int[] controleArray = new int[]{1, 2, 3, 4, 5, 6, 10};
        assertArrayEquals(controleArray, toControl);
    }

    @Test
    public void quickSortEmptyArray() {
        Array array = new Array(new int[]{});
        int[] toControl = array.sort(new Quicksort());
        int[] controleArray = new int[]{};
        assertArrayEquals(controleArray, toControl);
    }

    @Test
    public void quickSortSingleArray() {
        Array array = new Array(new int[]{1});
        int[] toControl = array.sort(new Quicksort());
        int[] controleArray = new int[]{1};
        assertArrayEquals(controleArray, toControl);
    }

    @Test
    public void quickSortDoubleSortedArray() {
        Array array = new Array(new int[]{1, 2});
        int[] toControl = array.sort(new Quicksort());
        int[] controleArray = new int[]{1, 2};
        assertArrayEquals(controleArray, toControl);
    }

    @Test
    public void quickSortDoubleUnsortedArray() {
        Array array = new Array(new int[]{2, 1});
        int[] toControl = array.sort(new Quicksort());
        int[] controleArray = new int[]{1, 2};
        assertArrayEquals(controleArray, toControl);
    }

    @Test
    public void quickSortTripleUnsortedArray() {
        Array array = new Array(new int[]{1, 3, 2});
        int[] toControl = array.sort(new Quicksort());
        int[] controleArray = new int[]{1, 2, 3};
        assertArrayEquals(controleArray, toControl);
    }

    @Test
    public void quickSortTripleUnsorted2Array() {
        Array array = new Array(new int[]{2, 3, 1});
        int[] toControl = array.sort(new Quicksort());
        int[] controleArray = new int[]{1, 2, 3};
        assertArrayEquals(controleArray, toControl);
    }

    @Test
    public void quickSortTripleUnsorted3Array() {
        Array array = new Array(new int[]{3, 2, 1});
        int[] toControl = array.sort(new Quicksort());
        int[] controleArray = new int[]{1, 2, 3};
        assertArrayEquals(controleArray, toControl);
    }

    @Test
    public void quickSortTenUnsorted3Array() {
        Array array = new Array(new int[]{1, 2, 10, 3, 4, 5, 6});
        int[] toControl = array.sort(new Quicksort());
        int[] controleArray = new int[]{1, 2, 3, 4, 5, 6, 10};
        assertArrayEquals(controleArray, toControl);
    }

    @Test
    public void mergeSortEmptyArray() {
        Array array = new Array(new int[]{});
        int[] toControl = array.sort(new Mergesort());
        int[] controleArray = new int[]{};
        assertArrayEquals(controleArray, toControl);
    }

    @Test
    public void mergeSortSingleArray() {
        Array array = new Array(new int[]{1});
        int[] toControl = array.sort(new Mergesort());
        int[] controleArray = new int[]{1};
        assertArrayEquals(controleArray, toControl);
    }

    @Test
    public void mergeSortDoubleSortedArray() {
        Array array = new Array(new int[]{1, 2});
        int[] toControl = array.sort(new Mergesort());
        int[] controleArray = new int[]{1, 2};
        assertArrayEquals(controleArray, toControl);
    }

    @Test
    public void mergeSortDoubleUnsortedArray() {
        Array array = new Array(new int[]{2, 1});
        int[] toControl = array.sort(new Mergesort());
        int[] controleArray = new int[]{1, 2};
        assertArrayEquals(controleArray, toControl);
    }

    @Test
    public void mergeSortTripleUnsortedArray() {
        Array array = new Array(new int[]{1, 3, 2});
        int[] toControl = array.sort(new Mergesort());
        int[] controleArray = new int[]{1, 2, 3};
        assertArrayEquals(controleArray, toControl);
    }

    @Test
    public void mergeSortTripleUnsorted2Array() {
        Array array = new Array(new int[]{2, 3, 1});
        int[] toControl = array.sort(new Mergesort());
        int[] controleArray = new int[]{1, 2, 3};
        assertArrayEquals(controleArray, toControl);
    }

    @Test
    public void mergeSortTripleUnsorted3Array() {
        Array array = new Array(new int[]{3, 2, 1});
        int[] toControl = array.sort(new Mergesort());
        int[] controleArray = new int[]{1, 2, 3};
        assertArrayEquals(controleArray, toControl);
    }

    @Test
    public void mergeSortTenUnsorted3Array() {
        Array array = new Array(new int[]{1, 2, 10, 3, 4, 5, 6});
        int[] toControl = array.sort(new Mergesort());
        int[] controleArray = new int[]{1, 2, 3, 4, 5, 6, 10};
        assertArrayEquals(controleArray, toControl);
    }
}
