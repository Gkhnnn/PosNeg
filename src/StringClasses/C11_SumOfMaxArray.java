package StringClasses;

import java.util.Arrays;

public class C11_SumOfMaxArray {
    public static void main(String[] args) {
        int[] number = {3, 4, 5, 6, 6};
        int[] total = {6,7,8,9,12,3};
        System.out.println(Arrays.toString(max(number, total)));


    }
    public static int [] max(int[] number, int [] total){

        int numberSum = 0;
        int totalSum = 0;
        for (int each : number) {
            numberSum+=each;
        }
        for (int each:total) {
            totalSum+=each;
        }
        if(numberSum>totalSum){
            return number;
        }else{
           return total;
        }
    }
}
