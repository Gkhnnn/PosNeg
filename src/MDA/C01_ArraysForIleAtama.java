package MDA;

import java.util.Arrays;
import java.util.Random;

public class C01_ArraysForIleAtama {
    public static void main(String[] args) {
        int[][] arr = new int[9][9];
        Random rnd = new Random();

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                arr[i][j] = rnd.nextInt(1,9)+ rnd.nextInt(1,9);
            }
        }
        System.out.println(Arrays.deepToString(arr));
    }
}
