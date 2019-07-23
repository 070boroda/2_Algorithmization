package by.epam.zelenko.onedimensionalarrays;

public class One {
    public static void main(String[] args) {
        int[] a ={2,4,7,4,9,1,6};
        int k = 2;
        int count = 0;

        for (int i = 0; i < a.length; i++){
            int c = a[i]%k;
            if(c==0){
               count +=a[i];
            }
        }
        System.out.println(count);
    }
}
