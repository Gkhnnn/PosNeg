package Banka;

public class Bank {
    private double currentBalance;
    private String accountType;
    boolean isAccountClosed = true;

    private double depositBonus;
    private double withdrawExpence;
    private double returnRate;


    public Bank(double currentBalance, String accountType) {
        if (currentBalance < 0) {
            System.out.println("Balance negative deger OLAMAZ! Balance sifirlandı!!");
            this.currentBalance = 0;
        } else {
            this.currentBalance = currentBalance;
            this.accountType = accountType.toUpperCase();
        }
        System.out.println(getClass().getSimpleName() + "'a HOSGELDİNİZ!!\nHesap Turu: " + this.accountType);
        this.isAccountClosed = false;


    }

    /**
     * bu methods para yatırma işlemleri içinidir. currenctBalance günceller.
     *
     * @param depositValue bu variable yatıralacak para miktarıdır.
     */
    public void deposit(double depositValue) {
        if(depositValue<0){
            System.out.println("INVALID DEPOSİT VALUE!! Please check your input!");
        }else{
            setCurrentBalance(getCurrentBalance()+depositValue);
            System.out.println("Hesabınıza "+ depositValue+ " para eklenmiştir.\nMevcut Balance: "+getCurrentBalance());
        }
    }
    public void withdraw(double withdrawValue){
        if(withdrawValue<0){
            System.out.println("INVALID WITHDRAW VALUE!! Please check your input!");
        }else if(getCurrentBalance()<withdrawValue) {
            System.out.println("Yetersiz Bakiye!!");
        }else {
                setCurrentBalance(getCurrentBalance()-withdrawValue);
                System.out.println("Hesabınıza "+ withdrawValue+ " para cekilmiştir.\nMevcut Balance: "+getCurrentBalance());
            }
        }


    public double getCurrentBalance() {
        return currentBalance;
    }

    public void setCurrentBalance(double currentBalance) {
        this.currentBalance = currentBalance;
    }

    public String getAccountType() {
        return accountType;
    }

    public void setAccountType(String accountType) {
        this.accountType = accountType;
    }

    public double getDepositBonus() {
        return depositBonus;
    }

    public void setDepositBonus(double depositBonus) {
        this.depositBonus = depositBonus;
    }

    public double getWithdrawExpence() {
        return withdrawExpence;
    }

    public void setWithdrawExpence(double withdrawExpence) {
        this.withdrawExpence = withdrawExpence;
    }

    public double getReturnRate() {
        return returnRate;
    }

    public void setReturnRate(double returnRate) {
        this.returnRate = returnRate;
    }


}
