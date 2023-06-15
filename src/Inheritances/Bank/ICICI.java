package Inheritances.Bank;

public class ICICI extends Bank {
    public ICICI(String name, String address, float rateOfInterest) {
        super(name, address, rateOfInterest);
    }

    @Override
    public float getRateOfInterest() {
        return super.getRateOfInterest();
    }

    @Override
    public float setRateOfInterest(float rateOfInterest) {
        float rate = (float) (rateOfInterest*0.8);
        return rate;
    }
}
