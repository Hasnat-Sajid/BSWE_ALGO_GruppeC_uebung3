package org.fh.Util;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class FileReaderUtil {

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
