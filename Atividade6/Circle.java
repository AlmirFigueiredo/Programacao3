package Atividade6;

public class Circle {
    private double xc;
    private double yc;
    private double r;

    public Circle(double r, double a, double b, double c) {
        Bhaskara bhask = new Bhaskara(a, b, c);
        this.xc = bhask.getR1();
        this.yc = bhask.getR2();
        this.r = r;
    }
    public double getXc() {
        return xc;
    }
    public double getYc() {
        return yc;
    }
    public double getR() {
        return r;
    }
    
    
}
