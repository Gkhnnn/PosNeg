package multidimensiondArray;

import java.util.Arrays;

public class C05_MDASoru {

    public static void main(String[] args) {

        int[][] arry = {{3, 4, 5}, {2, 3, 6, 7}, {4,5,5,7}};

        int enKisaArrayLength =  arry[0].length;

        for (int i = 0; i < arry.length; i++) {

            if(arry[i].length<enKisaArrayLength){
                enKisaArrayLength= arry[i].length;
            }
        }
        int [] toplamlarArry = new int[enKisaArrayLength];
        
        int toplam =0;

        for (int i = 0; i < toplamlarArry.length; i++) {
            for (int j = 0; j < arry.length; j++) {
                toplam+=arry[j][i];

            }
            toplamlarArry[i] = toplam;
            toplam =0;

        }
        System.out.println(Arrays.toString(toplamlarArry));
    }

}

