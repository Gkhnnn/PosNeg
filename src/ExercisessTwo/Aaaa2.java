package ExercisessTwo;

import java.util.Arrays;

public class Aaaa2 {
    public static void main(String[] args) {
        String[] arr = {"Betul", "Mustafa", "Hakan", "Hanzel", "Mete", "Mehmet"};
        for (String each : arr){
            if(each.equals("Betul")||each.equals("Hanzel")){
                continue;
            }
            System.out.print(each+" ");
        }

    }
}
