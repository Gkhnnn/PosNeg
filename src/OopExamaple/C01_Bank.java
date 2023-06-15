package OopExamaple;

public class C01_Bank {


    // default - no argumnet Constractur methodların iki kuarkı
    // 1-) Class ismiyle method ismi aynı olmak zorundadır.
    // 2_) herhangi bir return type olmayacak(int void String boolean vs.)
    // 3-) objelerdeki degerlerin default degerlerini tanımlar
    // 4-) eger class içerisinde hiçbir constracyot olusturulmadı ise java compiler bunu kendisi otomatik olarak olusturur.Gizli bir constroctur olusturur.
    // 5-) Constractur method ları class içerisinde bir kere olusturulur vetüm objeler için kullanılır.
    public C01_Bank() {

        bankAdi = "HSBC";
        hesapAktifMi = true;
        musteriSayisi++;
    }

    public void C01_Bank() {

        // bu bir constractur degildir. çünkü return type mevcuttur.
    }

    public C01_Bank(String hesapSahibi, int hesapNo, String paraBirimi, String subeAdresi, String hesapTuru, double bakiye, double karOrani) {
        this();
        this.hesapSahibi = hesapSahibi;
        this.hesapNo = hesapNo;
        this.paraBirimi = paraBirimi;
        this.subeAdresi = subeAdresi;
        this.hesapTuru = hesapTuru;
        this.bakiye = bakiye;
        this.karOrani = karOrani;

    }






    static int musteriSayisi = 0;
    String bankAdi;
    boolean hesapAktifMi;
    String hesapSahibi;
    int hesapNo;
    String paraBirimi;
    String subeAdresi;
    String hesapTuru;
    double bakiye;
    double karOrani;

    public void paraYatir() {

    }

    public void paraCek() {

    }

}
