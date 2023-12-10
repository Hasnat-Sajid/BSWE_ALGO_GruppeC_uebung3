import org.fh.Impl.CountingSort;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

/**
 * Test class for the CountingSort implementation.
 * This class contains unit tests that verify the functionality
 * of the CountingSort algorithm under various conditions.
 */
public class CountingSortTest {

    /**
     * Tests the sort method of CountingSort.
     * This test checks the correctness of the sorting algorithm with different types of input:
     * a general case with a mix of numbers, an empty array, and an array with a single element.
     */
    @Test
    public void testSort() {
        CountingSort countingSort = new CountingSort();
        assertArrayEquals(new int[]{1, 2, 2, 3, 3, 4, 8}, countingSort.sort(new int[]{4, 2, 2, 8, 3, 3, 1}));
        assertArrayEquals(new int[]{}, countingSort.sort(new int[]{})); // testen mit leerem Array
        assertArrayEquals(new int[]{1}, countingSort.sort(new int[]{1})); // testen mit einem Element
    }
}
