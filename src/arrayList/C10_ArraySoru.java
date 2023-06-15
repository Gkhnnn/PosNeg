package arrayList;

public class C10_ArraySoru {
    public static void main(String[] args) {
        int[] arr = {0,1,2,3,1,2,0,1};
        int count2 = 0;
        int mostFreqNum = 0;
        for (int each1: arr) {
            int count1 = 0;
            for (int each2: arr) {
                if (arr[each1] == arr[each2]) {
                    count1++; }
            }
            if (count1 > count2) {
                count2 = count1;
                mostFreqNum = arr[each1];
            } }
        System.out.println(mostFreqNum);
    }

}
