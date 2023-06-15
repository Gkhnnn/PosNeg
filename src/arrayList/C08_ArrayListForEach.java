package arrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class C08_ArrayListForEach {
    public static void main(String[] args) {
        String [] arr1 = {"Merhaba","Javayı","Yendim"};
        String [] arr2 = {"Merhaba", "Hayat","Javayı","Yendim"};

        List<String> ortakElemanList = new ArrayList<>();

        for (String eachArr1:arr1) {
            for (String eachArr2:arr2) {
                if(eachArr1==eachArr2){
                    if(!ortakElemanList.contains(eachArr1)){
                        ortakElemanList.add(eachArr1);
                    }
                }
            }

        }
        System.out.println(ortakElemanList);
    }
}
