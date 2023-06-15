package alistirmalar1;

public class PosNeg {
    public static void main(String[] args) {
        int a =  1;
        int b = -3;
        boolean c= true;
        boolean  sonuc;
        if (c){
            if(a<0&&b<0){
                System.out.println(true);
                sonuc =true;
            }else{
                if((a<0&&b>0)||(a>0&&b<0)){
                    System.out.println(true);
                    sonuc = true;
                }
            }
        }
    }
}
