package by.epam.zelenko.onedimensionalarrays;

public class Seven {

    public static void main(String[] args) {
        int[] array = {5, 1, 2,4};
                //3, 4, 5, 6, 7, 8, 9};
        int max = Integer.MIN_VALUE;

        for (int i = 0; i < (array.length+1)/2; i++) {
            max = array[i] + array[array.length - 1 - i] > max && i != array.length - 1 - i ? array[i] + array[array.length - 1 - i] : max;
            max = array[i] + array[array.length - 1 - i] > max && i == array.length - 1 - i ? array[i] : max;
        }
        System.out.println(max);
    }

}
