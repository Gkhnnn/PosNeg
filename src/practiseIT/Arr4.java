package practiseIT;

import java.util.Arrays;

public class Arr4 {

    public static void main(tring[] args) {
        int[] arr = {0, 0, 1, 0, 1, 0, 1, 0, 0};
        int[] res = zeroFront(arr);

        System.out.println("Arrays.toString(res) = " + Arrays.toString(res));
    }

    public static int[] zeroFront(int[] nums) {
        if (nums.length == 0)
            return nums;

        int i = 0;

        while (nums[i] == 0)
            i++;

        for (int j = i + 1; j < nums.length; j++) {
            if (nums[j] == 0) {
                int temp = nums[i];
                nums[i] = nums[j];
                nums[j] = temp;
                i++;
            }
        }

        return nums;
    }
}
