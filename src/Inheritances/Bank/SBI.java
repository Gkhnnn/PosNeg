package Inheritances.Bank;

public class SBI extends Bank{
    public SBI(String name, String address, float rateOfInterest) {
        super(name, address, rateOfInterest);
    }

    @Override
    public float getRateOfInterest() {
        return super.getRateOfInterest();
    }

    @Override
    public float setRateOfInterest(float rateOfInterest) {
        float rate = (float) (rateOfInterest * 0.7);
        return rate;
    }
}
