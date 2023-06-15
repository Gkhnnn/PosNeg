package OopExamaple;

public class C02_hesaplar {
    public static void main(String[] args) {
        C01_Bank gokhanEuroHesap = new C01_Bank();
        System.out.println(C01_Bank.musteriSayisi);
        System.out.println(gokhanEuroHesap.bankAdi);
        System.out.println(gokhanEuroHesap.hesapAktifMi);
        System.out.println(gokhanEuroHesap.hesapSahibi);

        gokhanEuroHesap.hesapSahibi = "gokhan turk";
        gokhanEuroHesap.paraBirimi = "Euro";
        gokhanEuroHesap.hesapNo = 1234;
        gokhanEuroHesap.hesapTuru = "vadesiz";
        gokhanEuroHesap.subeAdresi = "London/England";
        gokhanEuroHesap.bakiye = 3.500;
        gokhanEuroHesap.karOrani = .12;
        gokhanEuroHesap.paraCek();
        gokhanEuroHesap.paraYatir();



        C01_Bank gokhanPoundHesabi = new C01_Bank();
        System.out.println(C01_Bank.musteriSayisi);
        System.out.println(gokhanPoundHesabi.hesapAktifMi);
        System.out.println(gokhanPoundHesabi.bankAdi);
        System.out.println(gokhanPoundHesabi.hesapSahibi);
        gokhanPoundHesabi.hesapSahibi = "gokhan turk";
        gokhanPoundHesabi.bakiye = 4.250;
        gokhanPoundHesabi.subeAdresi = "Roma/ITALY";
        gokhanPoundHesabi.karOrani = .15;
        gokhanPoundHesabi.hesapTuru = "Vadeli";
        gokhanPoundHesabi.hesapNo = 123456789;
        gokhanPoundHesabi.paraBirimi = "Pound";
        gokhanPoundHesabi.paraYatir();
        gokhanPoundHesabi.paraCek();



        C01_Bank gokhanTrHesap = new C01_Bank();
        System.out.println(C01_Bank.musteriSayisi);
        gokhanTrHesap.hesapSahibi = "gokhan turk";
        gokhanTrHesap.paraBirimi = "TRY";
        gokhanTrHesap.hesapNo = 386450;
        gokhanTrHesap.hesapTuru = "vadeli";
        gokhanTrHesap.subeAdresi = "Istanbul/TURKEY";
        gokhanTrHesap.bakiye = 45600;
        gokhanTrHesap.karOrani =.1;
        gokhanTrHesap.paraCek();
        gokhanTrHesap.paraYatir();




    }
}
