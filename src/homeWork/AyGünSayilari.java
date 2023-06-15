package homeWork;

public class AyGünSayilari {
    public static void main(String[] args) {
        int ayGünSayisi = 0;
        int ay = 2;
        String AyAdi= "ocak";
        switch (ay) {
            case 1:
               AyAdi = "ocak";
               break;
            case 3:
                AyAdi ="mart";
                break;
            case 5:
                AyAdi="mayıs";
                break;
            case 7:
                AyAdi="temmuz";
                break;
            case 8:
                AyAdi="agustos";
                break;
            case 10:
                AyAdi="ekim";
                break;
            case 12:
                AyAdi="aralık";
                ayGünSayisi = 31;
                break;
            case 2:
                AyAdi="şubat";
                ayGünSayisi =28;
                break;
            case 4:
                AyAdi="nisan";
                break;
            case 6:
                AyAdi="haziran";
                break;
            case 9:
                AyAdi="eylül";
                break;
            case 11:
                AyAdi="kasım";
                ayGünSayisi = 30;
                break;

        }
        System.out.println("ayGünSayisi = " + ayGünSayisi);
        System.out.println("AyAdi = " + AyAdi);

    }
}
