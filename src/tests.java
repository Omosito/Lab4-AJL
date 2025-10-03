/*
 * Author: Alex Leininger
 * Date: 10/1/2025
 * Description: Lab 4 - 16 specified unit tests to test the methods in the methods class
 * Bugs: None known
 * Reflection: 
 */

import static org.junit.Assert.*;
import org.junit.Test;

import lab4.methods;

public class tests {
    @Test
    public void testNumZeroPairSums1() {
        methods numZeroPairSums = new methods();
        int[] arr;
        arr = new int[] { 50, 40, 30, 20, 10 };
        int expected = 0;
        int actual = numZeroPairSums.numZeroPairsSums(arr);
        assertEquals(expected, actual);

    }

    @Test
    public void testNumZeroPairSums2() {
        methods numZeroPairSums = new methods();
        int[] arr;
        arr = new int[] { 10, 15, 20, 30, -20, 40, 50 };
        int expected = 1;
        int actual = numZeroPairSums.numZeroPairsSums(arr);
        assertEquals(expected, actual);

    }

    @Test
    public void testNumZeroPairSums3() {
        methods numZeroPairSums = new methods();
        int[] arr;
        arr = new int[] { 10, 15, 20, -10, 30, -15 };
        int expected = 2;
        int actual = numZeroPairSums.numZeroPairsSums(arr);
        assertEquals(expected, actual);

    }

    @Test
    public void testNumZeroPairSums4() {
        methods numZeroPairSums = new methods();
        int[] arr;
        arr = new int[] { 10, 51, -10, 40, 80, 94, 17, -80, -40 };
        int expected = 3;
        int actual = numZeroPairSums.numZeroPairsSums(arr);
        assertEquals(expected, actual);

    }

    @Test
    public void testNumZeroPairSumsSpeedy1() {
        methods numZeroPairSumsSpeedy = new methods();
        int[] arr;
        arr = new int[] { 50, 40, 30, 20, 10 };
        int expected = 0;
        int actual = numZeroPairSumsSpeedy.numZeroPairSumsSpeedy(arr);
        assertEquals(expected, actual);
    }

    @Test
    public void testNumZeroPairSumsSpeedy2() {
        methods numZeroPairSumsSpeedy = new methods();
        int[] arr;
        arr = new int[] { 10, 15, 20, 30, -20, 40, 50 };
        int expected = 1;
        int actual = numZeroPairSumsSpeedy.numZeroPairSumsSpeedy(arr);
        assertEquals(expected, actual);
    }

    @Test
    public void testNumZeroPairSumsSpeedy3() {
        methods numZeroPairSumsSpeedy = new methods();
        int[] arr;
        arr = new int[] { 10, 15, 20, -10, 30, -15 };
        int expected = 2;
        int actual = numZeroPairSumsSpeedy.numZeroPairSumsSpeedy(arr);
        assertEquals(expected, actual);
    }

    @Test
    public void testNumZeroPairSumsSpeedy4() {
        methods numZeroPairSumsSpeedy = new methods();
        int[] arr;
        arr = new int[] { 10, 51, -10, 40, 80, 94, 17, -80, -40 };
        int expected = 3;
        int actual = numZeroPairSumsSpeedy.numZeroPairSumsSpeedy(arr);
        assertEquals(expected, actual);
    }

    @Test
    public void testNumZeroTripletSums1() {
        methods numZeroTripletSums = new methods();
        int[] arr;
        arr = new int[] { 20, 30, 40, 50 };
        int expected = 0;
        int actual = numZeroTripletSums.numZeroTripletSums(arr);
        assertEquals(expected, actual);

    }

    @Test
    public void testNumZeroTripletSums2() {
        methods numZeroTripletSums = new methods();
        int[] arr;
        arr = new int[] { 41, 11, 69, 5, 308, 425, -3, 500, -2 };
        int expected = 1;
        int actual = numZeroTripletSums.numZeroTripletSums(arr);
        assertEquals(expected, actual);

    }

    @Test
    public void testNumZeroTripletSums3() {
        methods numZeroTripletSums = new methods();
        int[] arr;
        arr = new int[] { -10, -200, -5, 15, 300, -100, 44, 69 };
        int expected = 2;
        int actual = numZeroTripletSums.numZeroTripletSums(arr);
        assertEquals(expected, actual);

    }

    @Test
    public void testNumZeroTripletSums4() {
        methods numZeroTripletSums = new methods();
        int[] arr;
        arr = new int[] { -2, -300, -200, -3, 500, -30, -20, 50, 5 };
        int expected = 3;
        int actual = numZeroTripletSums.numZeroTripletSums(arr);
        assertEquals(expected, actual);

    }

    @Test
    public void testNumZeroTripletSumsSpeedy1() {
        methods numZeroTripletSumsSpeedy = new methods();
        int[] arr;
        arr = new int[] { 20, 30, 40, 50 };
        int expected = 0;
        int actual = numZeroTripletSumsSpeedy.numZeroTripletSumsSpeedy(arr);
        assertEquals(expected, actual);

    }

    @Test
    public void testNumZeroTripletSumsSpeedy2() {
        methods numZeroTripletSumsSpeedy = new methods();
        int[] arr;
        arr = new int[] { 41, 11, 69, 5, 308, 425, -3, 500, -2 };
        int expected = 1;
        int actual = numZeroTripletSumsSpeedy.numZeroTripletSumsSpeedy(arr);
        assertEquals(expected, actual);

    }

    @Test
    public void testNumZeroTripletSumsSpeedy3() {
        methods numZeroTripletSumsSpeedy = new methods();
        int[] arr;
        arr = new int[] { -10, -200, -5, 15, 300, -100, 44, 69 };
        int expected = 2;
        int actual = numZeroTripletSumsSpeedy.numZeroTripletSumsSpeedy(arr);
        assertEquals(expected, actual);

    }

    @Test
    public void testNumZeroTripletSumsSpeedy4() {
        methods numZeroTripletSumsSpeedy = new methods();
        int[] arr;
        arr = new int[] { -2, -300, -200, -3, 500, -30, -20, 50, 5 };
        int expected = 3;
        int actual = numZeroTripletSumsSpeedy.numZeroTripletSumsSpeedy(arr);
        assertEquals(expected, actual);

    }

}
