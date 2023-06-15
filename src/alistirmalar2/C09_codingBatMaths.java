package alistirmalar2;

public class C09_codingBatMaths {
    public static void main(String[] args) {
        int sayi = 7;
        int number = 7;
        int result = Math.abs(10-sayi);
        int result1 = Math.abs(10-number);
        if(result<result1){
            System.out.println(sayi);
        }else if(result1<result){
            System.out.println(number);
        }else{
            System.out.println(0);
        }
    }
}
