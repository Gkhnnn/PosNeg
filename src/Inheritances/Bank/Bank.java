package Inheritances.Bank;

public class Bank {
    String name;
    String Address;
    private float rateOfInterest;

    public Bank(String name, String address, float rateOfInterest) {
        this.name = name;
        Address = address;
        this.rateOfInterest = rateOfInterest;
    }

    @Override
    public String toString() {
        return "Bank{" +
                "name='" + name + '\'' +
                ", Address='" + Address + '\'' +
                '}';
    }

    public float getRateOfInterest() {
        return rateOfInterest;
    }

    public float setRateOfInterest(float rateOfInterest) {
        this.rateOfInterest = rateOfInterest;
        return rateOfInterest;
    }
}

