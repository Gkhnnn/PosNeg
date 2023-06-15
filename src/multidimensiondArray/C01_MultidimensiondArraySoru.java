package multidimensiondArray;

import java.util.Arrays;

public class C01_MultidimensiondArraySoru {
    public static void main(String[] args) {
        int[][] arry = {{1, 2}, {3, 4, 5}, {6, 7, 5}, {2}, {1, 2, 3, 4, 5}};
        System.out.println(arry.length);
        System.out.println(Arrays.toString(arry[3]));// bu bir array olarak yazdırır
        System.out.println(arry[3][0]);// bu element olarak yazdırır.
        System.out.println(arry[4].length);
        System.out.println(Arrays.deepToString(arry));

        for (int i = 0; i < arry.length; i++) { // kac tane satır olacagına
            for (int j = 0; j < arry[4].length; j++) { // bir satır da kac kere arry[k] yazacagına karar verir.
                for (int k = 0; k < arry[1].length; k++) { // bu arry [k] daki eleman sayısını kontrol eder
                    System.out.print(arry[4][k] + "  ");

                }
                System.out.println();
            }
            System.out.println();
        }

    }
}
