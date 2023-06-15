package Inheritances.Bank;

public class AXIS extends Bank{

    public AXIS(String name, String address, float rateOfInterest) {
        super(name, address, rateOfInterest);
    }

    @Override
    public float getRateOfInterest() {
        return super.getRateOfInterest();
    }

    @Override
    public float setRateOfInterest(float rateOfInterest) {
        float  rate = (float) (rateOfInterest*0.9);
        return rate;
    }
}
