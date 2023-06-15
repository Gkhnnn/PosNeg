package MDA;

import java.util.Arrays;

public class C03_RaggedArryas {
    public static void main(String[] args) {

        int[][] arr = new int[5][6];
        int[] x = {1,2};
        arr[0] = x; // burada yapmış oldugumuz atamayla arr arrayının ilk row(satır)'nın eleman sayısında değişiklik yapmış oluruz.
        System.out.println(Arrays.deepToString(arr)); // [""[1, 2]"", [0, 0, 0, 0, 0, 0], [0, 0, 0, 0, 0, 0], [0, 0, 0, 0, 0, 0], [0, 0, 0, 0, 0, 0]]

        int[][] array = new int[5][9];
        int[] y = {1,2,3};
        array[0] = y;
        System.out.println(Arrays.deepToString(array)); // [[1, 2, 3], [0, 0, 0, 0, 0, 0, 0, 0, 0], [0, 0, 0, 0, 0, 0, 0, 0, 0], [0, 0, 0, 0, 0, 0, 0, 0, 0], [0, 0, 0, 0, 0, 0, 0, 0, 0]]

        /*
        multi dimensional arraylerde sutun sayısını baska bir array atayarak degiştirme sansına sahibiz. ama satır(row) degiştirilemez.!!!!! degişirse hata yapmıs oluruz ve java hata verir.
         */
    }
}
