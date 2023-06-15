package alistirmalar2;

public class MobileObject {
    public static void main(String[] args) {
        Mobile mobilePhone = new Mobile();
        mobilePhone.marka= "Iphone";
        mobilePhone.model= "14 Pro Max";
        mobilePhone.hafiza= 256;
        mobilePhone.ekranBuyuklugu = 15.6;
        mobilePhone.renk= "gold";
        mobilePhone.fiyat= 1000;
        mobilePhone.arama();
        mobilePhone.fotografCek();
        mobilePhone.mesajGonder();
        mobilePhone.navigasyonaBaglan();
        mobilePhone.search();
        System.out.println(mobilePhone.marka);
        System.out.println(mobilePhone.model);
        System.out.println(mobilePhone.hafiza);
        System.out.println(mobilePhone.ekranBuyuklugu);
        System.out.println(mobilePhone.renk);
        System.out.println(mobilePhone.fiyat);



        Mobile mobilePhone2 = new Mobile();
        mobilePhone2.marka = "Samsung";
        mobilePhone2.model = "A75";
        mobilePhone2.hafiza = 128;
        mobilePhone2.ekranBuyuklugu = 13.3;
        mobilePhone2.renk = "White";
        mobilePhone2.fiyat = 750;
        mobilePhone2.arama();
        mobilePhone2.fotografCek();
        mobilePhone2.mesajGonder();
        mobilePhone2.navigasyonaBaglan();
        mobilePhone2.search();
        System.out.println(mobilePhone2.marka);
        System.out.println(mobilePhone2.model);
        System.out.println(mobilePhone2.hafiza);
        System.out.println(mobilePhone2.ekranBuyuklugu);
        System.out.println(mobilePhone2.renk);
        System.out.println(mobilePhone2.fiyat);


        System.out.println(mobilePhone.equals(mobilePhone2));




    }
}
