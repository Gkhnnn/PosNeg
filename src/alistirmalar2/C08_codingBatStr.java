package alistirmalar2;

public class C08_codingBatStr {
    public static void main(String[] args) {

        String str = "zymandias";
        String newStr = str.substring(0,2);
        String newStr1 = str.substring(0,1);
        String newStr2 = str.substring(1,2);


        if(str.contains(newStr)){
            System.out.println(newStr);
        }
        if(!(str.contains(newStr1))){
            System.out.println(newStr2);
        }
    }
}
