package day12;

import java.util.Scanner;

public class IfElse {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen bir sayı giriniz ");
        int gunNo = scan.nextInt();

       /* if (gunNo==1){
            System.out.println("pazartesi");
        }else if (gunNo==2){
            System.out.println("salı");
        } else if (gunNo==3) {
            System.out.println("Carsamba");
        } else if (gunNo==4) {
            System.out.println("persembe");
        } else if (gunNo==5) {
            System.out.println("Cuma");
        } else if (gunNo==6) {
            System.out.println("c.tesi");
        } else if (gunNo==7) {
            System.out.println("pazar");
        }else {
            System.out.println("böyle bir gün yok");
        }

        */
        switch (gunNo){
            case 1:
                System.out.println("Pazartesi");
                break;
            case 2:
                System.out.println("Salı");
                break;
            case 3:
                System.out.println("Carsamba");
                break;
            case 4:
                System.out.println("Persembe");
                break;
            case 5:
                System.out.println("cuma");
                break;
            case 6:
                System.out.println("C.tesi");
                break;
            case 7:
                System.out.println("Pazar");
                break;
            default:
                System.out.println("gun yok");
        }

    }
}
