package day14;

public class day14 {
    public static void main(String[] args) {
        String kitapAdi ="Suc ve Ceza";
        switch (kitapAdi){
            case "Suc ve Ceza":
                kitapAdi = "Dostoyevski";
                System.out.println("yazari Dostoyevski");
                break;
            case "Sinekli Bakkal":
                System.out.println("yazari Halide Edip Adıvar");
                kitapAdi="Halide Edip Adıvar";
                break;
            case "Goriot Baba":
            case "Vadideki Zambak":
                kitapAdi="Balzac";
                System.out.println("Balzac");
                break;
            case "pembe incilli kaftan":
                kitapAdi="ömer seyfettin";
                System.out.println("yazar adi ömer seyfettin");
                break;
            case "İki sehrin hikayesi ":
                kitapAdi="Charles dickins";
                System.out.println("kitabin adı charles deckins");
                break;
            default:
                System.out.println("kitap adı yok.");


        }
        System.out.println("kitapAdi = " + kitapAdi);
    }
}
