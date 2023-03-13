package Atividade6;

public class Bhaskara {
    private double a;
    private double b;
    private double c;
    private double delta;
    private double r1;
    private double r2;

    public Bhaskara(int _a, int _b, int _c) {
        this.a = _a;
        this.b = _b;
        this.c = _c;
        calculateDelta();
        calculateR1();
        calculateR2();
    }
    private void calculateDelta() {
        this.delta = (Math.pow(this.b, 2) - 4*(this.a * this.c));
    }
    private void calculateR1() {
        this.r1 = ((-this.b - Math.sqrt(this.delta))/2*this.a);
    }
    private void calculateR2() {
        this.r2 = ((-this.b + Math.sqrt(this.delta))/2*this.a);
    }



}
