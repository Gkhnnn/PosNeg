package practiseIT;

import java.util.Arrays;

public class Array2 {
    public static void main(String[] args) {
        int[]arr = {4, 1, 4, 2, 2,4, 2};
        int[] result = post4(arr);
        System.out.println("Arrays.toString(result) = " + Arrays.toString(result));
    }
    public static int[] post4(int[] nums) {
        int i = nums.length - 1;

        while(nums[i] != 4)
            i--;

        int[] arr = new int[nums.length - i - 1];

        for(int j = 0; j < arr.length; j++)
            arr[j] = nums[i + j + 1];

        return arr;
    }

}