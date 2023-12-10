import org.fh.Impl.CountingSort;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class CountingSortTest {

    @Test
    public void testSort() {
        CountingSort countingSort = new CountingSort();
        assertArrayEquals(new int[]{1, 2, 2, 3, 3, 4, 8}, countingSort.sort(new int[]{4, 2, 2, 8, 3, 3, 1}));
        assertArrayEquals(new int[]{}, countingSort.sort(new int[]{})); // testen mit leerem Array
        assertArrayEquals(new int[]{1}, countingSort.sort(new int[]{1})); // testen mit einem Element
    }
}
