package alistirmalar2;

public class DoWhileLoopTamKare {
    public static void main(String[] args) {
        int input = 36;
        int karakok = 1;
        boolean sonuc = false;
        do {
           if(karakok*karakok==input){
               sonuc= true;
               System.out.println(sonuc);
               break;
           }else{
               karakok++;
           }
        }while (karakok*karakok<=input);
        System.out.println(karakok);
    }
}
