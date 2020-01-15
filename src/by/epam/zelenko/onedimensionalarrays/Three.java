package by.epam.zelenko.onedimensionalarrays;

public class Three {

    public static void main(String[] args) {
        int[] a = {-2, -2, 6, -7, 8, -4, 1, 12, 0, 0};
        int countZero = 0;
        int countNegative = 0;
        int countPositive = 0;

        for (int i = 0; i < a.length; i++) {
            if (a[i] == 0) {
                countZero++;
            } else if (a[i] > 0) {
                countPositive++;
            } else {
                countNegative++;
            }

        }
        System.out.println("Positive number " + countPositive);
        System.out.println("Negative number " + countNegative);
        System.out.println("Zero " + countZero);
    }
}
