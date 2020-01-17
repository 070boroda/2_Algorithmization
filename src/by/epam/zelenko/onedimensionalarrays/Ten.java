package by.epam.zelenko.onedimensionalarrays;

import java.util.Arrays;

public class Ten {

    public static void main(String[] args) {

        int [] array = {1,2,3,4,5,6,7,8,9,10,11};


        for (int i = 2, j=1; i < array.length;j++, i+=2) {
            array[j] = array[i];

        }
        if (array.length % 2 == 0) {
            array = Arrays.copyOf(array, array.length / 2);
        } else {
            array = Arrays.copyOf(array, array.length / 2 + 1);
        }
        System.out.println(Arrays.toString(array));
    }
}
