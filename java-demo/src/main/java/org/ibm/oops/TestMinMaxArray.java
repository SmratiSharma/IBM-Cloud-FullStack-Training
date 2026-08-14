package org.ibm.oops;

public class TestMinMaxArray {
    public static void main(String[] args) {
        int[] numbers = {3, 5, 1, 8, 2, 7};

        int min = findMin(numbers);
        int max = findMax(numbers);

        System.out.println("Minimum value: " + min);
        System.out.println("Maximum value: " + max);
    }

    public static int findMin(int[] array) {
        int min = array[0];
        for (int num : array) {
            if (num < min) {
                min = num;
            }
        }
        return min;
    }

    public static int findMax(int[] array) {
        int max = array[0];
        for (int num : array) {
            if (num > max) {
                max = num;
            }
        }
        return max;
    }
}
