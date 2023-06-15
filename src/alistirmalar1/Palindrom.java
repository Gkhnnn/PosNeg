package alistirmalar1;

public class Palindrom {
    public static void main(String[] args) {
        boolean palindrom =  isPalindrom(121);
        System.out.println(palindrom);


    }

    public static boolean isPalindrom(int x) {
        int sayi = x;
        int tersSayi = 0;
        int kalan;
        while (sayi % 10 != 0) {
            kalan = sayi % 10;
            tersSayi = tersSayi * 10 + kalan;
            sayi /= 10;
        }
        if(x==tersSayi){
            return true;
        }else{
            return false;
        }
    }


}