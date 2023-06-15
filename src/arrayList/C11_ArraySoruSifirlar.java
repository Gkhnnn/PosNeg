package arrayList;

import java.util.Arrays;

public class C11_ArraySoruSifirlar {
    public static void main(String[] args) {
        int [] arr = {1, 9, 1, 8, 4, 0, 1, 0, 2, 7, 0, 6, 0};
        int [] secondArr = new int[arr.length];
        int baslangic = 0;
        int son = secondArr.length-1;
        for (int each1 : arr) {
            if (arr[each1] == 1) {
                secondArr[baslangic] = arr[each1];
                baslangic++;
            } else if (arr[each1] == 0) {
                secondArr[son] = arr[each1];
                son--;
            }
        }
            for (int each2:arr) {
                if(arr[each2]!=1&&secondArr[each2]!=0){
                    secondArr[baslangic]=arr[each2];
                    baslangic++;
                }
            }
            System.out.println("Arrays.toString(arr) = " + Arrays.toString(arr));
            System.out.println("Arrays.toString(secondArr) = " + Arrays.toString(secondArr));

    }
}
