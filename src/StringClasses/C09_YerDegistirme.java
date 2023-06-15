package StringClasses;

import java.util.Arrays;

public class C09_YerDegistirme {
    public static void main(String[] args) {
        int [] arr = {1,2,3};

        int ilkElement = arr[0];
        for (int i = 0; i < arr.length-1; i++) {

                arr[i]=arr[i+1];


        }
        arr[arr.length-1]= ilkElement;
        System.out.println(Arrays.toString(arr));
    }
}
