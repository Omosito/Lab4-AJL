/*
 * Author: Alex Leininger
 * Date: 10/1/2025
 * Description: Lab 4 - Program to display tables illustrating the difference in time complexity for different algorithms
 * Bugs: None known
 * Reflection: This lab wasn't that bad, mostly just time consuming. The only thing I really had trouble with was generating an array of random numbers but I just looked up the documention for the Random util and was able to figure it out.
 */

import java.util.Scanner;
import lab4.methods;
import java.util.Random;

public class App {
    /*
     * Calls method to print option menu to terminal
     */
    public static void main(String[] args) throws Exception {
        App app = new App();

        app.menu();
    }

    /*
     * Method to print a menu and take user input for what table to display then
     * calls the corresponding method to print that table
     */
    public void menu() {
        Scanner scr = new Scanner(System.in);
        System.out.println("Choose table (1-4, 0 to quit):");
        int choice = scr.nextInt(); // get user input
        while (choice != 0) {
            switch (choice) {
                case 1:
                    zeroPairTable1();
                    break;
                case 2:
                    zeroPairTable2();
                    break;
                case 3:
                    zeroTripletTable1();
                    break;
                case 4:
                    zeroTripletTable2();
                    break;
                default:
                    System.out.println("Invalid table entry, try again.");
            }
            System.out.println("Choose table (1-4, 0 to quit):");
            choice = scr.nextInt();
        }
        scr.close();
    }

    /*
     * Method to generate an array of random integers of a given size
     * 
     * @param size the size of the array to generate
     * 
     * @return an array of random integers of the given size
     */
    public int[] generateRandomArray(int size) {
        int[] arr = new int[size];
        Random random = new Random();
        random.setSeed(System.nanoTime());
        for (int i = 0; i < size; i++) {
            arr[i] = random.nextInt();
        }
        return arr;
    }

    /*
     * Methods to print tables for zero pair sums and zero triplet sums
     */
    public void zeroPairTable1() {
        methods numZeroPairSums = new methods();
        methods numZeroPairSumsSpeedy = new methods();
        System.out.printf("%-7s %8s %8s%n", "n", "nZP()", "nZPS()");
        System.out.println("========================="); // prints table header
        for (int i = 1000; i <= 50000; i += 1000) {
            int[] arr = generateRandomArray(i); // gets random array of size i
            long startTime = System.currentTimeMillis(); // start time
            numZeroPairSums.numZeroPairsSums(arr); // calls the method to be timed
            long endTime = System.currentTimeMillis(); // end time
            long duration1 = endTime - startTime; // calculates duration

            // same thing for the speedy method
            startTime = System.currentTimeMillis();
            numZeroPairSumsSpeedy.numZeroPairSumsSpeedy(arr);
            endTime = System.currentTimeMillis();
            long duration2 = endTime - startTime;

            System.out.printf("%-7d %8d %8d%n", i, duration1, duration2);
        }

    }

    public void zeroPairTable2() {
        methods numZeroPairSums = new methods();
        methods numZeroPairSumsSpeedy = new methods();
        System.out.printf("%-7s %8s %8s%n", "n", "nZP()", "nZPS()");
        System.out.println("=========================");
        for (int i = 1000; i <= 5000; i += 500) {
            int[] arr = generateRandomArray(i);
            long startTime = System.currentTimeMillis();
            numZeroPairSums.numZeroPairsSums(arr);
            long endTime = System.currentTimeMillis();
            long duration1 = endTime - startTime;

            startTime = System.currentTimeMillis();
            numZeroPairSumsSpeedy.numZeroPairSumsSpeedy(arr);
            endTime = System.currentTimeMillis();
            long duration2 = endTime - startTime;

            System.out.printf("%-7d %8d %8d%n", i, duration1, duration2);
        }

    }

    public void zeroTripletTable1() {
        methods numZeroTripletSums = new methods();
        methods numZeroTripletSumsSpeedy = new methods();
        System.out.printf("%-7s %8s %8s%n", "n", "nZT()", "nZTS()");
        System.out.println("=========================");
        for (int i = 1000; i <= 50000; i += 1000) {
            int[] arr = generateRandomArray(i);
            long startTime = System.currentTimeMillis();
            numZeroTripletSums.numZeroPairsSums(arr);
            long endTime = System.currentTimeMillis();
            long duration1 = endTime - startTime;

            startTime = System.currentTimeMillis();
            numZeroTripletSumsSpeedy.numZeroPairSumsSpeedy(arr);
            endTime = System.currentTimeMillis();
            long duration2 = endTime - startTime;

            if (i <= 3000) {
                System.out.printf("%-7d %8d %8d%n", i, duration1, duration2);
            }
            if (i == 4000) {
                System.out.println("...          ...      ...");
            }
            if (i >= 48000) {
                System.out.printf("%-7d %8d %8d%n", i, duration1, duration2);
            }
        }

    }

    public void zeroTripletTable2() {
        methods numZeroTripletSums = new methods();
        methods numZeroTripletSumsSpeedy = new methods();
        System.out.printf("%-7s %8s %8s%n", "n", "nZT()", "nZTS()");
        System.out.println("=========================");
        for (int i = 1000; i <= 5000; i += 500) {
            int[] arr = generateRandomArray(i);
            long startTime = System.currentTimeMillis();
            numZeroTripletSums.numZeroPairsSums(arr);
            long endTime = System.currentTimeMillis();
            long duration1 = endTime - startTime;

            startTime = System.currentTimeMillis();
            numZeroTripletSumsSpeedy.numZeroPairSumsSpeedy(arr);
            endTime = System.currentTimeMillis();
            long duration2 = endTime - startTime;

            if (i <= 2000) {
                System.out.printf("%-7d %8d %8d%n", i, duration1, duration2);
            }
            if (i == 3500) {
                System.out.println("...          ...      ...");
            }
            if (i >= 4000) {
                System.out.printf("%-7d %8d %8d%n", i, duration1, duration2);
            }
        }

    }
}
