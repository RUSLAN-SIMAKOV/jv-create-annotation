package model;

public class Bet {

    private int value;
    private double risk;

    public Bet(int value, double risk) {
        this.value = value;
        this.risk = risk;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }

    public void setRisk(double risk) {
        this.risk = risk;
    }

    public double getRisk() {
        return risk;
    }

    @Override
    public String toString() {
        return "Bet is:{ " + "value - " + value + ", risk - " + risk + "}";
    }
}
