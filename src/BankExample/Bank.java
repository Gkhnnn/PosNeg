package BankExample;

import java.sql.SQLOutput;
import java.util.ArrayList;

public class Bank {
    String name;
    String Adres;
    int hesapNo;

    ArrayList<Musteri> musteriList = new ArrayList<>();

    public Bank(String name, String adres) {
        this.name = name;
        Adres = adres;
    }
    public void musteriEkle(Musteri musteri){
        this.hesapNo++;
        musteri.hesapNo= this.hesapNo;
        this.musteriList.add(musteri);
        System.out.println(musteri.hesapNo +" hesap nolu "+ musteri.name+" eklendi.");
    }
    public void paraCek(Musteri musteri, double paraMiktar){
        if(musteri.bakiye>= paraMiktar){
            musteri.bakiye-=paraMiktar;
            musteri.showInfo();
        }else{
            System.out.println("Bkiyeniz "+ paraMiktar + " TL para cekmek için yetersizdir.");
            System.out.println("En fazla "+ musteri.bakiye + " TL para cekebilirsiniz.");
        }
    }
    public void showInfo(){
        System.out.println("Bankamızdaki müsterilerin bilgileri asagıdadır.");
        System.out.println("***********************************************");
        System.out.println("Banka Adı :           "+this.name);
        System.out.println("Banka Adresi :        "+ this.Adres);
        for(Musteri musteri : this.musteriList){
            musteri.showInfo();
        }
    }
}
