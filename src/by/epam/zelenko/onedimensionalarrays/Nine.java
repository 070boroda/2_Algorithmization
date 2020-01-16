package by.epam.zelenko.onedimensionalarrays;

import java.util.Arrays;

public class Nine {

    public static void main(String[] args) {

        int[] array = {2, 3, 4, 3, 2, 5, 6, 2, 8, 9,3,3};
        int min = Integer.MAX_VALUE;
        int[] popular = new int[array.length];

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                if (array[i] == array[j]) {
                    popular[i]++;
                }
            }
        }

        int valResult = array[0];
        int popResult = popular[0];
        for (int i = 0; i < popular.length; i++) {
            if (popular[i] > popResult) {
                popResult = popular[i];
                valResult = array[i];
            }
            if ((popResult == popular[i]) && (array[i] < valResult)) {
                valResult = array[i];
            }
        }

        System.out.println(Arrays.toString(array));
        System.out.println(Arrays.toString(popular));
        System.out.println(valResult);
    }
}
