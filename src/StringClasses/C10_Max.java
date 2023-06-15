package StringClasses;

import java.util.Arrays;

public class C10_Max {
    public static void main(String[] args) {
        int[] number = {12,2,3,5,0};
        int max = number[0];
        for (int each : number) {
            if(max<each){
                max = each;
            }
        }
        System.out.println(max);
        for (int i = 0; i < number.length; i++) {
            number[i]= max;
        }
        System.out.println(Arrays.toString(number));
    }
}
