package Banka;

public class Karabank extends Bank {
    public Karabank(double currentBalance, String accountType) {
        super(currentBalance + 100, accountType);
        switch (getAccountType()) {
            case "GOLD":
                setDepositBonus(80);
                setWithdrawExpence(90);
                setReturnRate(1.4);
                break;
            case "SAVING":
                setDepositBonus(100);
                setWithdrawExpence(70);
                setReturnRate(1.1);
                break;
            case "INTERESET":
                setDepositBonus(90);
                setWithdrawExpence(80);
                setReturnRate(1.2);
                break;
            default:
                System.out.println("Gecersiz Hesap Turu!!!!");
                break;
        }
    }

    public void deposit(double depositValue) {
        if (depositValue < 3000) {
            super.deposit(depositValue);
        } else {
            super.deposit(depositValue + getDepositBonus());
        }
    }

    public void withdraw(double withdrawValue) {
        if (withdrawValue < 2000) {
            super.withdraw(withdrawValue);
        } else if (getCurrentBalance() < withdrawValue + getWithdrawExpence()) {
            System.out.println("Yetersiz Bakiye!!");
        } else {
            super.withdraw(withdrawValue + getWithdrawExpence());
        }
        // super.withdraw(withdrawValue);
    }
}
