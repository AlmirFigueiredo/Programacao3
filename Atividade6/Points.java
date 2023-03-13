package Atividade6;

public class Points {
    private double x1;
    private double y1;
    private double x2;
    private double y2;
    private double distance;

    public Points(int a, int b, int c, int y1, int y2) {
        Bhaskara calculateRoots = new Bhaskara(a, b, c);
        this.x1 = calculateRoots.getR1();
        this.x2 = calculateRoots.getR2();
        this.y1 = y1;
        this.y2 = y2;
        this.distance = calculateDistance();
    }
    private double calculateDistance() {
        return Math.sqrt(Math.pow((this.x2 - this.x1),2) + Math.pow((this.y2 - this.y1), 2));
    }
    //Getters:
    public double getX1() {
        return x1;
    }
    public double getX2() {
        return x2;
    }
    public double getY1() {
        return y1;
    }
    public double getY2() {
        return y2;
    }
    public double getDistance() {
        return distance;
    }


}
