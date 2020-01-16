package by.epam.zelenko.onedimensionalarrays;

public class Six {

    public static void main(String[] args) {

        int[] array = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
        int sum = 0;
        for (int i = 2; i < array.length; i++) {
            if (isPrime(i)) {
                sum += array[i];
            }
        }

        System.out.println(sum);
    }

    public static boolean isPrime(int x) {
        int temp;
        for (int i = 2; i <= x / 2; i++) {
            temp = x % i;
            if (temp == 0) {
                return false;
            }
        }
        return true;
    }
}
