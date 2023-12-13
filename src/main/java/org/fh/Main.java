package org.fh;

import org.fh.Impl.BubbleSort;
import org.fh.Impl.CountingSort;
import org.fh.Interfaces.SortAlgorithm;
import org.fh.Util.FileReaderUtil;

/**
 * Main class for demonstrating the Counting Sort and Bubble Sort algorithm.
 * This class reads an array of integers from a file, sorts then using
 * the Counting Sort and Bubble Sort algorithm, and prints the sorted array.
 */
public class Main {
    public static void main(String[] args) {
        // pfad zur digits.txt Datei
        String filePath = "src/main/resources/digits.txt";

        // einlesen der Zahlen
        int[] array = FileReaderUtil.readNumbersFromFile(filePath);

        // das sortieren mittels der klasse
        SortAlgorithm countingSort = new CountingSort();
        int[] sortedWithCounting = countingSort.sort(array);

        // ausgabe
        System.out.println("Sortiertes Array mit Counting Sort: ");
        for (int i : sortedWithCounting) {
            System.out.print(i + " ");
        }

        System.out.println();
        System.out.println();
        System.out.println();

        SortAlgorithm bubbleSort = new BubbleSort();
        int[] sortedWithBubble = bubbleSort.sort(array);

        // ausgabe
        System.out.println("Sortiertes Array mit Bubble Sort: ");
        for (int i : sortedWithBubble) {
            System.out.print(i + " ");
        }
    }
}

