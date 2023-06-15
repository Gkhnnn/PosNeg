package randomMathDate;

import java.util.Random;

public class C02_Random1To10SayiSec {
    public static void main(String[] args) {
        do {
            Random rnd = new Random();
            int number = rnd.nextInt(1,11);
            if(number!=3){
                System.out.println("next number= "+number);
            } else if (number==3) {
                System.out.println("next number= "+number);
                break;
            }

        }while(true);




    }

}
