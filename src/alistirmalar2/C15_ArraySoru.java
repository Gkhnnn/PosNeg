package alistirmalar2;

public class C15_ArraySoru {
    public static void main(String[] args) {
        int[] sayilar = {13, 7, 19, -3, -11, -50};
        int sayilarToplami = pozitifSayilariTopla(sayilar);
        System.out.println("sayilarToplami = " + sayilarToplami);

    }

    public static int pozitifSayilariTopla(int[] arry) {
        int total = 0;
        for (int i = 0; i < arry.length; i++) {
            if(arry[i]>0){
                total+=arry[i];
            }
        }
        return total;
    }
}
