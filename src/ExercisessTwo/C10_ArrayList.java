package ExercisessTwo;

import java.util.Arrays;

public class C10_ArrayList {
    public static void main(String[] args) {
        /*
        Bir ints dizisi verildiğinde, 6 dizideki ilk veya son öğe olarak görünüyorsa true döndürün. Dizi uzunluk 1 veya daha fazla olacaktır.
         */

        int[] arry = {6, 1, 6, 0, 6, 9};

        if (arry[0] == 6 || arry[arry.length - 1] == 6) {
            System.out.println(true);
        } else {
            System.out.println(false);
        }
        /*
        Bir int dizisi verildiğinde, dizi 1 veya daha fazla uzunluksa ve ilk öğe ile son öğe eşitse true döndürün
        */
        System.out.println("----------------------------");
        int[] arr = {1};
        if (arr[0] == arr[arr.length - 1]) {
            System.out.println(true);
        }
        System.out.println("----------------------------");
        int[] nums = {1, 2, 3};
        int number = nums[0];
        int[] nums2 = new int[nums.length];
        for (int i = 0; i < nums.length - 1; i++) {
            nums2[i] = nums[i + 1];
        }
        nums2[nums2.length - 1] = number;
        System.out.println("Arrays.toString(nums) = " + Arrays.toString(nums2));
    }
}
