package by.epam.zelenko.onedimensionalarrays;

public class Five {

    public static void main(String[] args) {

        int[] array = {2, 0, 5, 7, 12, 4, 32};

        for (int i = 0; i < array.length; i++) {

            if (array[i] > i) {
                System.out.print(array[i] + " ");
            }
        }
    }
}
