import static org.junit.Assert.*;
import org.junit.Test;
import methods.*;

public class tests {
    @Test
    public void testNumZeroPairSums() {
        numZeroPairSums numZeroPairSums = new numZeroPairSums();
        int[] arr;
        arr = new int[] { 10, 3, 18, -10, -3, 4 };
        int expected = 2;
        int actual = numZeroPairSums.nZP(arr);
        assertEquals(expected, actual);

    }
}
