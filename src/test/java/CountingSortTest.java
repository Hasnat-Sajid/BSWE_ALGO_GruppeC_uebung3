import org.fh.Impl.CountingSort;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

/**
 * Test class for the CountingSort implementation.
 * This class contains unit tests that verify the functionality
 * of the CountingSort algorithm under various conditions.
 *
 * Unit test naming convention: MethodName_StateUnderTest_ExpectedBehavior
 */
public class CountingSortTest {
    private final CountingSort countingSort = new CountingSort();

    @Test
    public void sort_UnsortedArray_SortedArray() {
        assertArrayEquals(new int[]{1, 2, 2, 3, 3, 4, 8}, countingSort.sort(new int[]{4, 2, 2, 8, 3, 3, 1}));
    }

    @Test
    public void sort_EmptyArray_EmptyArray() {
        assertArrayEquals(new int[]{}, countingSort.sort(new int[]{}));
    }

    @Test
    public void sort_SingleElement_SingleElement() {
        assertArrayEquals(new int[]{1}, countingSort.sort(new int[]{1}));
    }
}
