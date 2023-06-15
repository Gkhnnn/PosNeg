package alistirmalar2;

public class C17_ArraySoru {
    public static void main(String[] args) {
        int[] sayilar ={2,3,4,5,2,3,4,5,2,45,3,2,1,6,2,45,2};
        int aranacakSayi = 4;
        elemanBul(sayilar, aranacakSayi);
    }

    public static void elemanBul(int[] arry, int arananSayi) {
        int sayac = 0;
        for (int i = 0; i < arry.length; i++) {
            if (arry[i] == arananSayi) {
                sayac++;
            }

        }
        if(sayac==0){
            System.out.println("Aranan sayı bulunamadı.");
        }else {
            System.out.println(arananSayi+" verilen dökümanda "+ sayac +" mevcuttur.");
        }
    }
}
