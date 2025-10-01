import static org.junit.Assert.*;
import org.junit.Test;

public class tests {
    @Test
    public void testNumZeroPairSums() {
        methods numZeroPairSums = new methods();
        int[] arr;
        arr = new int[] { 10, 3, 18, -10, -3, 4 };
        int expected = 2;
        int actual = numZeroPairSums.numZeroPairsSums(arr);
        assertEquals(expected, actual);

    }

    @Test
    public void testNumZeroPairSumsSpeedy() {
        methods numZeroPairSumsSpeedy = new methods();
        int[] arr;
        arr = new int[] { 10, 3, 18, -10, -3, 4 };
        int expected = 2;
        int actual = numZeroPairSumsSpeedy.numZeroPairSumsSpeedy(arr);
        assertEquals(expected, actual);
    }

    @Test
    public void testBinarySearch() {
        methods binarySearch = new methods();
        int[] arr;
        arr = new int[] { 1, 3, 6, 8, 9, 14, 21, 63, 100 };
        int find = 63;
        int expected = 7;
        int actual = binarySearch.binarySearch(arr, find);
        assertEquals(expected, actual);
    }
}
