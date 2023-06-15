package practiseIT;

import java.util.Arrays;

public class Arr5 {
    public static void main(tring[] args) {
        int[] nums = {10, 13, 10, 14, 10};
        int index = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 10) {
                nums[index] = nums[i];
                index++;
            }
        }

        for (int i = index; i < nums.length; i++) {
            nums[i] = 0;

        }
        System.out.println("Arrays.toString(nums) = " + Arrays.toString(nums));
    }

}
