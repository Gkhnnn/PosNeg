package day14;

public class Aylar {
    public static void main(String[] args) {
        int aySiraNo = 5;
        String ayAdi = "";
        switch (aySiraNo) {
            case 1:
                ayAdi = "Ocak";
                break;
            case 2:
                ayAdi = "Subat";
                break;
            case 3:
                ayAdi = "Mart";
                break;
            case 4:
                ayAdi = "Nisan";
                break;
            case 5:
                ayAdi = "Mayis";
                break;
            case 6:
                ayAdi = "Haziran";
                break;
            case 7:
                ayAdi = "Temmuz";
                break;
            case 8:
                ayAdi = "Agustos";
                break;
            case 9:
                ayAdi = "Eylul";
                break;
            case 10:
                ayAdi = "Ekim";
                break;
            case 11:
                ayAdi = "Kasim";
                break;
            case 12:
                ayAdi = "Aralik";
                break;
            default:
                System.out.println("aradiginiz ay bulunamadi");
        }
        System.out.println("aylardan " + ayAdi);
        String mevsim = "";
        switch (ayAdi) {
            case "Ocak":
            case "Aralik":
            case "Subat":
                mevsim = "Kis ayindayiz";
                break;
            case "Mart":
            case "Nisan":
            case "Mayis":
                mevsim = "Bahar ayindayiz";
                break;
            case "Haziran":
            case "Temmuz":
            case "Agustos":
            case "Eylul":
                mevsim = "Yaz ayindayiz";
                break;
            case "Ekim":
            case "Kasim":
                break;
            default:
                System.out.println("aylar bitti");
        }
        System.out.println("mevsim = " + mevsim);

    }
}
