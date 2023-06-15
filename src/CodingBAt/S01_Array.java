package CodingBAt;

public class S01_Array {
    public static void main(String[] args) {
        int[] arr = {1,2,3};
        int max = Math.max(arr[0], arr[1]);
        System.out.println("max = " + max);
        int result = Math.max(max, arr[2]);
        System.out.println("result = " + result);


        System.out.println("*********************");
        int[] nums = {2,1,3,4,5};
        int counter = 0;
        for (int i = 0; i < nums.length; i++) {
            if(nums[i]==1){
                counter= i+1;
            }
        }
        if(nums[counter]==3){
            System.out.println(true);
        }

    }
}
