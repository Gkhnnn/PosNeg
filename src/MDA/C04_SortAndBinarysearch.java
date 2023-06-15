package MDA;

import java.util.Arrays;

public class C04_SortAndBinarysearch {
    public static void main(String[] args) {

        int[] arr = {14,45,34,1,33,56,67,89};
        System.out.println(Arrays.binarySearch(arr, 1));
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));

        Integer str = new Integer('a');
        System.out.println("str = " + str);

    }
}
