package BankExample;

public class BankProgram {
    public static void main(String[] args) {
        Musteri musteri1 = new Musteri();
        musteri1.showInfo();
        Musteri musteri2 = new Musteri("Ahmet can ",123456);
        musteri2.showInfo();
        Musteri musteri3 = new Musteri("Mehmet Can", 234456,343757,07353,4.500);
        musteri3.showInfo();
        Bank bank = new Bank("Hsbc.Bank","London/England");
        bank.musteriEkle(musteri3);
        bank.musteriEkle(musteri2);
        bank.musteriEkle(musteri1);

        bank.paraCek(musteri3, 5000);
        bank.paraCek(musteri2, 100);

        bank.showInfo();

    }

}
