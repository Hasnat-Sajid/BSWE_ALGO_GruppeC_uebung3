package org.fh.Impl;

import org.fh.Interfaces.SortAlgorithm;

/**
 * Implementation of the Counting Sort algorithm.
 * This class implements the SortAlgorithm interface and provides
 * a sorting method based on the Counting Sort technique.
 */
public class CountingSort implements SortAlgorithm {

    /**
     * Sorts an array of integers using the Counting Sort algorithm.
     * This method handles sorting an array in ascending order. It first
     * finds the maximum value to determine the range of counting, then
     * performs the sorting logic.
     *
     * @param array The array to be sorted.
     * @return The sorted array.
     */
    @Override
    public int[] sort(int[] array) {

        // falls das array leer ist, return das array einfach
        if (array == null || array.length == 0) {
            return array;
        }

        // das Maximum finden um die Größe des Arrays zu bestimmen
        int max = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
            }
        }

        // einfach das array initialisieren
        int[] countArray = new int[max + 1];

        // die Elemente zählen
        for (int i : array) {
            countArray[i]++;
        }

        // die eigentliche sortier logik
        int arrayIndex = 0;
        for (int i = 0; i < countArray.length; i++) {
            while (countArray[i] > 0) {
                array[arrayIndex++] = i;
                countArray[i]--;
            }
        }

        return array;
    }
}
