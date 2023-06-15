package Banka;

public class TestA {

    public static void main(String[] args) {

        Akbank gokhanSaving = new Akbank(1130, "gold");
        System.out.println("gokhanSaving.getCurrentBalance() = " + gokhanSaving.getCurrentBalance());
        System.out.println("gokhanSaving.getDepositBonus() = " + gokhanSaving.getDepositBonus());

        gokhanSaving.deposit(1000);
        gokhanSaving.deposit(2000);
        gokhanSaving.withdraw(500);
        gokhanSaving.withdraw(1000);
        gokhanSaving.withdraw(10000);
    }

}
