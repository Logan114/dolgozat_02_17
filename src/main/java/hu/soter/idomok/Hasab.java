package hu.soter.idomok;

public class Hasab {
    private double magassag,a,b;

    public Hasab(double magassag, double a, double b) {
        this.magassag = magassag;
        this.a = a;
        this.b = b;
    }
    public double terfogatHasab(){
        return a*b*magassag;
    }

    public double getM() {
        return magassag;
    }

    public double getA() {
        return a;
    }

    public double getB() {
        return b;
    }


}
