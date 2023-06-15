package arrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class C06_ForEachSoru {
    public static void main(String[] args) {
        Integer[] sayilar = {2, 3, 4, 6, 3, 4, 6, 1, 8, 5, 4};
        List<Integer> list1 = new ArrayList<>();

        for (int each : sayilar) {


            if (!list1.contains(each)) {

                list1.add(each);

            }

        }
        System.out.println(list1);
        sayilar = new Integer[list1.size()];
        for (int i = 0; i < sayilar.length; i++) {
            sayilar[i] =list1.get(i);

        }
        System.out.println(Arrays.toString(sayilar));

    }
}
