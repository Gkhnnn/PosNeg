package alistirmalar1;

public class Palindroma {
    public static void main(String[] args) {

        System.out.println(polindrom("Kayak"));
        System.out.println(polindrom("Ey edip adanada pide ye"));
        System.out.println(recurseve(4));

    }
    public static boolean polindrom(String str){
        String newStr = str.toLowerCase();
        boolean flag = true;
        for (int i = 0; i < str.length(); i++) {
            if(newStr.charAt(i) != newStr.charAt(newStr.length()-1-i)){
                flag = false;
                break;
            }
        }
        return flag;
    }
    public static int recurseve(int num){
        if(num == 1){
            return 1;
        }
        return num + recurseve(num - 1);
    }
}
