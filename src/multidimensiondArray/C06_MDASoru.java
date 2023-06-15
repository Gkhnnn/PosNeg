package multidimensiondArray;

import java.util.Arrays;

public class C06_MDASoru {
    public static void main(String[] args) {

        int[][] arr = {{1, 2, 3, 4, 5}, {2, 3, 6, 7}};

        int enKisaArray = arr[0].length;

        for (int i = 0; i < arr.length; i++) {

            if (enKisaArray > arr[i].length) {
                enKisaArray = arr[i].length;
            }

        }

        int[] total = new int[enKisaArray];
        int toplam = 0;

        for (int i = 0; i < total.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                toplam += arr[j][i];

            }
            total [i] = toplam;
            toplam =0;
        }
        System.out.println(Arrays.toString(total));
    }
}
