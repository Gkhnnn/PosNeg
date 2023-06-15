package alistirmalar1;

public class voidMethods {
    public static void main (String [] args){
        /*
        Input olrak verilen satis fiyatı, müsteri kartı var mı?
        ve uyeliği kac yıllık? bilgilerini degerlendirip
        - uye degilse : %5 indirim
        - uyeliği var ama 5 yıldan az ise %10 indirim
        - uyeliği var ve 5 yıldan cok ise %15 indirim uygulayıp
        asil fiyatı, indirim miktsrını ve indirimli fiyatı yazdıran bir method oluturun
         */
        boolean uyeMi = true;
        int uyelikYili = 3;
        double satisFiyati =250;
        indirimliFiyatıHesapla(true,6,250);// 212.5
        indirimliFiyatıHesapla(false,0,250 );// lütfen üye olunuz.'!!!!
        indirimliFiyatıHesapla(true,3,250);
    }
    public static void indirimliFiyatıHesapla(boolean uyeMi, int uyelikYili, int satisFiyati){

        if(uyeMi){
            if(uyelikYili<5){
                System.out.println("İndirimliFiyat = "+ satisFiyati * 0.90+ "$");
            }else if(uyelikYili>5){
                System.out.println("İndirimli fiyat = "+ satisFiyati*0.85+ "$");
            }
        }else if(uyeMi){
            System.out.println("İndirimli Fiyat = " + satisFiyati*0.95 +"$");
        }

    }
}
