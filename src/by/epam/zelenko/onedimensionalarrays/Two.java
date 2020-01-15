package by.epam.zelenko.onedimensionalarrays;

public class Two {

    public static void main(String[] args) {
        int[] a = {4, 2, 6, 7, 8, 4, 1, 12};
        int b = 5;
        int count = 0;

        for (int i = 0; i < a.length; i++) {
            if (b < a[i]) {
                a[i] = b;
                count++;
            }
        }
        for (int i = 0; i < a.length; i++) {
            System.out.println(a[i]);
        }
        System.out.println("Kolichestvo zamen " + count);
    }
}
