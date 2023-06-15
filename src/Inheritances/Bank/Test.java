package Inheritances.Bank;

import java.util.ArrayList;

public class Test {
    public static void main(String[] args) {

        SBI sb1 = new SBI("SBI", "GERMANY", 1200);
        AXIS axis1 = new AXIS("AXIS", "ITALY", 12000);
        ICICI icici1 = new ICICI("AXIS","ENGLAND",4500);


        ArrayList<Bank> banks = new ArrayList<>();
        banks.add(sb1);
        banks.add(axis1);
        banks.add(icici1);

        for (int i = 0; i <banks.size() ; i++) {
            System.out.println(banks.getClass().getSimpleName().toUpperCase() + "-");
            System.out.println(banks.get(i));
            System.out.println(banks.get(i).setRateOfInterest(4500));
        }
    }
}
