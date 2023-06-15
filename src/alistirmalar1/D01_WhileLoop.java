package alistirmalar1;

public class D01_WhileLoop {
    public static void main(String[] args) {
        for (int i = 10; i <100 ; i++) {
            if(i%7==0){
                System.out.print(i + " sayısı 7'ye tam bölünebilir.\t");
            }else{
                System.out.println(i + " sayısı 7'ye tam bölünemez.\t");
            }

        }
        System.out.println("********************************************");
        int sayi = 20;
        while (sayi<100){
            if(sayi%7==0){
                System.out.print(sayi +" sayısı 7'ye tam bölünebilir.\t");
            }else{
                System.out.println(sayi + " sayısı 7'ye tam bölünemez.\t");
            }
            sayi++;
        }
    }
}
