package practiseIT;

import java.util.Arrays;

public class Array {
    public static void main(String[] args) {
        int[] arry = {2, 10, 3, 4, 20, 5};
        int change = 0;
        boolean condition = false;
        for (int i = 0; i < arry.length; i++) {
            if (arry[i] % 10 == 0) {

                condition = true;
                change = arry[i];
            }

            if(condition){
                arry[i]=change;
            }

        }
        System.out.println("Arrays.toString(arry) = " + Arrays.toString(arry));
    }
}
