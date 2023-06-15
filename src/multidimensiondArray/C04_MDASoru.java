package multidimensiondArray;

import java.util.Arrays;

public class C04_MDASoru {
    public static void main(String[] args) {
        int[][] arry = {{3, 1, 2, 4}, {1, 2}, {3, 4, 5}, {10}, {2, 7}};

        int[] total = new int[arry.length];
        int toplam = 0;
        for (int i = 0; i < arry.length; i++) {
            for (int j = 0; j < arry[i].length; j++) {
                toplam += arry[i][j];
            }
            total[i] = toplam;
            toplam = 0;
        }
        System.out.println(Arrays.toString(total));
    }

}
