package practiseIT;

import java.util.Arrays;

public class Arr7 {
    public static void main(tring[] args) {
        int [] nums= {3, 2, 2};
        int[]arr = new int[nums.length];
        int index= 0;
        for (int i = 0; i < nums.length; i++) {
            if(nums[i]%2==0){
                arr[index]=nums[i];
                index++;
            }
        }
        for (int i = 0; i < arr.length; i++) {
          if(nums[i]%2!=0){
              arr[index]=nums[i];
          }
        }

        System.out.println(Arrays.toString(arr));
    }
}
