package alistirmalar1;

public class B05_TerseCevirme {
    public static void main(String[] args) {
        String str1 =  metniTerseCevir("Java candır");
        System.out.println(str1);
    }

    public static String metniTerseCevir(String str) {

        String tersStr = "";
        for (int i = str.length() - 1; i >= 0; i--) {
            tersStr+=str.charAt(i);
        }
        return  tersStr;
    }
}
