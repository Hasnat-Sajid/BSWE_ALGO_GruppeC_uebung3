package org.fh;

import org.fh.Impl.CountingSort;
import org.fh.Interfaces.SortAlgorithm;
import org.fh.Util.FileReaderUtil;

/**
 * Main class for demonstrating the Counting Sort algorithm.
 * This class reads an array of integers from a file, sorts them using
 * the Counting Sort algorithm, and prints the sorted array.
 */
public class Main {
    public static void main(String[] args) {
        // pfad zur digits.txt Datei
        String filePath = "src/main/resources/digits.txt";

        // einlesen der Zahlen
        int[] array = FileReaderUtil.readNumbersFromFile(filePath);

        // das sortieren mittels der klasse
        SortAlgorithm algorithm = new CountingSort();
        array = algorithm.sort(array);

        // ausgabe
        System.out.println("Sortiertes Array: ");
        for (int i : array) {
            System.out.print(i + " ");
        }
    }
}

