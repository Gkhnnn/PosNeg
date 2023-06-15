package Banka;

public class Akbank extends Bank {

    public Akbank(double currentBalance, String accountType) {
        super(currentBalance + 120, accountType);
        switch (getAccountType()) {
            case "GOLD":
                setDepositBonus(80);
                setWithdrawExpence(70);
                setReturnRate(1.3);
                break;
            case "SAVING":
                setDepositBonus(90);
                setWithdrawExpence(60);
                setReturnRate(1.2);
                break;
            case "INTERESET":
                setDepositBonus(100);
                setWithdrawExpence(50);
                setReturnRate(1.1);
                break;
            default:
                System.out.println("Gecersiz Hesap Turu!!!!");
                break;
        }
    }

    @Override
    public void deposit(double depositValue) {
        if (depositValue < 2000) {
            super.deposit(depositValue);
        } else {
            super.deposit(depositValue + getDepositBonus());
        }
    }

    @Override
    public void withdraw(double withdrawValue) {
        if (withdrawValue < 1000) {
            super.withdraw(withdrawValue);
        } else if (getCurrentBalance() < withdrawValue + getWithdrawExpence()) {
            System.out.println("Yetersiz Bakiye!!");
        } else {
            super.withdraw(withdrawValue + getWithdrawExpence());
        }
        // super.withdraw(withdrawValue);
    }
}
