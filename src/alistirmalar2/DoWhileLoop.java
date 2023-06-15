package alistirmalar2;

public class DoWhileLoop {

    public static void main(String[] args) {
        char baslangic = 'd';
        char bitis = 'm';
        for (char i = 'd'; i <= 'm'; i++) {
            System.out.print(i + " ");
        }
        System.out.println("*************************");
        do {
            System.out.print(baslangic+ " ");
            baslangic = (char) (baslangic+1);


        } while (baslangic<=bitis);
    }
}
