package arrayList;

import java.util.ArrayList;
import java.util.List;

public class C05_ForEachSoru {
    public static void main(String[] args) {

        Integer [] sayilar = {2,3,4,6,3,4,6,1,8,5,4};
        List<Integer> list = new ArrayList<>();
        for (Integer sayi: sayilar) {
            list.add(sayi);
        }
        System.out.println(list);


        List<Integer> list2 = new ArrayList<>();
        for (Integer each :sayilar) {
            if(each%2==0){
                list2.add(each);
            }
        }
        System.out.println(list2);
    }
}
