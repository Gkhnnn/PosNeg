package arrayList;

public class C09_ArrayListMax {
    public static void main(String[] args) {
        int [] arr = {10,2,1,55,7,4,19};
        int max = Integer.MIN_VALUE;
        for (int each :arr) {
            if(max<each){
                max = each;
            }
        }
        System.out.println("Array'deki en büyük element= "+ max);
    }
}
