package alistirmalar1;

public class Recursion {
    public static void main(String[] args) {
        int input = 5;
        int sonuc = toplam(input);
        System.out.println("sonuc'un degeri = " + sonuc);
    }
    private static int toplam(int input){
        if(input == 1){
            return 1;
        }else{
            return input + toplam(input-1);
        }
    }

}
