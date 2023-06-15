package arrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class C02_ArrayListSoru {
    public static void main(String[] args) {
        int[] arr = {4, 3, 6, 7, 3, 5, 3, 6, 7, 3, 5, 4, 6, 4, 7, 7, 7, 5};
        List<Integer> benzersiz = new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
            if (!benzersiz.contains(arr[i])) {
                benzersiz.add(arr[i]);
            }
        }
        System.out.println(benzersiz);

      arr = new int[benzersiz.size()];
        for (int i = 0; i < benzersiz.size(); i++) {
            arr[i]= benzersiz.get(i);

        }
        System.out.println("Array'ın son hali : " +Arrays.toString(arr));
    }

}
