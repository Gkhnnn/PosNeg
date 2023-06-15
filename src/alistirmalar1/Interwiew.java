package alistirmalar1;

import java.util.Arrays;
import java.util.List;

public class Interwiew {
    public static void main(String[] args) {

        List<Integer> orginal = Arrays.asList(3, 6, 9, 12, 15, 17, 359);

        task1(orginal);
        System.out.println();
        task2(orginal);
        System.out.println();
        task3(orginal);

    }

    public static void task1(List<Integer> orgnal) {
        for (int i = 0; i < orgnal.size(); i++) {
            System.out.print(orgnal.get(i) * orgnal.get(i) + "  ");
        }
    }

    public static void task2(List<Integer> orgnal) {
        boolean flag = false;
        for (int i = 0; i < orgnal.size(); i++) {

            if (orgnal.get(i) % 3 != 0) {
                continue;
            }
            if (flag) {
                System.out.print(",");
            }
            if (orgnal.get(i) % 3 == 0) {
                System.out.print(orgnal.get(i));
                flag = true;
            }
        }
    }

    public static void task3(List<Integer> orgnal) {

        boolean flag = false;

        for (int i = 0; i < orgnal.size() - 1; i++) {
            if (flag) {
                System.out.print(",");
            }
            if (i == 0) {
                System.out.print(orgnal.get(i) + orgnal.get(i + 1));
            } else {
                System.out.print(orgnal.get(i - 1) + orgnal.get(i) + orgnal.get(i + 1));
            }
            flag = true;
        }
    }
}
