package lab4;

import java.util.Arrays;

public class methods {

    public int numZeroPairsSums(int[] arr) {
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] + arr[j] == 0) {
                    count++;
                }
            }
        }
        return count;
    }

    public int numZeroPairSumsSpeedy(int[] arr) {
        int count = 0;
        Arrays.sort(arr);

        for (int i = 0; i < arr.length; i++) {
            int index = binarySearch(arr, -arr[i]);
            if (index > i) {
                count++;

            }
        }
        return count;
    }

    public int numZeroTripletSums(int[] arr) {
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                for (int k = j + 1; k < arr.length; k++) {

                    if (arr[i] + arr[j] + arr[k] == 0) {
                        count++;
                    }
                }
            }
        }

        return count;
    }

    public int numZeroTripletSumsSpeedy(int[] arr) {
        int count = 0;
        Arrays.sort(arr);

        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                int x = -arr[i] - arr[j];
                int index = binarySearch(arr, x);
                System.out.println(index);
                if (index > j) {
                    count++;
                }
            }
        }

        return count;
    }

    public int binarySearch(int[] arr, int key) {
        int min = 0;
        int max = arr.length - 1;
        int mid = max / 2;
        boolean found = false;

        while (min <= max) {
            if (arr[mid] == key) {
                found = true;
                break;
            } else if (arr[mid] < key) {
                min = mid + 1;
                mid = (max + min) / 2;

            } else {
                max = mid - 1;
                mid = (max + min) / 2;
            }
        }

        if (!found) {
            return -1;
        } else {
            return mid;
        }
    }

}
