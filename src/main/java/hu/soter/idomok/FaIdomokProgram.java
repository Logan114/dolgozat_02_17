package hu.soter.idomok;

public abstract class FaIdomokProgram {
    static double fajsuly = 0.8;
    public double terfogat,suly;

    public FaIdomokProgram(double fajsuly) {
        this.fajsuly = fajsuly;
    }

    public FaIdomokProgram(double terfogat, double suly) {
        this.terfogat = terfogat;
        this.suly = suly;
    }

    public FaIdomokProgram() {
    }

    public FaIdomokProgram(double fajsuly, double terfogat, double suly) {
        this.fajsuly = fajsuly;
        this.terfogat = terfogat;
        this.suly = suly;
        fajsuly=0.8;

    }

    public static double getFajsuly() {
        return fajsuly;
    }


    public double suly() {
        return getFajsuly();
    }


}

