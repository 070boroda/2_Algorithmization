package by.epam.zelenko.onedimensionalarrays;

import java.util.Arrays;

public class Eight {

    public static void main(String[] args) {
        int[] array = {5, 2, 4, 3, -2, 5, 6, -2, 8, 9};
        int min = Integer.MAX_VALUE;
        int count = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] < min) {
                count = 1;
                min = array[i];
            } else if (array[i] == min) {
                count++;
            }
        }

        int[] array2 = new int[array.length - count];
        int i = 0;
        for (int d : array) {
            if (d > min) {
                array2[i++] = d;
            }
        }
        System.out.println(Arrays.toString(array));
        System.out.println(Arrays.toString(array2));
    }
}
