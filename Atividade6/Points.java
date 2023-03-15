package Atividade6;

public class Points {
    private double x;
    private double y;
    private Circle circum;
    private double distance;

    public Points(int a, int b, int c, Circle circum) {
        Bhaskara bhask = new Bhaskara(a, b, c);
        this.x = bhask.getR1();
        this.y = bhask.getR2();
        this.circum = circum;
        this.distance = calculateDistance();
    }
    //Getters:
    public Circle getCircum() {
        return circum;
    }
    public double getDistance() {
        return distance;
    }
    public double getX() {
        return x;
    }
    public double getY() {
        return y;
    }
    private double calculateDistance() {
        double x2 = this.circum.getXc();
        double y2 = this.circum.getYc();
        return (Math.sqrt(Math.pow((x2-this.x), 2) + Math.pow((y2-this.y), 2)));
    }
    

}

