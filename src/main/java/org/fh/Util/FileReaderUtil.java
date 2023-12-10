package org.fh.Util;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * Utility class for reading numbers from a file.
 * This class provides a method to read integers from a file where
 * integers are separated by semicolons.
 */
public class FileReaderUtil {

    /**
     * Reads integers from a file and returns them as an array.
     * Each line in the file should have integers separated by semicolons.
     * Example of file content:
     * 1;2;3
     * 4;5;6
     *
     * @param filePath the path of the file to read.
     * @return an array of integers read from the file.
     */
    public static int[] readNumbersFromFile(String filePath) {
        List<Integer> numbers = new ArrayList<>();

        try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
            String line;
            while ((line = reader.readLine()) != null) {
                String[] tokens = line.split(";");
                for (String token : tokens) {
                    numbers.add(Integer.parseInt(token.trim()));
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        // Konvertieren der Liste in ein Array
        return numbers.stream().mapToInt(i -> i).toArray();
    }
}
