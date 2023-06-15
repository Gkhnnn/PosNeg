package alistirmalar2;

public class C06_codingBatDel {
    public static void main(String[] args) {
        String str = "abcddel";
        if(str.contains("del")){
            System.out.println(str.replace("del", " "));
        } else if (!(str.contains("del"))) {
            System.out.println(str);
        }
    }
}
