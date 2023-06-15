package ExercisessTwo;

import java.util.Arrays;

public class Aaaa1 {
    public static void main(String[] args) {
        String[] arr = {"Betul", "Mustafa", "Hakan", "Hanzel", "Mete", "Mehmet"};
        String[] newarr = new String[arr.length - 2];
        for (int i = 0; i < arr.length - 2; i++) {
            newarr[i] = arr[i];
        }
        System.out.println(Arrays.toString(newarr));
    }
}
