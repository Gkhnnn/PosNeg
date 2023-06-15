package BankExample;

public class Musteri {
    String name;
    int hesapNo;
    int kimlikNo;
    int telNo;
    double bakiye;

    public Musteri() {

    }

    public Musteri(String name, int kimlikNo) {
        this.name = name;
        this.kimlikNo = kimlikNo;
    }

    public Musteri(String name, int hesapNo, int kimlikNo, int telNo, double bakiye) {
        this.name = name;
        this.hesapNo = hesapNo;
        this.kimlikNo = kimlikNo;
        this.telNo = telNo;
        this.bakiye = bakiye;
    }

    public void showInfo(){
        System.out.println("***Müsteri Bilgileri***");
        System.out.println("-----------------------");
        System.out.println("Müsterinin adı                       :"+this.name);
        System.out.println("Müsterinin kimlik numarası           :"+this.kimlikNo);
        System.out.println("Müsterinin hesap  numarası           :"+this.hesapNo);
        System.out.println("Müsterinin telefon  numarası         :"+this.telNo);
        System.out.println("Müsterinin hesap bakiyesi            :"+this.bakiye);

    }
}
