package org.fh.Impl;

import org.fh.Interfaces.SortAlgorithm;

/**
 * Implementation of the Bubble Sort algorithm.
 * This class implements the SortAlgorithm interface and provides
 * a sorting method based on the Bubble Sort technique.
 */
public class BubbleSort implements SortAlgorithm {

    /**
     * Sorts an array of integers using the Bubble Sort algorithm.
     * This method handles sorting an array in ascending order by repeatedly
     * swapping adjacent elements if they are in the wrong order.
     *
     * @param input The input array to be sorted.
     * @return The sorted array.
     */
    @Override
    public int[] sort(int[] input) {
        // falls das array leer ist, return das array einfach
        if (input == null || input.length == 0) {
            return input;
        }

        int inputLength = input.length;
        boolean swapped;

        // wiederhole für die gesamte Länge des Arrays
        for (int i = 0; i < inputLength - 1; i++) {
            swapped = false;

            // durchlaufe das Array und tausche Elemente, falls nötig
            for (int j = 0; j < inputLength - i - 1; j++) {
                if (input[j] > input[j + 1]) {
                    // tausche input[j] und input[j+1]
                    int temp = input[j];
                    input[j] = input[j + 1];
                    input[j + 1] = temp;
                    swapped = true;
                }
            }

            // Wenn während eines Durchlaufs kein Tausch stattfand,
            // ist das Array sortiert und die Schleife kann abgebrochen werden.
            if (!swapped){
                break;
            }
        }

        return input;
    }
}