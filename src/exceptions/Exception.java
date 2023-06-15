package exceptions;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class Exception {
    public static void main(String[] args) {

        File file = new File("src/exceptions/Data.txt");
        Scanner satirOku = null;
        ArrayList<Integer> sayilar = new ArrayList<>();
        int sayi;
        try{
            satirOku =new Scanner(file);
            while (satirOku.hasNextLine()){
                String satir = satirOku.nextLine();
                System.out.println("Okunan Satır : " + satir);
                try{
                    sayi = Integer.parseInt(satir);
                    sayilar.add(sayi);
                    System.out.println("Okunan satır ıntegere çevirildi ve ArrayList'e eklendi.");
                }catch (NumberFormatException numberFormatException){
                    System.out.println("Okunan satır integere çevrilemedi.");
                    System.out.println("Sonraki satırla ilgili işleme devam ediliyor.");
                }
            }


        }catch (FileNotFoundException fileNotFoundException){
            System.out.println("Dosya sistem de bulunamadı.");
            throw new RuntimeException(fileNotFoundException);
        }
        System.out.println("-----------------------------------");
        System.out.println(sayilar);
    }
}
