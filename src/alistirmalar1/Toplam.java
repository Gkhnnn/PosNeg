package alistirmalar1;

import static java.lang.Character.isDigit;

public class Toplam {
    public static void main(String[] args) {
        // 354asd45
        System.out.println(sum("23er23"));
    }
    public static int sum(String str){

        int total =0;
        char[] chars = str.toCharArray();
        for(char each : chars){
            if(isDigit(each)){
                total += Integer.valueOf(""+ each);
            }
        }
        return total;
    }
}
