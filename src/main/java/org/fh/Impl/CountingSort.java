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

        // das Maximum finden um die Größe des Arrays zu bestimmen
        int max = input[0];
        for (int i = 1; i < inputLength; i++) {
            if (input[i] > max) {
                max = input[i];
            }
        }

        // einfach das array initialisieren
        int[] countArray = new int[max + 1];

        // die Elemente zählen
        for (int i : input) {
            countArray[i]++;
        }

        //kumulative summe von den Elementen
        for(int i = 1; i <= countArray.length-1; i++){
            countArray[i] += countArray[i-1];
        }

        int[] outputArray = new int[inputLength];

        //vom ende weg iterieren, damit der Algorithmus stabil bleibt
        for(int i = inputLength-1; i >= 0; i--){
            outputArray[countArray[input[i]]-1] = input[i];
            countArray[input[i]]--;
        }

        return outputArray;
    }
}
