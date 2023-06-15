package practiseIT;

import java.util.Arrays;

public class Arr6 {
    public static void main(tring[] args) {
        int max = Integer.MIN_VALUE;
        int[] nums = {0, 5, 0, 3};
        for (int i = nums.length-1; i >=0; i--) {
            if(nums[i]%2!=0){
                max=Math.max(max,nums[i]);
            }
            if(nums[i]==0){
                nums[i]=max;
            }
        }
        System.out.println("Arrays.toString(nums) = " + Arrays.toString(nums));
    }
}
