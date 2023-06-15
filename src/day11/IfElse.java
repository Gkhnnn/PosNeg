package day11;

public class IfElse {
    public static void main(String[] args) {
       /* int i = 4;
        int i2 = 4;
        if (i != i2) {
            System.out.println("H");
        } else {
            System.out.println("K");
        }

        */
        double balance = 120;
        int score = 8;
        if (score >= 8) {

            balance = balance + 50;
           // System.out.println("balance = " + balance);
        }


        if (score > 6) {
            balance = balance + 20;
            //System.out.println("balance = " + balance);
        }
        else{
            balance = balance - 10;
           // System.out.println("balance = " + balance);

        }
        System.out.println(balance);


    }
}
