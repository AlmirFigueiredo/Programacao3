package Atividade6;

public class Points {
    private double x;
    private double y;
    private Circle circum;
    private double distance;
    private boolean isEqual;
    private boolean isRBigger;
    private boolean isRSmaller;
    private boolean isPointInCircle;

    public Points(double a, double b, double c, Circle circum) {
        Bhaskara bhask = new Bhaskara(a, b, c);
        this.x = bhask.getR1();
        this.y = bhask.getR2();
        this.circum = circum;
        this.distance = calculateDistance();
        compare();
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
    public boolean getIsEqual() {
        return this.isEqual;
    }
    public boolean getIsRBigger() {
        return this.isRBigger;
    }
    public boolean getIsRSmaller() {
        return this.isRSmaller;
    }
    public boolean getIsPointInCircle() {
        return this.isPointInCircle;
    }
    private double calculateDistance() {
        double x2 = this.circum.getXc();
        double y2 = this.circum.getYc();
        return (Math.sqrt(Math.pow((x2-this.x), 2) + Math.pow((y2-this.y), 2)));
    }
    private void compare() {
        this.isEqual = this.distance == this.circum.getR();
        this.isRBigger = this.circum.getR() > this.circum.getR();
        this.isRSmaller = this.circum.getR() < this.circum.getR();
        this.isPointInCircle = this.distance <= this.circum.getR();
    }
    
}

