package by.epam.zelenko.onedimensionalarrays;

import java.util.Arrays;

public class Four {

    public static void main(String[] args) {

        int[] array = {2, 4, 5, 7, 12, 5, 32};
        int minIndex = 0;
        int maxIndex = 0;
        int temp;

        for (int i = 0; i < array.length; i++) {
            if (array[i] > array[maxIndex]) {
                maxIndex = i;
            } else if(array[i] < array[minIndex]){
                minIndex = i;
            }
        }
        temp = array[maxIndex];
        array[maxIndex] = array[minIndex];
        array[minIndex] = temp;
        System.out.println(Arrays.toString(array));
    }
}
