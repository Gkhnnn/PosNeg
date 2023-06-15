package practiseIT;

import java.util.Arrays;

public class Arr3 {
    public static void main(tring[] args) {
        int[]arr = {1, 2, 3, 2, 5,2};
        int val = 2;
        int[] arry = new int[arr.length];

        if(arr.length >= 1) {
            arry[0] = arr[0];
            arry[arr.length-1] = arr[arr.length-1];
       }

        for(int i = 1; i <= arr.length - 2; i++) {
            if(arr[i] == val && arr[i] != arr[i-1] && arr[i] != arr[i+1])
                arry[i] = Math.max(arr[i-1], arr[i+1]);
            else
                arry[i] = arr[i];
        }

        System.out.println("Arrays.toString(arry) = " + Arrays.toString(arry));
    }
}
