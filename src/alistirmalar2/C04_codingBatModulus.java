package alistirmalar2;

public class C04_codingBatModulus {
    public static void main(String[] args) {
        int sayi = 12;
        if(sayi>0){
            if(sayi%3==0||sayi%5==0){
                System.out.println(true);
            }else{
                System.out.println(false);
            }
        }
    }
}
