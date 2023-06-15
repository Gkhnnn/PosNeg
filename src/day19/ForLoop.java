package day19;

public class ForLoop {
    public static void main(String[] args) {
        // 1 den 100 e kadar olan tamsayıları toplayın.

        int toplam = 0;
        for (int i = 1; i <=100; i++) {
            toplam +=i;
        }
        System.out.println("toplam = " + toplam);

        int bas =20;
        int bitis = 61;
        for (int i = bas; i <bitis ; i+=3) {
            System.out.print(i + "  ");
        }
        System.out.println("*********************");


        int input = 100;
        int son = 1;
        for (int i = input; i >=son ; i--) {
            if(i%3==0){
                System.out.print(i + " ");
            }
        }
    }
}
