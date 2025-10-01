import java.util.Arrays;

public class methods {

    public int numZeroPairsSums(int[] arr) {
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length - 1; j++) {
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
            System.out.println(index);
            if (index > i) {
                count++;
                continue;
            }
        }
        return count;
    }

    public int numZeroTripletSums(int[] arr) {
        int count = 0;

        return count;
    }

    public int numZeroTripletSumsSpeedy(int[] arr) {
        int count = 0;

        return count;
    }

    public int binarySearch(int[] arr, int key) {
        int min = 0;
        int max = arr.length;
        int mid = max / 2;
        boolean found = false;

        while (mid > min) {
            if (arr[mid] == key) {
                found = true;
                break;
            }
            if (arr[mid] < key) {
                min = mid;
                mid = (max + min) / 2;
            } else if (arr[mid] > key) {
                max = mid;
                mid = max / 2;
            }
        }

        if (!found) {
            return -1;
        } else {
            return mid;
        }
    }

}
