package alistirmalar1;

import java.util.Scanner;

public class IndexOf {
    public static void main(String [] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Lütfen bir kelime yazın.");
        String str = scan.nextLine();

        // sınavlarımızda coktan secmelı sorular kullanıyoruz
        // javayı cok sevıyoruz
        // bu kadar coklu secenek olur mu ?

      if(!str.contains("cok")){
          System.out.println("str'da cok ile baslayan bir cumle yok.");
      }else{
         int cokIndexi= str.indexOf("cok");
         int boslukIndexi = str.indexOf(" ", cokIndexi+1);
          System.out.println(str.substring(cokIndexi, boslukIndexi));
      }
    }
}
